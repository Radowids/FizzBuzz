package pl.programujodpodstaw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        System.out.println(fizzBuzz(number));
    }

    public static String fizzBuzz(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        }else{
            return String.valueOf(number);
        }
    }
}