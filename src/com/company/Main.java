package com.company;

public class Main {

    public static void main(String[] args) {
        sort();
        sum();
        avg();
        duplicate();
    }


    public static void sort() {
        int myArray[] = {2, 3, 1, 7, 11};
        int temp;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]){
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    System.out.print( "Sorted by decrease = ");
    for (int i : myArray) {
        System.out.print(i + " ");
    }
        System.out.println("");
    }


    private static void sum() {
        int myArray[] = {-5, -2, -1, 2, 3, 7, 11};
        int summ = 0;
        for (int i = 0; i < myArray.length; i++) {
            if ( i > 0 ) {
                summ += myArray[i];
            }
        }
        System.out.println("Sum = "+ summ);
    }

    public static void avg() {
        int myArray[] = {2, 3, 1, 7, 11};
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            avg = sum/myArray[i];
        }
        System.out.println("Avarage = "+ avg);
    }

    public static void duplicate() {
        int myArray[] = {3, 2, 3, 1, 4, 2, 8, 3};
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]){
                    myArray[j] = 0;
                }
            }
        }
        System.out.print("Duplicates =  ");
        for(int i : myArray) {
            System.out.print(i + " ");
        }
    }

}
