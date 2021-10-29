import junit.framework.TestCase;
import org.junit.runners.JUnit4;

public class OperationTest extends TestCase {

    private Operation op;

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    protected void setUp() {}

    /**
     * Tears down the test fixture.
     * Called after every test case method.
     */
    protected void tearDown() {
        op = null;
    }

    /**
     * Tests running a operation
     */
    public void testNewOperation() {
        op = new Operation(1);
        assertEquals(op.getId(), 1);
    }

    public void testRunnable1() {
        op = new Operation(1);
        op.run();
    }

    public void testRunnable5() {
        op = new Operation(5);
        op.run();
    }

}