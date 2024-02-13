/**
 * This class represents a Stack with functions that are commonly used
 * for managing a Stack. Those methods are pop, peek and push.
 * @author Danilo Stoilovski
 * @version 2024-02-13
 * @param <T> stands for Type and is a Generic
 */
public class MyStack<T>{
    T[] items;

    /**
     * This method returns the length of the
     * item Array
     * @return the length of the item array
     */
    public int getItemsLength(){
        return this.items.length;
    }

    public MyStack(int fields){
        items = (T[]) new Object[fields];
    }

    public MyStack(){
        this(1);
    }

    public void push(T item) throws StackFullException {
        boolean ifFilled = false;
        for(int i = 0; i < this.items.length; i++){
            if(this.items[i] == null){
                this.items[i] = item;
                ifFilled = true;
                break;
            }
        }
        if(!ifFilled){
            throw new StackFullException("The Stack is full already!");
        }
    }

    public T pop() throws StackEmptyException{
        for(int i = this.items.length-1; i > 0; i--){
            if(this.items[i] != null){
                T temp = this.items[i];
                this.items[i] = null;
                return temp;
            }
        }
        throw new StackEmptyException("The Stack is empty nothing can be returned!");
    }

    public T peek() throws StackEmptyException {
        for(int i = this.items.length-1; i > 0; i--){
            if(this.items[i] != null){
                return this.items[i];
            }
        }
        throw new StackEmptyException("There is now Object on the Index specified");
    }

    public String list(){
        String ausgabe = "";
        for(int i = 0; i < this.items.length-1; i++){
            ausgabe += this.items[i] + "; ";
        }
        ausgabe += this.items[items.length-1];
        return ausgabe;
    }
}