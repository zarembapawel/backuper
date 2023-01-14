package pl.zarembapawel.backuper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zarembapawel.backuper.enums.GroupType;
import pl.zarembapawel.backuper.model.Group;

@Service
public class BackuperService {

    private final InitService initService;

    private final FileService fileService;

    @Autowired
    public BackuperService(InitService initService, FileService fileService) {
        this.initService = initService;
        this.fileService = fileService;
    }

    public void runAction() {
        fileService.getDirectoriesAndFiles("C:\\Projects");
        Group source = initService.iniGroup(GroupType.SOURCE);
        Group destination = initService.iniGroup(GroupType.DESTINATION);
    }
}
