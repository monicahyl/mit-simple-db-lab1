package simpledb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author huangyulu
 * @Date 2026/4/23 14:05
 * @Description
 */
public class BaseTest {


    @Test
    public void testAdd() {
        int result = 1 + 2;
//        assertEquals(期望值, 实际值);
        assertEquals(3, result);
        assertEquals(4, result);
    }

}
