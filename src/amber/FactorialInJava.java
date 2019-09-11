package amber;

public class FactorialInJava{

    public static void main(String args[]) {

        //finding factorial of a number in Java using recursion - Example
        System.out.println("factorial of 5 using recursion in Java is: " + factorial(5));

        //finding factorial of a number in Java using Iteration - Example
        //System.out.println("factorial of 6 using iteration in Java is: " + fact(6));
    }


    /*
     * Java program example to find factorial of a number using recursion
     * @return factorial of number
     */
    public static int factorial(int number) {

    if ( number==0){
        return number;
    }return number*factorial(number-1);

    }



}

