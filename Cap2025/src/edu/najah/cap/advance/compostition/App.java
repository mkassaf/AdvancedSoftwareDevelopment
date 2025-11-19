package edu.najah.cap.advance.compostition;

public class App {


    public static void main(String[] args) {

        Folder root = new Folder();

        root.addFile(new File(10));
        root.addFile(new File(4));


        Folder folder1 = new Folder();
        root.addFile(folder1);

        folder1.addFile(new File(8));

        Folder folder2 = new Folder();
        folder2.addFile(new File(7));
        folder2.addFile(new File(9));
        folder2.addFile(new File(2));


        folder1.addFile(folder2);



        folder1.addFile(new File(2));
        System.out.println("Root size: " + root.getSize());

    }
}
