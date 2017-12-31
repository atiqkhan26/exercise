package org.atiq.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
	
	static private Pattern pattern = Pattern.compile("(\\b[^\\s]+\\b)");
	
	public Map<String, Integer> countRepetitions(String str) {
		Map<String, Integer> result = null;
		if (str != null && !str.isEmpty()) {
			Matcher matcher = pattern.matcher(str);
			result = new LinkedHashMap<>();
			while (matcher.find()) {
				String word = matcher.group().toLowerCase();
				Integer value = result.get(word);
				if (value == null) {
					result.put(word, 1);
				} else {
					result.put(word, value + 1);
				}
			}
		}
		
		return result;
	}

}
