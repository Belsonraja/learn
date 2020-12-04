package learn1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String s = "Hello There";
		printDuplicateChars(s);
	}

	static void printDuplicateChars(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		Map<Character, Integer> ordered = new TreeMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
				ordered.put(s.charAt(i), count);
			} else {
				map.put(s.charAt(i), 1);
				ordered.put(s.charAt(i), 1);
			}
		}

		System.out.println(map.toString());
		System.out.println(ordered.toString());

		for (Map.Entry<Character, Integer> result : map.entrySet()) {
			if (result.getValue() > 1) {
				System.out.println(result.getKey());
			}
		}
		
		System.out.println("lambda");
		
		map.entrySet().stream().forEach(e -> {
			if (e.getValue() > 1)
				System.out.println(e.getKey() + ":" + e.getValue());
		});

	}

}
