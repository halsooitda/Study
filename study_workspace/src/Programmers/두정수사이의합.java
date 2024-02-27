package Programmers;

public class 두정수사이의합 {

	public static void main(String[] args) {
		

	}

	
	public long solution1(int a, int b) {
        long answer = 0;

        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        for(int i=a; i<=b; i++){
            answer += i;
        }
        
        return answer;
    }
	
	
	public long solution2(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }
    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
