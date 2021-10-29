import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runners.JUnit4;

import java.io.IOException;

public class MultiThreadingOperationsTest extends TestCase {

    private MultiThreadingOperations multiThread;

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
        multiThread = null;
    }

    /**
     * Tests running a operation
     */
    public void testNewOperation() {
        multiThread = new MultiThreadingOperations();
        try {
            multiThread.main(new String[] {""});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}