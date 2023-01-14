package pl.zarembapawel.backuper.model;

import java.util.List;

public class Directory extends Element {

    private List<Directory> subdirectories;

    private List<File> files;


    public List<Directory> getSubdirectories() {
        return subdirectories;
    }

    public void setSubdirectories(List<Directory> subdirectories) {
        this.subdirectories = subdirectories;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
