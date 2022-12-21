package level1;

/*
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
*/
class Test5 {
	public static void main(String[] args) {
		long n = 12345;
		String aa = String.valueOf(n);
		int[] answer = new int[aa.length()];
		int cnt = 0;
		for(int i=aa.length()-1; i<aa.length();i--) {
			answer[cnt++] = Character.getNumericValue(aa.charAt(i));
			System.out.println(Character.getNumericValue(aa.charAt(i)));
			if(i == 0) break;
		}
		System.out.println(answer);
	}
}