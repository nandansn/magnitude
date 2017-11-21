package com.nanda.magnitude;

import java.util.LinkedList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test
	public void testScenarioOne() {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("A", "A");

		listOfInputPairs.add(inputRow_1);

		Assert.assertEquals(CyclicDependencyScanner.findCyclicDependency(listOfInputPairs), true);

	}

	@Test
	public void testScenarioTwo() {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("B", "A");
		Pair<String, String> inputRow_2 = new Pair<String, String>("C", "A");

		Pair<String, String> inputRow_3 = new Pair<String, String>("B", "C");

		listOfInputPairs.add(inputRow_1);
		listOfInputPairs.add(inputRow_2);
		listOfInputPairs.add(inputRow_3);

		Assert.assertEquals(CyclicDependencyScanner.findCyclicDependency(listOfInputPairs), true);

	}

	@Test
	public void testScenarioThree() {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("B", "A");
		Pair<String, String> inputRow_2 = new Pair<String, String>("C", "A");

		Pair<String, String> inputRow_3 = new Pair<String, String>("D", "B");

		Pair<String, String> inputRow_4 = new Pair<String, String>("D", "C");

		listOfInputPairs.add(inputRow_1);
		listOfInputPairs.add(inputRow_2);
		listOfInputPairs.add(inputRow_3);
		listOfInputPairs.add(inputRow_4);

		Assert.assertEquals(CyclicDependencyScanner.findCyclicDependency(listOfInputPairs), true);
	}

	@Test
	public void testScenarioFour() {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("B", "A");
		Pair<String, String> inputRow_2 = new Pair<String, String>("C", "A");

		Pair<String, String> inputRow_3 = new Pair<String, String>("D", "B");

		Pair<String, String> inputRow_4 = new Pair<String, String>("D", "A");

		listOfInputPairs.add(inputRow_1);
		listOfInputPairs.add(inputRow_2);
		listOfInputPairs.add(inputRow_3);
		listOfInputPairs.add(inputRow_4);

		Assert.assertEquals(CyclicDependencyScanner.findCyclicDependency(listOfInputPairs), true);

	}

	@Test
	public void testScenarioFive() {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("B", "A");
		Pair<String, String> inputRow_2 = new Pair<String, String>("C", "A");

		Pair<String, String> inputRow_3 = new Pair<String, String>("D", "B");

		listOfInputPairs.add(inputRow_1);
		listOfInputPairs.add(inputRow_2);
		listOfInputPairs.add(inputRow_3);
		

		Assert.assertEquals(CyclicDependencyScanner.findCyclicDependency(listOfInputPairs), false);

	}
	
	@Test
	public void testScenarioSix() {

		List<Pair<String, String>> listOfInputPairs = new LinkedList<Pair<String, String>>();

		Pair<String, String> inputRow_1 = new Pair<String, String>("B", "");
		

		listOfInputPairs.add(inputRow_1);
		
		

		Assert.assertEquals(CyclicDependencyScanner.findCyclicDependency(listOfInputPairs), false);

	}

}
