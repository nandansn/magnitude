package com.nanda.magnitude;

import java.util.LinkedList;
import java.util.List;

public class TestCyclicDependencyScanner {

	public static void main(String[] args) {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("B", "A");
		Pair<String, String> inputRow_2 = new Pair<String, String>("C", "A");

		Pair<String, String> inputRow_3 = new Pair<String, String>("D", "B");

		Pair<String, String> inputRow_4 = new Pair<String, String>("D", "A");

		listOfInputPairs.add(inputRow_1);
		listOfInputPairs.add(inputRow_2);
		listOfInputPairs.add(inputRow_3);
		listOfInputPairs.add(inputRow_4);

		CyclicDependencyScanner.findCyclicDependency(listOfInputPairs);

	}

}
