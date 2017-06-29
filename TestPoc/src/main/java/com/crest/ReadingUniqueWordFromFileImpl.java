package com.crest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ReadingUniqueWordFromFileImpl implements ReadingUniqueWord {

	public static void main(String[] args) {

		Map<String, Integer> finalMap = new ReadingUniqueWordFromFileImpl()
				.findUniuqeWordsFromFile();

		for (String enter : finalMap.keySet()) {

			System.out.println(enter + "::" + finalMap.get(enter));

		}

	}

	@Override
	public Map<String, Integer> findUniuqeWordsFromFile() {
		BufferedReader br = null;
		Map<String, Integer> map = new TreeMap<>(
				CaseInsensitiveComparator.INSTANCE);
		try {
			String sCurrentLine;
			String[] strArr = null;
			br = new BufferedReader(new FileReader("inputFile.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				strArr = sCurrentLine.split(" ");
				for (int i = 0; i < strArr.length; i++) {
					if (map.containsKey(strArr[i])) {
						map.put(strArr[i], map.get(strArr[i]) + 1);
					} else {
						map.put(strArr[i], 1);
					}

				}
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

		return map;
	}

}

class CaseInsensitiveComparator implements Comparator<String> {
	public final static CaseInsensitiveComparator INSTANCE = new CaseInsensitiveComparator();

	public int compare(String first, String second) {
		// some null checks
		return first.compareToIgnoreCase(second);
	}



}
