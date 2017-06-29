import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 */

/**
 * @author user
 *
 */
public class FindStudentWithMaxMarksTest {
	
	

	


	/**
	 * Test method for {@link FindStudentWithMaxMarks#processData(java.util.List)}.
	 */
	@Test
	public void testProcessData() {
		//fail("Not yet implemented");
		List<String> studentList = FindStudentWithMaxMarks.readFile();
		System.out.println(studentList);
		String expectedOutput[]={"English:26","Data Structures:26"};
		String actualOutPut[]=new String[expectedOutput.length];
		Map<String, Integer> subjectStudentMap = FindStudentWithMaxMarks.processData(studentList);
		int i=0;
		for (Map.Entry<String, Integer> entry : subjectStudentMap.entrySet()) {
			
			 actualOutPut[i]=entry.getKey() + ":" + entry.getValue();
			 i++;
			
		}
		assertArrayEquals(expectedOutput, actualOutPut);
		
	}

}
