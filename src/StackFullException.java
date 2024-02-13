/**
 * This class defines the Exception StackFullException
 * @author Danilo Stoilovski
 * @version 2024-02-13
 */
public class StackFullException extends Exception{
    /**
     * Constractor
     * @param message defines the error message
     */
    public StackFullException(String message){
        super(message);
    }
}
