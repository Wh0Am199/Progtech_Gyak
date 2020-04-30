package Exceptions;

/**
 *
 * @author Bárdos Bálint
 */
public class InvalidPSUException extends Exception {
    public InvalidPSUException(String errorMessage){
        super(errorMessage);
    }
}
