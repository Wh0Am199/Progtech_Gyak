package Exceptions;

/**
 *
 * @author Bárdos Bálint
 */
public class InvalidMotherboardException extends Exception{
    public InvalidMotherboardException(String errorMessage){
        super(errorMessage);
    }
}
