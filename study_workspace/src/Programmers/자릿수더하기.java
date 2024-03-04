package Programmers;

public class 자릿수더하기 {

	public static void main(String[] args) {

	}
	
	public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            answer += n%10; //num을 10으로 나눈 나머지를 sum에 더한다.
            n/=10;  //num을 10으로 나눈 값을 다시 num에 저장한다.
        }

        return answer;
    }

}
