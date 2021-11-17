package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
	
		int num = sc.nextInt();
		for(int i=0; i<num*2-1; i++) {
			for(int j=0; j<=Math.abs(num-i-1) ;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		sc.close();
	}

}
