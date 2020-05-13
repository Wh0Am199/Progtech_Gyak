package Exceptions;

/**
 *
 * @author Bárdos Bálint
 */
public class TooPowerfulGPUException extends Exception {
    public TooPowerfulGPUException(String errorMessage){
        super(errorMessage);
    }
}
