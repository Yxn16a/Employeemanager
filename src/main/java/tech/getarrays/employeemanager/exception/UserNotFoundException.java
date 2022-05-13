package tech.getarrays.employeemanager.exception;

import java.net.PortUnreachableException;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
