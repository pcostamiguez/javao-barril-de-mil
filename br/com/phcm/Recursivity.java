package br.com.phcm;

public class Recursivity {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("The factorial of " + num + " is " + factorial(num) + ".");
    }
    public static int factorial(int number){
        if(number == 1){
            return 1;
        }else{
            return number * factorial(number - 1);
        }
    }
}
