package pl.zarembapawel.backuper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zarembapawel.backuper.enums.GroupType;
import pl.zarembapawel.backuper.model.Group;

@Service
public class BackuperService {

    private final InitService initService;

    @Autowired
    public BackuperService(InitService initService) {
        this.initService = initService;
    }

    public void runAction() {
        Group source = initService.iniGroup(GroupType.SOURCE);
        Group destination = initService.iniGroup(GroupType.DESTINATION);
    }
}
