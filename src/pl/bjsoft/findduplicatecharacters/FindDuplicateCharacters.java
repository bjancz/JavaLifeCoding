package pl.bjsoft.findduplicatecharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		Set<Map.Entry<Character, Integer>> es = findDuplicateCharacters("aaannbbsdfs").entrySet();

		for (Map.Entry<Character, Integer> entrySet : es) {
			System.out.println(entrySet.getKey() + " " + entrySet.getValue());
		}

	}

	public static Map findDuplicateCharacters(String word) {

		char[] characters = word.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : characters) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		map = map.entrySet().stream().filter(x -> x.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		return map;
	}
}
