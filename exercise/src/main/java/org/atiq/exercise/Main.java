package org.atiq.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

	public static boolean testCounts(Map<String, Integer> wordMap, List<Integer> counts) {
		boolean result = false;
		if (wordMap.size() == counts.size()) {
			int index = 0;
			for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
				System.out.printf("%s - %d\n", entry.getKey(), entry.getValue());
				if (entry.getValue() != counts.get(index++)) {
					return result;
				}
			}
			result = true;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String str = "This is a statement, and so is this.";
		List<Integer> values = Arrays.asList(2, 2, 1, 1, 1, 1);
		
		WordCounter counter = new WordCounter();
		Map<String, Integer> counts = counter.countRepetitions(str);
		System.out.printf("Test %s", Main.testCounts(counts, values) ? "passed" : "failed");
	}
	
}
