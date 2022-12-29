package level1;

/*

*/
class Test21 {
	public static void main(String[] args) {
		String s = "abcde";
		String answer = "";
		if(s.length() % 2 == 0) answer = s.substring((s.length()/2)-1, (s.length()/2)+1);
		else answer = String.valueOf(s.charAt(s.length()/2));
		
		System.out.println(answer);
	}
}