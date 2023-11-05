package by.andrukovich.accounting.repository.xml;

import by.andrukovich.accounting.entify.action.ActionLog;
import by.andrukovich.accounting.entify.action.ActionLogMap;

import java.nio.file.Path;

public class ActionXmlRepository extends FileXmlRepository<ActionLog, ActionLogMap>{

    public ActionXmlRepository(Path path) {
        super(path);
    }
}
