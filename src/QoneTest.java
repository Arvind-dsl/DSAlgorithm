import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class QoneTest {

    public Qone qone = new Qone();

    @Test
    public void testRemoveDuplicateChar(){
        String result = qone.removeDuplicateChar("ASDWSASD11$$");
        assertTrue("ASDW1$".equals(result));
        result = qone.removeDuplicateChar("ASDWSASD11");
        assertTrue("ASDW1".equals(result));
        result = qone.removeDuplicateChar("12345654321");
        assertTrue("123456".equals(result));
    }

    @Test
    public void testIsPangram(){
        Boolean result = qone.isPanagram("The quick brown fox jumps over the lazy dog");
        assertTrue(result);
        result = qone.isPanagram("The uick brown fox jumps over the lazy dog");
        assertFalse(result);
        result = qone.isPanagram("The q1uick brown fox jumps over the lazy dog");
        assertTrue(result);
        result = qone.isPanagram("The q1uick bro$%wn foxE# jumpEs over the lazy dog");
        assertTrue(result);
    }

}
