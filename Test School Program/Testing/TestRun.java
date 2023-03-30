package Testing;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRun {

    Result result = JUnitCore.runClasses(TestOperations.class);

    TestSuite suite = new TestSuite(CreateTest.class);
    TestResult testResult = new TestResult();

    public void runTest() {
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

    public void runTestCases() {
        suite.run(testResult);
        System.out.println("Number of test cases = " + testResult.runCount());
    }
}
