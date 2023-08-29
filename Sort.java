package com.cozentus.array;
import java.util.Arrays;
public class Sort {
	
	public static void main(String [] args) {
	int numarray[] = new int[5];
	numarray[0] = 10;
	numarray[1] = 40;
	numarray[2] = 60;
	numarray[3] = 05;
	numarray[4] = 15;
	
	System.out.println("Numeric Array Elements :");
	System.out.println("");
	System.out.println("Numeric Array Elements before sorting are below :");
	for(int i=0; i<5; i++) {
		System.out.println(numarray[i]);
	}
	System.out.println("");
	System.out.println("The ascending sorted numeric array elements are below :");
	for (int i=0; i<5; i++) {
		for (int j=i+1; j<5; j++) {
			int temp=0;
			if(numarray[i] > numarray[j]){
				temp=numarray[i];
				numarray[i] = numarray[j];
				numarray[j] = temp;
			}
		}
		System.out.println(numarray[i]);
	}
	System.out.println("");
	System.out.println("The descending sorted numeric array elements are below :");
	for (int i=0; i<5; i++) {
		for (int j=i+1; j<5; j++) {
			int temp=0;
			if(numarray[i] < numarray[j]){
				temp=numarray[i];
				numarray[i] = numarray[j];
				numarray[j] = temp;
			}
		}
		System.out.println(numarray[i]);
	}
	
	System.out.println("");
	
	System.out.println("String Array Elements :");
	System.out.println("");
	String stringarr[] = new String[5];
	stringarr[0]= "Gourish";
	stringarr[1]= "Rahul";
	stringarr[2]= "Bablu";
	stringarr[3]= "Shekhar";
	stringarr[4]= "Ayush";
	
	System.out.println("Strings elements before sorting are :"+Arrays.toString(stringarr));
	Arrays.sort(stringarr);
	System.out.println("");
	System.out.println("Strings elements after sorting are :"+Arrays.toString(stringarr));
	}
}