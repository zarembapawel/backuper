package pl.zarembapawel.backuper.model;

public class FileData extends Element {

    private Long size;


    public FileData(String name, String path) {
        super(name, path);
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
