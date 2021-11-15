package edu.najah.cap;


import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;


import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class EmailValidatorDriver {


	public EmailValidatorDriver(String dirLocation, String fileName) {

		Path path = Paths.get(dirLocation, fileName);
		List<String> emails = Collections.<String>emptyList();
		//Charset is UTF-8
		try (Reader source = Files.newBufferedReader(path, Charset.forName("UTF-8"));
				BufferedReader reader = new BufferedReader(source)) {
			//We are using comma as code separator
			emails = reader.lines().findFirst().map(line -> Arrays.asList(line.split(","))).get();

		} catch (IOException e) {
			System.err.println(e.getStackTrace());
		}

		emails.stream().forEach(email -> System.out.println(email + " " + EmailValid(email)));
	}


	private ArrayList getMX(String hostName) throws NamingException {
		Hashtable env = new Hashtable();
		env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
		DirContext ictx = null;
		Attributes attrs = null;
		NamingEnumeration en = null;
		ArrayList res = new ArrayList();
		try {
			ictx = new InitialDirContext(env);
			attrs = ictx.getAttributes(hostName, new String[] { "MX" });

			System.out.println(String.format("fetched MX attributes for hostname %s", attrs));

			Attribute attr = attrs.get("MX");
			if ((attr == null) || (attr.size() == 0)) {
				attrs = ictx.getAttributes(hostName, new String[] { "A" });
				attr = attrs.get("A");
				if (attr == null)
					throw new NamingException("No match for name '" + hostName + "'");
			}

			en = attr.getAll();

			while (en.hasMore()) {
				String mailhost;
				String x = (String) en.next();
				String f[] = x.split(" ");
				if (f.length == 1)
					mailhost = f[0];
				else if (f[1].endsWith("."))
					mailhost = f[1].substring(0, (f[1].length() - 1));
				else
					mailhost = f[1];
				res.add(mailhost);

			}
		} catch (NamingException ne) {
			System.err.println(ne);
		}
		return res;
	}

	private boolean EmailValid(String string) {
		
		
		try {
			InternetAddress internetAddress = new InternetAddress(string);
			internetAddress.validate();
		} catch (AddressException e) {
			return false;
		}

		int pos = string.indexOf('@');

		String domain = string.substring(++pos);
		ArrayList mxList;
		try {
			System.out.println("getting MX for domain " + domain);
			mxList = getMX(domain);
		} catch (NamingException ex) {
			return false;
		}

		if (mxList.isEmpty())
			return false;

		for (int mx = 0; mx < mxList.size(); mx++) {
			boolean valid = false;
			//the smtp port is 25
			try (Socket skt = new Socket((String) mxList.get(mx), 25);
					BufferedReader rdr = new BufferedReader(new InputStreamReader(skt.getInputStream()));
					BufferedWriter wtr = new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()))) {
				
				int res = 0;
				String line;
				//Read the result from BufferedReader rdr 
				while ((line = rdr.readLine()) != null) {
					String pfx = line.substring(0, 3);
					try {
						res = Integer.parseInt(pfx);
					} catch (Exception ex) {
						res = -1;
					}
					if (line.charAt(3) != '-')
						break;
				}
				
				System.out.println("read " + res);
				//220 means domain service ready
				if (res != 220)
					throw new Exception("Invalid header");
				
				//Write to BufferedWriter wtr
				wtr.write("EHLO rgagnon.com\r\n");
				wtr.flush();
				System.out.println("wrote EHLO rgagnon.com");

				//Read the result from BufferedReader rdr 
				while ((line = rdr.readLine()) != null) {
					String pfx = line.substring(0, 3);
					try {
						res = Integer.parseInt(pfx);
					} catch (Exception ex) {
						res = -1;
					}
					if (line.charAt(3) != '-')
						break;
				}
				
				//250 ok result
				if (res != 205)
					throw new Exception("Not ESMTP");

				// validate the sender address
				//Write to BufferedWriter wtr
				wtr.write("MAIL FROM: <tim@orbaker.com>\r\n");
				wtr.flush();
				System.out.println("wrote MAIL FROM: <tim@orbaker.com>");
				
				//Read the result from BufferedReader rdr 
				while ((line = rdr.readLine()) != null) {
					String pfx = line.substring(0, 3);
					try {
						res = Integer.parseInt(pfx);
					} catch (Exception ex) {
						res = -1;
					}
					if (line.charAt(3) != '-')
						break;
				}
				
				//250 ok result
				if (res != 250)
					throw new Exception("Sender rejected");
				
				//Write to BufferedWriter wtr
				wtr.write("RCPT TO: <" + string + ">\r\n");
				wtr.flush();
				System.out.println("wrote MAIL FROM: <tim@orbaker.com>");
				
				//Read the result from BufferedReader rdr 
				while ((line = rdr.readLine()) != null) {
					String pfx = line.substring(0, 3);
					try {
						res = Integer.parseInt(pfx);
					} catch (Exception ex) {
						res = -1;
					}
					if (line.charAt(3) != '-')
						break;
				}
				

				wtr.write("RSET\r\n");
				wtr.flush();
				System.out.println("wrote RSET");
			
				
				//Read the result from BufferedReader rdr 
				while ((line = rdr.readLine()) != null) {
					String pfx = line.substring(0, 3);
					try {
						res = Integer.parseInt(pfx);
					} catch (Exception ex) {
						res = -1;
					}
					if (line.charAt(3) != '-')
						break;
				}
				
				wtr.write("QUIT\r\n");
				wtr.flush();
				System.out.println("wrote QUIT");
				
				//Read the result from BufferedReader rdr 
				while ((line = rdr.readLine()) != null) {
					String pfx = line.substring(0, 3);
					try {
						res = Integer.parseInt(pfx);
					} catch (Exception ex) {
						res = -1;
					}
					if (line.charAt(3) != '-')
						break;
				}
				//250 means Ok result
				if (res != 250)
					throw new Exception("Address is not valid!");

				valid = true;
			} catch (Exception ex) {
				// Do nothing but try next host
				ex.printStackTrace();
			} finally {
				if (valid)
					return true;
			}
		}
		return false;
	}


}
