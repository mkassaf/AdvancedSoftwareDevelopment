package edu.najah.cap.file;

public class FilerReaderDemo {
	//Filer reader that reads pdf and txt.
	//filepath 
	//get binary data
	//convert as text ;
	
	public void readFile(FileReader fileReader, String filePath) {
		String lines = fileReader.getContent(filePath);
	}
	
	
	int main() {
		
		FileReader pdfFile = new PDFFileReader();
		FileReader txtFile = new TxtFileReader();
		readFile(pdfFile, "");
		readFile(txtFile, "");
		return 0;
	}
	
	

}
