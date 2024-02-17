package Programmers;

public class 짝수의합 {

	//클래스 메서드(static메서드)는 인스턴스 메서드를 사용할 수 없다. 
	public static void main(String[] args) {
		System.out.println(sum(4));

	}

	//짝수의 합을 구하는 메서드
    public static int sum(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
    
}
