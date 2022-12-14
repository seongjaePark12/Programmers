package level0;

import java.math.BigInteger;

/*
문제 설명
이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
return 값은 이진수를 의미하는 문자열입니다.
1 ≤ bin1, bin2의 길이 ≤ 10
bin1과 bin2는 0과 1로만 이루어져 있습니다.
bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
입출력 예
bin1	bin2	result
"10"	"11"	"101"
"1001"	"1111"	"11000"
입출력 예 설명
입출력 예 #1

10 + 11 = 101 이므로 "101" 을 return합니다.
입출력 예 #2

1001 + 1111 = 11000 이므로 "11000"을 return합니다.
*/
class Test96 {
	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		//BigInteger 형변환 하면서 10진수로 바꿔준다.(A, 2)가 10진수로 바꾸는 방법
		BigInteger A_binary = new BigInteger(bin1, 2);
		BigInteger B_binary = new BigInteger(bin2, 2);
		
		//합 연산식(add)로 더해서 변수에 저장.
		BigInteger sum = A_binary.add(B_binary);
		
		//풀이방식에 적어둔 대로 2진수로 변환
		String sum_binary = sum.toString(2);
		System.out.println(sum_binary);
	}
}