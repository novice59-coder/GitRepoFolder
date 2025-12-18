package DeptNew;

public class ForClassExamples {

	public static void evenOddFunction() {
		int sumEven = 0, sumOdd = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("The number   " + i + "    is an even number");
				sumEven = sumEven + i;
			} else {
				System.out.println("The number   " + i + "    is an odd number");
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("The sum of even numbers is --->" + sumEven);
		System.out.println("The sum of odd numbers is --->" + sumOdd);
	}

	public static void countDown() {
		System.out.println("The count down starts:");
		for (int i = 10; i >= 1; i--)
			System.out.println(i);

	}

	public static void tablePrint() {
		System.out.println("The table for 3 is");
		for (int i = 1; i <= 10; i++)
			System.out.println(" 3  X  " + i + "  =  " + (3 * i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOddFunction();
		countDown();
		tablePrint();
	}

}
