package pl.zarembapawel.backuper.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.zarembapawel.backuper.model.Directory;
import pl.zarembapawel.backuper.model.FileData;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FileService {

    static Logger logger = LoggerFactory.getLogger(FileService.class);

    public Directory getDirectoriesAndFiles(String path) {
        File root = new File(path);
        Directory directory = new Directory(root.getName(), path);
        directory.setSubdirectories(getSubdirectories(root));
        directory.setFiles(getFiles(root));
        return directory;
    }

    public List<Directory> getSubdirectories(File root) {
        List<Directory> subdirectories = new ArrayList<>();
        for(File file : Arrays.asList(root.listFiles())) {
            try {
                if(file.isDirectory()) {
                    logger.info("Adding directory: {} -> {}", file.getName(), file.getPath());
                    subdirectories.add(new Directory(file.getName(), file.getPath()));
                }
            } catch (NullPointerException e) {
                logger.error("Error during reading directory form path {}", root.getPath());
            }
        }
        return subdirectories;
    }

    public List<FileData> getFiles(File root) {
        List<FileData> files = new ArrayList<>();
        for(File file : Arrays.asList(root.listFiles())) {
            try {
                if(file.isFile()) {
                    logger.info("Adding file: {} -> {}", file.getName(), file.getPath());
                    files.add(new FileData(file.getName(), file.getPath()));
                }
            } catch (NullPointerException e) {
                logger.error("Error during reading file form path {}", root.getPath());
            }
        }
        return files;
    }
}
