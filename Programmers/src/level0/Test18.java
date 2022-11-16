package level0;

//문제 설명
//
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
//
//제한사항
//0 < array의 길이 < 100
//0 ≤ array의 원소 < 1000
//입출력 예arrayresult
//[1, 2, 3, 3, 3, 4]	3
//[1, 1, 2, 2]	-1
//[1]	1
//입출력 예 설명
//입출력 예 #1
//
//[1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
//입출력 예 #2
//
//[1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
//입출력 예 #3
//
//[1]에는 1만 있으므로 최빈값은 1입니다.
class Test18 {
    public int solution(int[] array) {
        int answer = 0;
        int arr_max = 0; // 배열 최대값 count크기를 정해주기 위한거
        for (int i = 0; i < array.length; i++) {
            if (array[i] > arr_max) {
                arr_max = array[i]; //최대값 저장
            }
        }
        int[] count = new int[arr_max + 1]; // 최대값 +1을 해서 count의 크기를 정해줌
        int max = 0;// 최대 수
        int n = 0; // 똑같은 값의 갯수
        for (int i = 0; i < array.length; i++) { // count에 array[i]순서의 값 넣어주기
            count[array[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) { // count[i]값이 max보다 크다면 max값을 count[i]로 변경
                max = count[i];
                answer = i;
            }
        }
        for (int i = 0; i < count.length; i++) { // count[i]가 max와 같다면 똑같은 값을 하나 업
            if (count[i] == max) {
                n++;
            }
        }
        if (n > 1) // 최빈값이 1개보다 많다면 -1
            answer = -1; 
        return answer;
    }
}