package com.javaex.practice;

public class Ex02 {
	/*
	다음중 switch 문에서 조건식에 넣을 수 있는 데이터 타입은? 
			(1) boolean 
			(2) char 
			(3) byte 
			(4) short 
			(5) int 
			(6) long 
			(7) float 
			(8) double 
			(9) String
			
			정답: (2) (3) (4) (5) (9)
			
			(1) boolean 은 분기 개수가 적고 논리 분기로 더 많이 쓰이기 때문에 switch에서 사용불가
			(6) long은 64비트 정수형인데, switch는 내부적으로 32비트 정수만 처리할 수 있다
			(7)(8) 실수형은 정확한 비교가 어렵기 때문에 switch에 적합하지 않음
			(9) String은 가능함
	*/
}
