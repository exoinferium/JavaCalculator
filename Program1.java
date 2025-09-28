
public class Program1 {
	
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public int subtract(int a, int b) {
		int difference = a - b;
		return difference;
	}
	
	public int multiply(int a, int b) {
		int product = a * b;
		return product;
	}
	
	public int divide(int a, int b) {
		int quotient = a / b;
		return quotient;
	}
	
	int val1 = 3;
	int val2 = 5;

	public static void main(String[] args) {
		Program1 myCalculator = new Program1();
		String operation = "add";
		
		if(operation == "add") {
			int resultSum = myCalculator.add(3, 5);
			System.out.println("Sum = " + resultSum);
		} else if (operation == "subtract") {
			int resultDifference = myCalculator.subtract(3, 5);
			System.out.println("Difference = " + resultDifference);
		} else if (operation == "multiply") {
			int resultProduct = myCalculator.multiply(3, 5);
			System.out.println("Product = " + resultProduct);
		} else if (operation == "divide") {
			int resultQuotient = myCalculator.divide(3, 5);
			System.out.println("Quotient = " + resultQuotient);
		} else {
			System.out.println("Enter different operation");
		}
	}

}
