package level1;

/*

*/
class Test30 {
	public static void main(String[] args) {
		int n = 2;int m=5;
		int[] answer = new int[2];
    if(m%n==0){
      answer[0] = n;
      answer[1] = m;
	  }else{
	      for(int i = 1; i <= m; i++){
	          if(n%i==0 && m%i==0){
	              answer[0] = i;
	          }
	      }
	      answer[1] = n*m/answer[0];
	  }
		System.out.println(answer);
	}
}