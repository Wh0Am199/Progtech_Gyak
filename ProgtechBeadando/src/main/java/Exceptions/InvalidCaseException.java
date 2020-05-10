package Exceptions;

/**
 *
 * @author Bárdos Bálint
 */
public class InvalidCaseException extends Exception {
    public InvalidCaseException(String errorMessage){
        super(errorMessage);
    }
}
