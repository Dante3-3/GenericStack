
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
            System.out.println("-----Testing the pop Method-----");
            //getting the last element
            System.out.println("Last added (top element) element: " + numbers.pop());
            //displaying the content of the Stack
            System.out.println("Updated Stack: " + numbers.list());
            System.out.println("-----Testing the peek Method-----");
            //printing the last element of the Stack
            System.out.println("Last added (top element) element: " + numbers.peek());
            System.out.println("Updated Stack: " + numbers.list());

        } catch (StackFullException | StackEmptyException e){
            //displaying the error Message
            System.err.println(e.getMessage());
        }

        //String Stack initialization
        MyStack<String> strings = new MyStack(5);
    }
}