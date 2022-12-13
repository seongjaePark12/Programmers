package level0;

import java.util.Arrays;

/*

*/
class Test92 {
	public static void main(String[] args){
		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int[] answer = new int[score.length];
    Arrays.fill(answer, 1);
    for (int i = 0; i < score.length; i++) {
        for (int j = 0; j < score.length; j++) {
            if(score[i][0] + score[i][1] > score[j][0] + score[j][1]) {
                answer[j]++; 
            }
        }
    }
		System.out.println(Arrays.toString(answer));
	}
}