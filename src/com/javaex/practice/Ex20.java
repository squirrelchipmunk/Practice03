package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randNum;
		int inputNum;
		String answer;
		boolean yesOrNo = true;
		
		while(yesOrNo) {
			System.out.println("=========================");
			System.out.println("    [숫자맞추기게임 시작]");
			System.out.println("=========================");
			randNum = (int)(Math.random()*100)+1;
			System.out.println("랜덤숫자 : "+randNum);
			System.out.println();
			while(true) {
				System.out.print(">>");
				inputNum = sc.nextInt();
				if(randNum>inputNum) {
					System.out.println("더 높게");
				}
				else if(randNum<inputNum) {
					System.out.println("더 낮게");
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.println("게임을 종료하시겠습니까? (y/n)");
			while(true) {
				answer=sc.next();
				if("y".equals(answer)) {
					yesOrNo=false;
					break;
				}
				else if("n".equals(answer)) {
					break;
				}
				else {
					System.out.println("y또는 n으로 입력해주세요");
				}
			}
			
		}
		
		System.out.println("=========================");
		System.out.println("    [숫자맞추기게임 종료]");
		System.out.println("=========================");
		
		sc.close();
		
	}

}
