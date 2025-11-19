package edu.najah.cap.advance.compostition;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {

    private List<FileSystem> fileSystems = new ArrayList<>();

    @Override
    public int getSize() {
        int sum = 1;
        for (FileSystem fileSystem: fileSystems){
            sum += fileSystem.getSize();
        }
        return sum;
    }


    public void addFile(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }
}
