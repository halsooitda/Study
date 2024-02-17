package Programmers;

import java.util.Arrays;

public class 배열의평균값 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2};
		System.out.println(avg2(arr));
		
	}

	//배열의 평균값을 구하는 메서드
    public double avg(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int i: numbers){ //향상된 for문
            sum+=i;
        }
        answer = sum/(double)numbers.length;
        return answer;
    }
    
    //스트림 사용
    public static double avg2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
    
    //내가 만든 풀이
    public double avg3(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        
        answer = (double)sum/numbers.length;
        
        return answer;
    }
}
