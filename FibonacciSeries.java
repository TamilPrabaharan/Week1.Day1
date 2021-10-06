package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n=8, firstTerm=0, secondTerm=1, i;
		System.out.println("Fibonacci series till " + n + " terms");
		
		for (i=1; i<=n; i++) {
			System.out.println(firstTerm+ " ");
			
			int nextTerm= firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
		
}
	
