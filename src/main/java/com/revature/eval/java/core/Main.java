package com.revature.eval.java.core;

import java.util.List;
import java.util.Map;

import com.revature.eval.java.core.EvaluationService.AtbashCipher;

public class Main {
	public static void main(String[] args) {
		EvaluationService es = new EvaluationService();

		System.out.println("ONE");
		String one = es.reverse("example");

		System.out.println();
		
		System.out.println("TWO");
		String two = es.acronym("Strategic Homeland Intervention, Enforcement Logistics Division");
		
		System.out.println();
		
		System.out.println("THREE");
		EvaluationService.Triangle et = new EvaluationService.Triangle(5,4,6);
		boolean three1 = et.isEquilateral();
		boolean three2 = et.isIsosceles();
		boolean three3 = et.isScalene();
		
		System.out.println();
		
		System.out.println("FOUR");
		int four = es.getScrabbleScore("OxyphenButazone");
		
		System.out.println();
		
		System.out.println("FIVE");
		String five = es.cleanPhoneNumber("+1 (613)-995-0253 ");
		
		System.out.println();		
		
		System.out.println("SIX");
		Map<String, Integer> six = es.wordCount("one,\ntwo,\nthree");
		
		System.out.println();
		
		System.out.println("EIGHT");
		String eight = es.toPigLatin("quick fast run");

		System.out.println();

		System.out.println("NINE");
		boolean nine = es.isArmstrongNumber(153);
		
		System.out.println();

		System.out.println("TEN");
		List<Long> ten = es.calculatePrimeFactorsOf(901255);
		
		System.out.println();

		System.out.println("ELEVEN");
		EvaluationService.RotationalCipher er =  new EvaluationService.RotationalCipher(13);
		String eleven = er.rotate("help me");
		
		System.out.println();
		
		System.out.println("TWELEVE");
		int tweleve = es.calculateNthPrime(13);

		System.out.println();
		
		System.out.println("THIRTEEN");
		String thirteen = AtbashCipher.encode("Testing,1 2 3, testing.");
		
		System.out.println();

		System.out.println("FOURTEEN");
		String fourteen = AtbashCipher.decode("gvhgr mt123 gvhgr mt");
		
		System.out.println();
		
		System.out.println("FIFTEEN");
		boolean fifteen = es.isValidIsbn("3-598-2X507-0");

		System.out.println();
		
		System.out.println("SIXTEEN");
		boolean sixteen = es.isPangram("The quick brown fox jumps over the lazy dog");

		System.out.println();
		
		System.out.println("EIGHTTEEN");
		int[] set = {3,5};
		int eighteen = es.getSumOfMultiples(20, set);

		System.out.println();
		
		System.out.println("NINETEEN");
		boolean nineteen = es.isLuhnValid("046 454 286");

		System.out.println();

		System.out.println("TWENTY");
		int twenty1 = es.solveWordProblem("What is 5 plus 13?");
		int twenty2 = es.solveWordProblem("What is 7 minus 5?");
		int twenty3 = es.solveWordProblem("What is 6 multiplied by 4?");
		int twenty4 = es.solveWordProblem("What is 25 divided by 5?");
		
/*			
 * 
 * 
 * 20/20
 */
	}
}
