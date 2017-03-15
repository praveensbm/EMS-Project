import org.junit.Test;

public class FailureTest {

	@Test (expected=ArithmeticException.class)
	public void testDivision(){
		int a=12;
		int b=0;
		int c = a/b;
	}
}
