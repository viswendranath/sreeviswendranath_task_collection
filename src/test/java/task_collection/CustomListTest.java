package task_collection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomListTest {
	
	@Test
	public void customListTest1() {
		CustomList<Integer> l1 = new CustomList<Integer>();
		l1.add(new Integer(10));
		l1.add(new Integer(20));
		l1.remove(1);
		
		ILogger.LOGGER.debug(l1.size());
		ILogger.LOGGER.debug(l1);
		assertEquals(1,l1.size());
	}
	
	@Test
	public void customListTest2() {
		String arr[] = new String[10];
		for(int i=0;i<10;i++) {
			arr[i] = "Dummy " + Integer.toString(i);
		}
		CustomList<String> l2 = new CustomList<String>(arr);
		
		ILogger.LOGGER.debug(l2.size());
		ILogger.LOGGER.debug(l2);
		assertEquals(10,l2.size());
	}
}
