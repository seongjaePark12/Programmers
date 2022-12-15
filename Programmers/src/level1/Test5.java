package level1;

/*

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