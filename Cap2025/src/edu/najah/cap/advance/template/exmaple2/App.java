package edu.najah.cap.advance.template.exmaple2;

import edu.najah.cap.advance.template.exmaple2.myFile.File;
import edu.najah.cap.advance.template.exmaple2.myFile.Pdf;
import edu.najah.cap.advance.template.exmaple2.myFile.Xml;

public class App {

    public static void main(String[] args) {
        File xml = new Xml();

        xml.proccess();

        File pdf = new Pdf();

        pdf.proccess();



    }
}
