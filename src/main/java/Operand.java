public interface Operand<OperandType, ReturnType> {
	ReturnType evaluate();
	String toString();
}
