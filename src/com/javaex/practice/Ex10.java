package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int num_1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num_2 = sc.nextInt();
		
		if(num_1>num_2) {
			System.out.println("큰수:" + num_1 +"   "+ "작은수: " + num_2 + "입니다.");
		} else if(num_1<num_2) {
			System.out.println("큰수:" + num_2 +"   "+ "작은수: " + num_1 + "입니다.");
		} else {
			System.out.println("큰수: " + num_1 + "   " + "작은수: " + num_2 + "입니다.");
		}
	}
}
