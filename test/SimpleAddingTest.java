import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleAddingTest {
    SimpleAdding tester;
/*
    @BeforeEach
    public void setUp() throws Exception {
        //Arrange
        tester = new SimpleAdding();
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
*/
    @Test
    public void testSimpleAddition() {
        int testNum = 140;
        int expectedResult= 9870;

        //Act
        tester = new SimpleAdding();
        int result = tester.SimpleAddition(testNum);

        //Assertion
        assertEquals(expectedResult, result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testExceptionIsThrow(){
        //Act
        tester = new SimpleAdding();
        tester.SimpleAddition(1001);
    }
}