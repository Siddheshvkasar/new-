
public class TwoNumDivisiblity {

	public static void main(String[] args) {
		
		
		int num = 35;
		// By using Logical AND operator 
		
//		if (num % 5 == 0 && num % 7 == 0) {
//			System.out.println("The number is divisible by 5 & 7");
//		}
//		
//		else {
//			System.out.println("The number is not divisible by 5 & 7");
//		}
		
//		Using Nested Conditional Statement
		if (num % 5 == 0) {
			if (num % 7 ==0) {
				System.out.println("The number is Divisible by 5 & 7");
			}
			else {
				System.out.println("The number is not divisible by 7");
			}
		}
		else {
			System.out.println("The number is not divisible by 5 & 7");
		}
		

	}

}
