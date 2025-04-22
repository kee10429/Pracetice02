package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		
		System.out.println("숫자1: ");
		int num_1 = sc.nextInt();
		
		System.out.println("숫자2: ");
		int num_2 = sc.nextInt();
		
		System.out.println("숫자3: ");
		int num_3 = sc.nextInt();
		
		int min = num_1;
				
		if (num_2<min)
		System.out.println("가장 작은 수는 " +min+ "입니다.");
		
		sc.close();
	}
}
