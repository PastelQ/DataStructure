package chap02;

// 1,000 이하의 소수를 나열(버전1)
public class PrimeNumber1 {
	
	public static void main(String[] args) {
		// 나눗셈의 횟수
		int counter = 0;
		
		for(int n=2; n<=1000; n++) {
			int i;
			for (i=2; i<n; i++) {
				counter++;
				if(n % i==0) {		// 나누어 떨어지면 소수가 아님
					break;			// 반복 더 이상 불필요 break로 종료
				}
			}
			if( n == i) {			// 마지막까지 나누어 떨어지지 않음
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 시행한 횟수 : " + counter);
	}
}