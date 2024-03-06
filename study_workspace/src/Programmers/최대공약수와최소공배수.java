package Programmers;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
	
	
	public int[] solution(int n, int m) {
        int max = Math.max(n, m); 
        int min = Math.min(n, m);
        
        //최대 공약수 -> 유클리드 호제법
        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }
        
        //최소 공배수 = 두수의 곱 / 최대 공약수
        int gcd = n * m / max;
        
        int[] answer = {max, gcd};
        return answer;
    }
    
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

          answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

    public static int gcd(int p, int q){
    	if (q == 0) return p;
    	return gcd(q, p%q);
    }


    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
    	최대공약수와최소공배수 c = new 최대공약수와최소공배수();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
    
}
