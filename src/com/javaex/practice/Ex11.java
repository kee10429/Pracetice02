package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫번째 숫자: ");
		int num_1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num_2 = sc.nextInt();
		
		if(num_1>=num_2) {
			System.out.println("몫:" + num_1/num_2);
			System.out.println("나머지:" + num_1%num_2);
		}else {
			System.out.println("몫:" + num_2/num_1);
			System.out.println("나머지:" + num_2%num_1);
		}
		
		sc.close();
		
		
	}
}
