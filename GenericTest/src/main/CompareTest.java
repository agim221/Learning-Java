package main;

import java.util.Arrays;

public class CompareTest implements Comparable<CompareTest> {

	private String data;
		
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public CompareTest(String data) {
		super();
		this.data = data;
	}

	@Override
	public int compareTo(CompareTest o) {
		// TODO Auto-generated method stub
		return this.data.compareTo(o.data);
	}

	@Override
	public String toString() {
		return "CompareTest [data=" + data + "]";
	}

	public static void main(String[] args) {
		CompareTest[] tests = {
				new CompareTest("AGIim"),
				new CompareTest("Ajf")
		};
		
		Arrays.sort(tests);
		
		System.out.println(Arrays.toString(tests));
		
		
	}
}
