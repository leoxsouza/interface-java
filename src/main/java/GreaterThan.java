public class GreaterThan implements Operand<Double, Boolean> {

	Value operand1, operand2;

	@Override
	public Boolean evaluate() {
		return operand1.evaluate() > operand2.evaluate();
	}

	@Override public String toString() {
		return operand1.evaluate() + " > " + operand2.evaluate();
	}
}
