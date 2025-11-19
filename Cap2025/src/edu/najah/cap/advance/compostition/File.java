package edu.najah.cap.advance.compostition;

public class File implements FileSystem {
    private final int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
