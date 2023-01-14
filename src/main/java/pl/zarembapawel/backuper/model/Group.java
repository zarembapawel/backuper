package pl.zarembapawel.backuper.model;

import pl.zarembapawel.backuper.enums.GroupType;

import java.util.List;

public class Group {

    GroupType type;

    String path;

    List<Directory> directories;


    public Group(GroupType type, String path) {
        this.type = type;
        this.path = path;
    }

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }
}
