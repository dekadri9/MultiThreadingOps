import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OperationTest extends TestCase {

    private Operation op;

    /**
     * Constructs a OperationTest with the specified name.
     * @param name Test case name.
     */
    public OperationTest(String name) {
        super(name);
    }

    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    protected void setUp() {

        op = new Operation(1);

    }

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
    public void testRunOperation() {

    }

    /**
     * Runs the test case.
     */
    public static void main(String args[]) {
        junit.textui.TestRunner.run(suite());
    }
}
