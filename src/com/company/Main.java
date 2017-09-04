package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	int []array = new int[10];
	Random r = new Random();
	for(int i = 0; i <10; i++){

	    array[i] = r.nextInt(21)-10;
    }
    for (int e : array){System.out.print(e + " ");}
    int a = array[0];
    int b = array[0];
    float c = array[0];
    for (int i = 1; i < 10; i++){
        if(array[i] < a){a = array[i];}
        else if(array[i] > b){b = array[i];}
        c += array[i];
        }
        System.out.println();
        System.out.println("Najmniejszy element to: " + a);
        System.out.println("Największy element to: " + b);
        System.out.println("Srednia arytmetyczna to: " + c/array.length);
    int d = 0;
    int e = 0;
    int f = Math.round(c/array.length);
    for (int i =0; i <10; i++){
        if (array[i] < f){d ++;}
        else if (array[i] > f){e++;}
    }
    System.out.println(d + " elementów tablicy jest mniejszych od średniej arytmetycznej, \n a " + e + " elementów jest większych");
    for(int i = array.length-1; i >= 0; i--){System.out.print(array[i] + " ");}
    System.out.println();


    }
}
