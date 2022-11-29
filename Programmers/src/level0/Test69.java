package level0;


/*
문제 설명
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

제한사항
0 ≤ n ≤ 1,000,000
입출력 예
n	result
1234	10
930211	16
입출력 예 설명
입출력 예 #1

1 + 2 + 3 + 4 = 10을 return합니다.
입출력 예 #2

9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
*/
class Test69 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 1234;
		String num = String.valueOf(n);
		for(int i=0;i<num.length();i++) {
			answer += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(answer);
	}
}