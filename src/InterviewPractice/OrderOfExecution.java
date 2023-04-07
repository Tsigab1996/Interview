package InterviewPractice;

public class OrderOfExecution {

     public OrderOfExecution(){
         System.out.println("This is the constructor for the order of execution");
     }

    static {
        System.out.println("This is a static block");
    }
    {
        System.out.println("This is not static block or simply it is init block");
    }
    public static void main(String[] args) {

         OrderOfExecution a= new OrderOfExecution();
        System.out.println("This is the main method");
    }
}
