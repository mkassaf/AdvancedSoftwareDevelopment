package edu.najah.cap.advance.compostition.exmaple1;

import java.util.ArrayList;
import java.util.List;

public class FolderCompositeNode implements FileNode {

    private final List<FileNode> files = new ArrayList<>();

    /**
     * Sum of size of files list
     * @return file size for sub files.
     */
    @Override
    public int getSize() {
        int size = 1;

        for (FileNode fileNode: files){
            size += fileNode.getSize();
        }

        return size;
    }


    public void addFile(FileNode fileNode) {
        this.files.add(fileNode);
    }
}
