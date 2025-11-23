package edu.najah.cap.advance.compostition.exmaple1;

public class LeafNode implements FileNode {
    private int size;

    public LeafNode(int size) {
        this.size = size;
    }


    @Override
    public int getSize() {
        return size;
    }
}
