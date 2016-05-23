package com.comcast.csv.interview.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringParsingProblemTest {

	@Test
	public void correctAddressFormat1(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("25w873 Apple St.");
		Assert.assertTrue(testAddress);
	}
	@Test
	public void correctAddressFormat2(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("3n17 Special Ave.");
		Assert.assertTrue(testAddress);
	}
	@Test
	public void correctAddressFormat3(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("0e34800 Main St.");
		Assert.assertTrue(testAddress);
	}
}
