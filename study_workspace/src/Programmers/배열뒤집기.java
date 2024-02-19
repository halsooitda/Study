package Programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열뒤집기 {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(solution1(arr)));
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(solution1(arr)[i]+" ");
		}
		
	}

	//스트림을 사용한 풀이
	public static int[] solution1(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
	
	//내가 한 풀이
    public static int[] solution2(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = num_list.length - 1;
            
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[j];
            j--;
        }
        return answer;
    }
}
