package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫짜: ");
		int num_1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num_2 = sc.nextInt();
		
		if (num_1==0 || num_2==0){
			System.out.println("0은 입력불가");
		} else {
			int small;
			int big;;
			
		//작은수 큰수 구분
			if(num_1<num_2) {
				small=num_1;
				big=num_2;
					
			} else {
				small=num_2;
				big=num_1;
			}
			
			if(big%small==0){
				System.out.println(small + "는(은) " + big + " 의 약수입니다." );
			} else {
				System.out.println(small + "는(은) " + big + " 의 약수가 아닙니다." );
			}
			
		}
		
		sc.close();
	}
}
