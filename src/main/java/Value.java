public class Value implements Operand<Double, Double> {

	Double value;

	public Value(Double value) {
		this.value = value;
	}

	@Override public Double evaluate() {
		return value;
	}
}
