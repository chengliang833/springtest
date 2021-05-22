package top.ulane.springtest;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

public class SpringJUnit4ClassRunnerExt extends SpringJUnit4ClassRunner {

    /**
     * Construct a new {@code SpringJUnit4ClassRunner} and initialize a
     * {@link TestContextManager} to provide Spring testing functionality to
     * standard JUnit tests.
     *
     * @param clazz the test class to be run
     * @see #createTestContextManager(Class)
     */
    public SpringJUnit4ClassRunnerExt(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    static {
        try {
            Log4jConfigurer.initLogging("classpath:properties/log4j.properties");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }
}
