package Homeworks.Exceptions.Seminar_3;

import java.io.IOException;

public class SaveException extends IOException {

    public SaveException(Exception e) {
        super("Операция сохранения не прошла: ", e);
    }
    
}
