/**
 * This Main class test the MyStack class
 * @author Danilo Stoilovski
 * @version 2024-02-13
 */
public class Main {
    public static void main(String[] args) {

        //Number Stack initialization
        MyStack<Integer> numbers = new MyStack(5);
        try{
            System.out.println("-----Filling the Array (push)-----");
            //filling the Stack with numbers 1 to 5
            for(int i = 0; i < numbers.getItemsLength(); i++){
                //pushing a number in the Stack
                numbers.push(i+1);
                //printing the content of the Stack array
                System.out.println(numbers.list());
            }
            //testing the stack methods
            Main.testStack(numbers);


        } catch (StackFullException | StackEmptyException e){
            //displaying the error Message
            System.err.println(e.getMessage());
        }

        System.out.println("\n-----String-----\n");

        //String Stack initialization
        MyStack<String> strings = new MyStack(5);
        try{
            //This Line should cause an error Message !!!!!!!!!!!!!!!!!!!!!!!
            //strings.peek();
            System.out.println("-----Filling the Array (push)-----");
            //filling the Stack with numbers 1 to 5
            for(int i = 0; i < strings.getItemsLength(); i++){
                //pushing a number in the Stack
                strings.push((i+1)+"-String");
                //printing the content of the Stack array
                System.out.println(strings.list());
            }
            //This Line should cause an error Message !!!!!!!!!!!!!!!!!!!!!!!
            //strings.push("toMuch");
            //testing the stack methods
            Main.testStack(strings);


        } catch (StackFullException | StackEmptyException e){
            //displaying the error Message
            System.err.println(e.getMessage());
        }
    }

    /**
     * This methode test the MyStack methods
     * @param stack stands for the over-given stack
     * @throws StackEmptyException gets thrown by the peek method
     * @throws StackFullException gets thrown by pop and method
     */
    private static void testStack(MyStack stack) throws StackEmptyException, StackFullException{
        System.out.println("-----Testing the pop Method-----");
        //getting the last element
        System.out.println("Last added (top element) element: " + stack.pop());
        //displaying the content of the Stack
        System.out.println("Updated Stack: " + stack.list());
        System.out.println("-----Testing the peek Method-----");
        //printing the last element of the Stack
        System.out.println("Last added (top element) element: " + stack.peek());
        System.out.println("Updated Stack: " + stack.list());
    }
}