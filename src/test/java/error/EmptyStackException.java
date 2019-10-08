package error;

public class EmptyStackException extends RuntimeException {
 public EmptyStackException(String collection) {
	 super("The "+ collection+" is empty");
 }
}
