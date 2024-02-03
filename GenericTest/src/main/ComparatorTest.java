package main;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		CompareTest[] tests = {
				new CompareTest("AGIim"),
				new CompareTest("Ajf")
		};
		
		Comparator<CompareTest> comp = new Comparator<CompareTest>() {
			
			@Override
			public int compare(CompareTest o1, CompareTest o2) {
				// TODO Auto-generated method stub
				return o1.getData().compareTo(o2.getData());
			}
		};
		
		Arrays.sort(tests, comp);;
		
		System.out.println(Arrays.toString(tests));
	}
}
