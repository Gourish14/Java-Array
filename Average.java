package com.cozentus.array;

public class Average {
	
	public static void main(String [] args) {
	
	int numarr[] = new int[5];
	numarr[0] = 200;
	numarr[1] = 236;
	numarr[2] = 252;
	numarr[3] = 253;
	numarr[4] = 0;
	
	int sum=0;
	for (int i=0; i<5; i++) {
		sum = sum + numarr[i];
	}
	
	float avg = 0;
	avg= (float)sum/5;
	System.out.println("The average of array elements are : " +avg);
	}
}
