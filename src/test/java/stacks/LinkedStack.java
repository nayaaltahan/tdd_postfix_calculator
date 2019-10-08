package stacks;

import java.util.EmptyStackException;
public class LinkedStack<T> implements StackADT<T> {
	private int count;
	private LinearNode<T> top;

	public LinkedStack() {
		count = 0;
		top = null;
	}

	@Override
	public boolean isEmpty() {
		if (count == 0) {
			return true;

		} else
			return false;
	}

	/*
	 * we check if the stack is empty or not, if it is empty, we throw an exception,
	 * if it's not we get the top element and store it in result
	 */
	@Override
	public T peek() {

		if (isEmpty())
			throw new error.EmptyStackException("stack");

		return top.getNext().getElement();
	}
	/*
	 * we check if the stack is empty or not, if it is empty, we throw an exception,
	 * if it's not we get the top element and store it in result and remove it from
	 * the stack then we decrement the counter and return result
	 */

	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty())
			throw new error.EmptyStackException("stack");
		T result = top.getElement();
		top = top.getNext();
		count--;
		return result;
	}

	/*
	 * we push(add) a new element if the element is not null
	 */
	@Override
	public void push(T element) {

		if (element == null) {
			throw new NullPointerException("element object is null");
		} else {
			LinearNode<T> temp = new LinearNode<T>(element);
			temp.setNext(top);
			top = temp;
			count++;
		}
	}

	@Override
	public int size() {

		return count;
	}

}
