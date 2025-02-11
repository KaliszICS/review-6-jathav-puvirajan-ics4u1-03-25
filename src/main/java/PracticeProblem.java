public class PracticeProblem {

	public static void main(String args[]) {

	}
	//q1
	public static int sum(int num1, int num2) {
		return num1+num2; 
	}
	//q2
	public static int difference(int num1, int num2) {
		return num1-num2; 
	}
	//q3
	public static double product(double num1, double num2) {
		return num1*num2; 
	}
		
	//q4
	public static String removeFirst(String str) {
		return str.substring(1,str.length()); 
	}
		
	//q5
	public static int combinedLength(String str, String str2) {
		return (str+str2).length(); 
	}
		
	//q6
	public static boolean isEven(int num) {
		return (num%2 == 0);
	}
		
	//q7
	public static boolean isOdd(int num) {
		return (num%2 != 0);
	}
		
	//q8
	public static boolean isPositive(int num) {
		return (num > 0);
	}
		
	//q9
	public static boolean isNegative(int num) {
		return (num < 0);
	}
}
