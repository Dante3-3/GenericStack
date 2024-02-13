/**
 * This class defines the Exception StackEmptyException
 * @author Danilo Stoilovski
 * @version 2024-02-13
 */
public class StackEmptyException extends Exception{

    /**
     * Constractor
     * @param message defines the message that should be Displayed when the error occurs
     */
    public StackEmptyException(String message){
        super(message);
    }
}
