package main;

import parent.Parent;
import parent.Parent.Inner;

import static parent.Parent.NAME;

import child.Child;

public class Main {
	public static void main(String[] args) {
		Child child = new Child("Agim");
		
		Parent.Inner inner = child.new Inner("Test");
	}
}
