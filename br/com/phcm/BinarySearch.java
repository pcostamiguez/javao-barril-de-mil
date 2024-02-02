package br.com.phcm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int num = 19;
        System.out.println("The array index that corresponds to the number "+ num +" is: " + search(arr, num));
    }

    public static int search(int[] arr, int needle){
        int min = 0;
        int max = arr.length - 1;

        while(min <= max){
            int avg = (min + max) / 2;
            int guess = arr[avg];

            if(guess == needle){
                return avg;
            }else if(guess > needle){
                max = avg - 1;
            }else{
                min = avg + 1;
            }
        }
        return -1;
    }
}
