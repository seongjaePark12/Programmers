package level0;

//문제 설명
//
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ n ≤ 100
//입출력 예nresult
//10	[1, 3, 5, 7, 9]
//15	[1, 3, 5, 7, 9, 11, 13, 15]
//입출력 예 설명
//입출력 #1
//
//10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
//입출력 #1
//
//15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
import java.util.*;
class Teat19 {
    public int[] solution(int n) {
        int[] answer;
        if(n % 2 ==0)answer = new int[n/2]; //n이 짝수라면 배열 크기를n/2를 해준다
        else answer = new int[n/2+1]; // n이 홀수라면 배열크기를 n/2에 +1을 해준다
        int aa = 0;
        for(int i=0; i<=n; i++){
            if(i % 2 == 1){
                answer[aa] = i;
                aa++;
            }
        }
        return answer;
    }
}

class Solution19 {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=1; i<=n; i++){
          if(i%2 != 0) {
              answer.add(i); // 짝수가 아니라면 리스트에 값을 넣어준다
          } 
        }

        return answer;
    }
}