import java.util.List;

public class Substract implements Operand<Double, Double> {

	List<Value> operands;

	@Override
	public Double evaluate() {
		Double total = 0.0;
		for(Value v: operands) {
			total -= v.evaluate();
		}
		return total;
	}

	@Override public String toString() {
		StringBuilder operacao = new StringBuilder();
		for (Value operand : operands) {
			operacao.append(" - ").append(operand.evaluate().toString());
		}
		return operacao.toString();
	}
}
