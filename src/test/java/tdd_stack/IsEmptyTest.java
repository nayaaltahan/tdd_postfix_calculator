package tdd_stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import stacks.LinkedStack;

public class IsEmptyTest {
private LinkedStack<Integer> stack;

@Before
void setUp() throws Exception {
	stack = new LinkedStack<Integer>();
}
	@Test
	public void test() {
		assertTrue(stack.isEmpty());
	}
	@Test
	public void testPushToEmptyStack() {
		
	}

}
