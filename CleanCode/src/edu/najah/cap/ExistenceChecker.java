package edu.najah.cap;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;


public class ExistenceChecker {
	
	private String sourceHost;
	private String sourceId;

	public ExistenceChecker(String sourceHost, String sourceId) {
		this.sourceHost = sourceHost;
		this.sourceId = sourceId;
		
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		boolean exists = new ExistenceChecker(args[1], args[2]).exists(args[0]);
		System.out.println(exists);

	}
	
	public boolean exists(String address) throws UnknownHostException, IOException{
		Splitter sp = Splitter.on('@');
		List<String> splitAddress = sp.splitToList(address);
		if(splitAddress.size() != 2){
			throw new IllegalArgumentException();
		}
		
		Lookup dnsLookup = new Lookup(splitAddress.get(1), "MX");
		Record[] mxRecords = dnsLookup.run();
		
		boolean found = false;
		for(Record record : mxRecords){
			try{
			found |= queryForAddress(((MXRecord)record).getTarget(),address);
			if(found){
				break;
			}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		return found;
		
	}
	
	private boolean queryForAddress(Name target, String address) throws UnknownHostException, IOException {
		Socket socket = new Socket(target.toString(),25);
		PrintStream outputStream = new PrintStream(socket.getOutputStream());
		BufferedReader inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String line = inputStream.readLine();
		if(! line.startsWith("220")){
			throw new IOException(line);
		}
		
		outputStream.println("helo " + sourceHost);
		
		line = inputStream.readLine();
		if(! line.startsWith("250")){
			throw new IOException(line);
		}
		
		outputStream.println("mail from: <"+ sourceId + "@" + sourceHost + ">");
		
		line = inputStream.readLine();
		if(! line.startsWith("250")){
			throw new IOException(line);
		}
		
		outputStream.println("rcpt to: <"+address+">");
		
		boolean found;
		
		if(line.startsWith("250") || line.startsWith("451") || line.startsWith("452")){
			System.out.println("DEBUG: " + line);
			found = true;
		}else{
			found = false;
		}
		
		
		outputStream.println("quit");
		
		socket.close();

		return found;
		
	}

}