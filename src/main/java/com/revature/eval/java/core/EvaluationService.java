package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	public boolean prime(int l) {
		boolean a = false;
		for (int i = 2; i <= l; i++) {
			if (l == i) {//System.out.println(l + " is prime");
				a = true;
			} else if (l % i == 0) {// System.out.println(l + " " + i);// System.out.println(false);
				a = false;
				break;
			}
		}// System.out.println(a);
		return a;
	}

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {// Done
		String[] array = string.split("");
		String a = "";
		int i;
		for (i = array.length - 1; i >= 0; i--) {
			a = a.concat(array[i]);
		}
		System.out.println(a);
		return a;
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {// Done
		String q = phrase.replace("-", " ");
		String[] array = q.split(" ");
		String a = "";
		for (int i = 0; i < array.length; i++) {
			a = a.concat(array[i].substring(0, 1).toUpperCase());
		}
		System.out.println(a);
		return a;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {// Done
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			double one = getSideOne();
			double two = getSideTwo();
			double three = getSideThree();
			if (one == two && two == three) {
				System.out.println(true);
				return true;
			} else {
				System.out.println(false);
				return false;
			}
		}

		public boolean isIsosceles() {
			double one = getSideOne();
			double two = getSideTwo();
			double three = getSideThree();
			if (one == two || two == three || one == three) {
				System.out.println(true);
				return true;
			} else {
				System.out.println(false);
				return false;
			}
		}

		public boolean isScalene() {
			double one = getSideOne();
			double two = getSideTwo();
			double three = getSideThree();
			if (one != two && two != three && one != three) {
				System.out.println(true);
				return true;
			} else {
				System.out.println(false);
				return false;
			}
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {// Done

		int score = 0;

		String[] array = string.split("");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equalsIgnoreCase("K")) {
				score += 5;
				// System.out.println(array[i] + " " + score);
			} else if (array[i].equalsIgnoreCase("Q") || array[i].equalsIgnoreCase("Z")) {
				score += 10;
				// System.out.println(array[i] + " " + score);
			} else if (array[i].equalsIgnoreCase("J") || array[i].equalsIgnoreCase("X")) {
				score += 8;
				// System.out.println(array[i] + " " + score);
			} else if (array[i].equalsIgnoreCase("D") || array[i].equalsIgnoreCase("G")) {
				score += 2;
				// System.out.println(array[i] + " " + score);
			} else if (array[i].equalsIgnoreCase("B") || array[i].equalsIgnoreCase("C")
					|| array[i].equalsIgnoreCase("M") || array[i].equalsIgnoreCase("P")) {
				score += 3;
				// System.out.println(array[i] + " " + score);
			} else if (array[i].equalsIgnoreCase("Y") || array[i].equalsIgnoreCase("W")
					|| array[i].equalsIgnoreCase("F") || array[i].equalsIgnoreCase("H")
					|| array[i].equalsIgnoreCase("V")) {
				score += 4;
				// System.out.println(array[i] + " " + score);
			} else {
				score += 1;
				// System.out.println(array[i] + " " + score);
			}
		}
		System.out.println(score);
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) throws IllegalArgumentException {// Done

		String string1 = string.replace("+", "");
		String string2 = string1.replace(" ", "");
		String string3 = string2.replace("(", "");
		String string4 = string3.replace(")", "");
		String string5 = string4.replace("-", "");
		String string6 = string5.replace(".", "");

		if (string6.length() > 11) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}

		String[] array = string6.split("");
		for (String s : array) {
			if (Integer.parseInt(s) % 1 != 0) {
				throw new IllegalArgumentException("IllegalArgumentException");
			}
		}

		if (string6.startsWith("1")) {
			String string7 = string6.replaceFirst("1", "");
			System.out.println(string7);
			return string7;
		} else {
			System.out.println(string6);
			return string6;
		}
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {// Done
		String string1 = string.replace(",", " ");
		String string2 = string1.replace("\n", "");

		// System.out.println(string2);
		String[] array = string2.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		for (String s : array) {
			if (map.get(s) != null) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		map.forEach((name, salary) -> {
			System.out.println(name + " " + salary);
		});
		return map;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 *
	 * static class BinarySearch<T> {// Dropped private List<T> sortedList;
	 * 
	 * public int indexOf(T t) { // TODO Write an implementation for this method
	 * declaration return 0; }
	 * 
	 * public BinarySearch(List<T> sortedList) { super(); this.sortedList =
	 * sortedList; }
	 * 
	 * public List<T> getSortedList() { return sortedList; }
	 * 
	 * public void setSortedList(List<T> sortedList) { this.sortedList = sortedList;
	 * }
	 * 
	 * }
	 */

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) { // Done
		String[] arr = string.split(" ");
		// System.out.println(arr[2]);
		String pig = "";
		String replace, substring, latin = "";

		for (String s : arr) {
			if (!(latin.isEmpty())) {
				// System.out.println("empty");
				latin = latin.concat(" ");
			}
			pig = s;
			// System.out.println(s);
			boolean vowel = true;
			while (vowel) {
				if (pig.startsWith("a") || pig.startsWith("e") || pig.startsWith("i")
						|| pig.startsWith("o") | pig.startsWith("u")) {
					pig = pig.concat("ay");
					// System.out.println(pig);
					vowel = false;
				} else {
					// System.out.println(pig); // therapy
					replace = pig.replace(pig.substring(0, 1), "");
					// System.out.println(replace); // herapy
					substring = replace.concat(pig.substring(0, 1));
					// System.out.println(substring); // heraphyt
					pig = substring;
				}
			}
			latin = latin.concat(pig);
		}
		System.out.println(latin);
		return latin;

	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) { // Done
		int arm = String.valueOf(input).length();
		String[] a = String.valueOf(input).split("");
		// System.out.println(a[0]);
		int x = 0;
		for (int i = 0; i < arm; i++) {
			// System.out.println(Integer.parseInt(a[0]));
			x += (int) Math.pow(Integer.parseInt(a[i]), arm);
			// System.out.println(x);
		}
		if (input == x) {
			System.out.println(true);
			return true;
		} else {
			System.out.println(false);
			return false;
		}
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) { //DONE
		List<Long> list = new ArrayList<>();
		boolean prime = false;

		for (int x = 2; x <= l; x++) {
			if (prime(x) && l % x == 0) { // 5 and 901255/5=180251
				list.add((long) x);//System.out.println("first in list " + x);
				l = l / x; // 901255/5=180251
				while (l != 1) {//System.out.println("l "+l);
					if (l%x!= 0) { // 180251%5 not equal 0//System.out.println(l + " is not mod of " + x);
						x++; // 6
					} else if (prime((int) l) && l % x == 0) {//System.out.println(l+" is prime");
						list.add((long) l);//System.out.println("in list " + l);
						prime = true;
						break;
					} else {//System.out.println(l+" is not prime");
						l = l / x; // 6/2=3
						list.add((long) x);//System.out.println("in list " + x);
					}
				}
			}
			if (prime) {
				break;
			}
		}
		System.out.println("List " + list);
		return list;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {// Done
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		String[] letter = alphabet.split("");
		String[] ceasar;
		String encode = "";

		public RotationalCipher(int key) {
			super();
			System.out.println(alphabet);
			String rot = alphabet.replace(alphabet.substring(0, key), "");
			// System.out.println(rot);
			String cipher = rot.concat(alphabet.substring(0, key));
			System.out.println(cipher);
			ceasar = cipher.split("");
		}

		public String rotate(String string) {

			String[] plain = string.split("");
			for (String s : plain) {
				int i = 0;
				boolean notletter = true;
				// System.out.println("1st loop "+s);
				for (String t : letter) {
					// System.out.println("2nd loop "+t);
					if (t.equalsIgnoreCase(s)) {
						// System.out.println(i);
						// System.out.println(s+" to "+ceasar[i]);
						if (s.toUpperCase().equals(s)) {
							encode = encode.concat(ceasar[i].toUpperCase());
							notletter = false;
						} else {
							encode = encode.concat(ceasar[i]);
							notletter = false;
						}
					}
					i++;
				}
				if (notletter) {
					encode = encode.concat(s);
				}
			}

			System.out.println(encode);
			return encode;
		}

	}

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) { // Done
		int x = 0;
		int z = 0;

		if (i == 0) {
			throw new IllegalArgumentException();
		} else {
			while (x != i) { // 0!=6
				if (i == 0) {
				} else {
					if (prime(z)) { //
						x += 1;
						z++;
					} else {
						z++;
					}
				}
			}
			System.out.println(z - 1);
			return z - 1;
		}

	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher { // Done
		static String plain = "abcdefghijklmnopqrstuvwxyz";
		static String[] plainarr = plain.split("");
		static String cipher = "zyxwvutsrqponmlkjihgfedcba";
		static String[] cipherarr = cipher.split("");

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			System.out.println(plain);
			System.out.println(cipher);
			String[] arr = string.replace(".", "").replace(",", "").replace(" ", "").split("");
			String encode = "";
			int sep = 0;
			for (String a : arr) {
				int i = 0;
				if (sep == 5) {
					sep = 0;
					encode = encode.concat(" ");
				}
				boolean notletter = true;
				for (String p : plainarr) {

					if (a.equalsIgnoreCase(p)) {
						encode = encode.concat(cipherarr[i]);
						notletter = false;
						sep++;
					}
					i++;
				}
				if (notletter) {
					encode = encode.concat(a);
					sep++;
				}
			}
			System.out.println(encode);
			return encode;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			System.out.println(cipher);
			System.out.println(plain);
			String[] arr = string.replace(" ", "").split("");
			String decode = "";

			for (String a : arr) {
				int i = 0;
				boolean notletter = true;
				for (String p : cipherarr) {
					if (a.equalsIgnoreCase(p)) {
						decode = decode.concat(plainarr[i]);
						notletter = false;
					}
					i++;
				}

				if (notletter) {
					decode = decode.concat(a);
				}
			}
			System.out.println(decode);
			return decode;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) { // DONE
		String[] arr = string.replace("-", "").split("");
		int i = 0;

		for (String s : arr) {
			if (s.equalsIgnoreCase("X")) {
				arr[i] = "10";
			}
			i++;
		}

		try {
			int ISBN = (Integer.parseInt(arr[0]) * 10 + Integer.parseInt(arr[1]) * 9 + Integer.parseInt(arr[2]) * 8
					+ Integer.parseInt(arr[3]) * 7 + Integer.parseInt(arr[4]) * 6 + Integer.parseInt(arr[5]) * 5
					+ Integer.parseInt(arr[6]) * 4 + Integer.parseInt(arr[7]) * 3 + Integer.parseInt(arr[8]) * 2
					+ Integer.parseInt(arr[9]) * 1) % 11;
			// System.out.println(ISBN);
			if (ISBN == 0) {
				System.out.println(true);
				return true;
			} else {
				System.out.println(false);
				return false;
			}
		} catch (NumberFormatException e) {
			System.out.println(false);
			return false;
		}

	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {// DONE
		String[] arr = string.replace(" ", "").split("");
		String plain = "abcdefghijklmnopqrstuvwxyz";
		String[] plainarr = plain.split("");
		boolean[] pargram = new boolean[26];

		for (String a : arr) {
			int i = 0;
			for (String letter : plainarr) {
				if (a.equalsIgnoreCase(letter)) {
					pargram[i] = true;
				}
				i++;
			}
		}

		int i = 1;
		for (boolean b : pargram) {
			System.out.println(i + " " + b);
			if (b == false) {
				return false;
			}
			i++;
		}

		return true;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 *
	 *         public Temporal getGigasecondDate(Temporal given) { //Dropped // TODO
	 *         Write an implementation for this method declaration return null; }
	 */

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) { // DONE
		int sum = 0;
		int[] arr = new int[i];
		int count = 1;

		for (int x = 1; x < i; x++) {
			arr[x] = count;
			count++;
		}

		for (int s : set) {
			// System.out.println("set "+s);
			int z = 0;
			for (int a : arr) {
				if (a % s == 0) {
					// System.out.println("arr "+a);
					sum += a;
					// System.out.println("sum " + sum);
					arr[z] = 1;
				}
				z++;
			}
		}

		System.out.println(sum);
		return sum;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling 4539 1488 0343 6467 4_3_ 1_8_ 0_4_ 6_6_
	 * 
	 * If doubling the number results in a number greater than 9 then subtract 9
	 * from the product. The results of our doubling:
	 * 
	 * 4539 1488 0343 6467 8569 2478 0383 3437
	 * 
	 * Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) { //DONE
		if (string.startsWith("1")) {
			string = string.replaceFirst("1", "");
		}

		String[] arr = string.replace(" ", "").split("");

		if (string.length() <= 1) {
			return false;
		}

		for (String a : arr) {
			System.out.print(a);
		}
		System.out.println();

		try {

			for (int i = 1; i < arr.length; i += 2) {

				int doubling = Integer.parseInt(arr[i]) * 2;

				if (Integer.parseInt(arr[i]) >= 5) {
					doubling = doubling - 9;
				}

				arr[i] = Integer.toString(doubling);
			}

			for (String a : arr) {
				System.out.print(a);
			}
			System.out.println();

			int sum = 0;
			for (String a : arr) {
				sum += Integer.parseInt(a);
				System.out.println(a + " sum " + sum);
			}

			if (sum % 10 == 0) {
				System.out.println(true);
				return true;
			} else {
				System.out.println(false);
				return false;
			}

		} catch (NumberFormatException e) {
			System.out.println(false);
			return false;
		}
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {// Done
		// System.out.println(string.replace("?", ""));
		String[] arr = string.replace("?", "").split(" ");
		int x = 0;
		if (arr[3].startsWith("p")) {
			x = Integer.parseInt(arr[2]) + Integer.parseInt(arr[4]);
		} else if (arr[3].startsWith("mi")) {
			x = Integer.parseInt(arr[2]) - Integer.parseInt(arr[4]);
		} else if (arr[3].startsWith("mu")) {
			x = Integer.parseInt(arr[2]) * Integer.parseInt(arr[5]);
		} else if (arr[3].startsWith("d")) {
			x = Integer.parseInt(arr[2]) / Integer.parseInt(arr[5]);
		}
		System.out.println(x);
		return x;
	}

}
