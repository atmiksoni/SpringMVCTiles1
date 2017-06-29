import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindStudentWithMaxMarks {

	public static void main(String[] args) {
		List<String> studentList = readFile();
		System.out.println(studentList);
		Map<String, Integer> subjectStudentMap = processData(studentList);
		for (Map.Entry<String, Integer> entry : subjectStudentMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());

		}
	}

	public static ArrayList<String> readFile() {

		BufferedReader br = null;
		List<String> studentList = new ArrayList<>();

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("input.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				studentList.add(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return (ArrayList<String>) studentList;

	}

	public static Map<String, Integer> processData(List<String> list) {

		Map<String, Integer> subjectStudentMap = new HashMap<String, Integer>();
		Map<String, Integer> subjectMarksMap = new HashMap<String, Integer>();
		for (String inputList : list) {
			String[] stuArr = inputList.split("\\|");
			if (!subjectMarksMap.containsKey(stuArr[1])) {
				subjectMarksMap.put(stuArr[1], Integer.parseInt(stuArr[2]));
				subjectStudentMap.put(stuArr[1], Integer.parseInt(stuArr[0]));
			} else {
				Integer mark = subjectMarksMap.get(stuArr[1]);
				if (Integer.parseInt(stuArr[2]) > mark) {
					subjectMarksMap.put(stuArr[1], Integer.parseInt(stuArr[2]));
					subjectStudentMap.put(stuArr[1],
							Integer.parseInt(stuArr[0]));
				}
			}

		}

		return subjectStudentMap;
	}

}
