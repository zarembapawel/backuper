package pl.zarembapawel.backuper.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.zarembapawel.backuper.enums.GroupType;
import pl.zarembapawel.backuper.model.Group;

import java.util.Scanner;

@Service
public class InitService {

    static Logger logger = LoggerFactory.getLogger(InitService.class);

    public Group iniGroup(GroupType type) {
        String path = getPath(type);
        if(!pathExist(path)) {
            logger.error("Path {} don't exits!", path);
            return iniGroup(type);
        }
        return new Group(type, path);
    }

    private String getPath(GroupType type) {
        Scanner input = new Scanner(System.in);
        logger.info("Pass {} directory: ", type);
        return input.nextLine();
    }

    private boolean pathExist(String path) {
        return true;
    }
}
