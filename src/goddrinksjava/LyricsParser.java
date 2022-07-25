package goddrinksjava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LyricsParser {

	public static void next() {
		System.out.println(lines.poll());
	}
	
	public static Queue<String> lines;

	static {
		lines = new LinkedList<>();
		Scanner c = new Scanner(LyricsParser.class.getResourceAsStream("lyrics.txt"));
		String s;
		while (c.hasNextLine()) {
			s = c.nextLine();
			s = c.nextLine();
			s = c.nextLine();
			lines.add(s);
			s = c.nextLine();
		}
		c.close();
	}
	
	
}
