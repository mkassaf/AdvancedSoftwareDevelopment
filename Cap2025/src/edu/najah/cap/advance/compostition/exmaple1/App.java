package edu.najah.cap.advance.compostition.exmaple1;

public class App {

    public static void main(String[] args) {

        FolderCompositeNode root = new FolderCompositeNode();
        var sub1 = new FolderCompositeNode();
        var sub1sub1 = new FolderCompositeNode();
        var sub2 = new FolderCompositeNode();
        root.addFile(new LeafNode(10));
        root.addFile(sub1);
        root.addFile(sub2);



        sub1.addFile(new LeafNode(10));
        sub1sub1.addFile(new LeafNode(20));
        sub1sub1.addFile(new LeafNode(5));
        sub1.addFile(sub1sub1);
        sub2.addFile(new LeafNode(10));


        System.out.println("Size:: " + root.getSize());

    }
}
