import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number to print the sum of all its natural numbers: ");

        Scanner sc = new Scanner(System.in);

        long userInput = sc.nextLong();

        System.out.println("The result is: " + sumOfNaturalNumbersIterative(userInput));
        System.out.println("The result is: " + sumOfNaturalNumbersRecursive(userInput));
    }

    public static long sumOfNaturalNumbersIterative(long number){
        int sum = 0;

        for(int i = 1; i <= number; ++i){
            sum += i;
        }
        return sum;
    }
    public static long sumOfNaturalNumbersRecursive(long number){
        if (number != 0){
            return number + sumOfNaturalNumbersRecursive(number - 1);
        }
        else{
            return number;
        }
    }
}