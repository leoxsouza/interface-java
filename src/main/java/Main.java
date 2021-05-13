import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Division division = new Division();
		division.dividend = new Value(20.0);
		division.divisor = new Value(2.0);
		System.out.println(division.toString() + division.evaluate());

		Sum sum = new Sum();
		sum.operands = Arrays.asList(new Value(10.0), new Value(20.0), new Value(30.0));
		System.out.println(sum.toString());
		System.out.println(sum.evaluate());

		Multiplication mult = new Multiplication();
		mult.operands = Arrays.asList(new Value(3.0), new Value(3.0), new Value(3.0));
		System.out.println(mult.toString());
		System.out.println(mult.evaluate());

		Substract substract = new Substract();
		substract.operands = Arrays.asList(new Value(10.0), new Value(5.0));
		System.out.println(substract.toString());
		System.out.println(substract.evaluate());

		LessThan lessThan = new LessThan();
		lessThan.operand1 = new Value(10.0);
		lessThan.operand2 = new Value(2.0);
		System.out.println(lessThan.toString());
		System.out.println(lessThan.evaluate());

		GreaterThan greaterThan = new GreaterThan();
		greaterThan.operand1 = new Value(10.0);
		greaterThan.operand2 = new Value(2.0);
		System.out.println(greaterThan.toString());
		System.out.println(greaterThan.evaluate());


	}
}
