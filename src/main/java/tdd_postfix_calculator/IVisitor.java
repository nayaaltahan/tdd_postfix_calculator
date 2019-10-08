package tdd_postfix_calculator;

public interface IVisitor {

	
	public abstract void visit(Operator operator);

	public abstract void visit(Operand operand);

}
