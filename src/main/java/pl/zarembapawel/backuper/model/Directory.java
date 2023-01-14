package pl.zarembapawel.backuper.model;

import java.util.List;

public class Directory extends Element {

    private List<Directory> subdirectories;

    private List<FileData> files;


    public Directory(String name, String path) {
        super(name, path);
    }

    public List<Directory> getSubdirectories() {
        return subdirectories;
    }

    public void setSubdirectories(List<Directory> subdirectories) {
        this.subdirectories = subdirectories;
    }

    public List<FileData> getFiles() {
        return files;
    }

    public void setFiles(List<FileData> files) {
        this.files = files;
    }
}
