package tdd_postfix_calculator;


public abstract class Element {
	public abstract void accept(IVisitor visitor) throws Exception;

}
