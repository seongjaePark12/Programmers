package level0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

*/
class Test97 {
	public static void main(String[] args) {
		String before="olleh";
		String after="hello";
		int answer = 0;
		int cnt = 0;
		String be = "";
		String af = "";
		be = Stream.of(before.split(""))
        .sorted()
        .collect(Collectors.joining());
		af = Stream.of(after.split(""))
				.sorted()
				.collect(Collectors.joining());
		for(int i=0; i<be.length(); i++) {
			if(be.charAt(i) == af.charAt(i)) {
				cnt++;
			}
		}
		if(cnt == be.length()) {
			answer = 1;
		}
		System.out.println(answer);
	}
}