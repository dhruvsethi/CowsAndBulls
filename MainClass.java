import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	final static String path = "C:\\Users\\dsethi\\Downloads\\sowpods.txt";

	public static void main(String[] args) {
		Map<String, Integer> difficultyWordLength = new HashMap<>();
		difficultyWordLength.put("easy", 4);
		difficultyWordLength.put("medium", 5);
		difficultyWordLength.put("hard", 6);

		System.out.println("Select difficulty - easy, medium or hard");
		Scanner in = new Scanner(System.in);
		String mode = in.next();
		System.out.println("Mode selected - " + mode);
		playCowsAndBulls(difficultyWordLength.get(mode));
	}

	private static void playCowsAndBulls(Integer wordLength) {
		try {
			System.out.println(getValidWords(wordLength));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	private static List<String> getValidWords(Integer wordLength) throws FileNotFoundException {
		Scanner in = new Scanner(new File(path));
		List<String> wordList = new ArrayList<>();


		String word;
		while (in.hasNext()) {
			word = in.next();
			Set<String> uniqueLetters = new HashSet<>(Arrays.asList(word.split("")));     
			if (word.length() == wordLength && uniqueLetters.size() == word.length()) {
				wordList.add(word);
			}
		}
		in.close();
		return wordList;
	}

}
