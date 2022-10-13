import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest 
{
    @Test 
	public void AppendTest() 
    {
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(4);

        assertEquals(3, test.length());
	}

    @Test 
	public void toStringTest() 
    {
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(3);
        test.append(4);


        assertEquals("1 3 4 ", test.toString());
	}
}
