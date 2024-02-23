package Programmers;

public class 약수의합 {

	public static void main(String[] args) {
		System.out.println(sumDivisor(4));
		System.out.println(solution(4)); 

	}

	
	public static int sumDivisor(int num) {
		int answer = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				answer += i;
			}
		}

		return answer + num;
	}
	
    public static int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer += i;
            }
        }
        
        return answer;
    }
}
