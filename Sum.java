package com.cozentus.array;

public class Sum {
	
	public static void main(String [] args) {
		
		int numarr[] = new int[10];
		numarr[0] = 10;
		numarr[1] = 20;
		numarr[2] = 30;
		numarr[3] = 40;
		numarr[4] = 50;
		numarr[5] = 60;
		numarr[6] = 70;
		numarr[7] = 80;
		numarr[8] = 90;
		numarr[9] = 100;
		
		System.out.println("Elements in array are : ");
		for(int i=0; i<10; i++) {
			System.out.println(numarr[i]);
		}
		
		int sum=0;
		for(int i=0; i<10;i++) {
			sum=sum+numarr[i];
		}
		System.out.println("Total sum of the array elements are : "+sum);
	}
}
