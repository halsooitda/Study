package Programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 별찍기 {

	public static void main(String[] args) {
		/* 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
		   별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요. */
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 >");
		int a = sc.nextInt(); //별 개수
		System.out.print("세로 >");
		int b = sc.nextInt(); //줄 수

		//풀이1
		StringBuilder sb = new StringBuilder();
		IntStream.range(0, a).forEach(s -> sb.append("*"));
		IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
		System.out.println();

		//내가 만든 풀이
        for(int i=1; i<=b; i++){
            for(int j=1; j<=a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
