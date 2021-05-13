public class Division implements Operand<Double, Double> {

	Value dividend;
	Value divisor;

	@Override
	public Double evaluate() {
		return dividend.evaluate() / divisor.evaluate();
	}

	@Override
	public String toString() {
		return dividend.evaluate() + " / " + divisor.evaluate();
	}
}
