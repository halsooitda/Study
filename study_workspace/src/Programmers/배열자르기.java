package Programmers;

import java.util.Arrays;

public class 배열자르기 {

    public int[] solution1(int[] numbers, int num1, int num2) {
        if(num1 > num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        
        int[] answer = new int[num2-num1+1];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = numbers[num1];
            num1++;
        }
    
        return answer;
    }
    

    public int[] solution2(int[] numbers, int num1, int num2) {
    	return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }


    public int[] solution3(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }
}
