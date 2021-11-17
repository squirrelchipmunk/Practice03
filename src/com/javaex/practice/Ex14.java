package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
	
		int num = sc.nextInt();
		int sum=0;
		
		int i;
		for(i=1; i<num; i++) {
			System.out.print(i+"+");
			sum+= i;
		}
		System.out.println(i);
		sum+= i;
		System.out.println("합계: "+sum);
		
		sc.close();
	}

}
