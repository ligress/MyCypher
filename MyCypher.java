import java.util.*;
import java.io.*;

class MyCypher {
	int cypher = 0;
	public MyCypher(int c) {
		this.cypher = c;
	}
	public int getCypher() {
		return cypher;
	}
	public String doEncryption(String s) {
		String s1 = "";
		char[] char1 = s.toCharArray();
		for (int i = 0; i < char1.length; i++) {
			if (char1[i] >= 65 && char1[i] <=90) {
				if (char1[i] + cypher > 90)
					char1[i] = (char)(char1[i] - (char)26 + (char)cypher);
				else
					char1[i] = (char)(char1[i] + (char)cypher);
			}
			else if (char1[i] >= 97 && char1[i] <= 122) {
				if (char1[i] + cypher > 122)
					char1[i] = (char)(char1[i] - 26 + cypher);
				else
					char1[i] = (char)(char1[i] + cypher);
			}
			else
				char1[i] = char1[i];
		}

		for (int i = 0; i < char1.length; i++) {
			s1 = s1.concat(char1[i] + "");
		}
		return s1;
	}

	public String doDecryption(String s) {
		String s2 = "";
		char[] char2 = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (char2[i] >= 65 && char2[i] <= 90) {
				if (char2[i] - cypher < 65)
					char2[i] = (char)(char2[i] + 26 - cypher);
				else
					char2[i] = (char)(char2[i] - cypher);
			}
			else if (char2[i] >= 97 && char2[i] <=122) {
				if (char2[i] - cypher < 97)
					char2[i] = (char)(char2[i] + 26 - cypher);
				else
					char2[i] = (char)(char2[i] - cypher);
			}
			else
				char2[i] = char2[i];
		}

		for (int i = 0; i < char2.length; i++) {
			s2 = s2.concat(char2[i] + "");
		}
		return s2;
	}
}
