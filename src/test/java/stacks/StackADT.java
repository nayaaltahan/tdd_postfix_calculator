
package stacks;


public interface StackADT<T> {
public boolean isEmpty(); //Returns true if the stack is empty
public T  peek(); //Returns the object at the top of the stack without removing it
public T pop(); //Returns the object that is on top of the stack and removes it from the stack
public void push(T element);//Pushes an item onto the top of the stack and returns the pushed item. 
public int size();
public String toString();
}
