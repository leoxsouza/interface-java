import java.util.List;

public class Sum implements Operand<Double, Double> {

	List<Value> operands;

	@Override
	public Double evaluate() {
		return operands.stream().mapToDouble(Value::evaluate).sum();
	}

	@Override public String toString() {
		StringBuilder operacao = new StringBuilder();
		for (int i = 0; i < operands.size(); i++) {
			operacao.append(operands.get(i).evaluate().toString());
			if (i < operands.size() - 1) {
				operacao.append(" + ");
			}
		}
		return operacao.toString();
	}
}
