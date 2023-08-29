package com.cozentus.array;

public class SpecificValue {
	
	static boolean checker(int arr[], int n) {
		
		for(int i: arr) {
			if(i==n) {
				return true;				
			}				
		}
		return false;
	}

	public static void main(String [] args) {
		
		int numarr[] = {12,42,63,67,98,9,32,45,13,17};
		System.out.println(checker(numarr, 32));
		System.out.println(checker(numarr, 10));
	}
}
