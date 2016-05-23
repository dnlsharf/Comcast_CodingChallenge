package com.comcast.csv.interview.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidStringParsingProblemTest {
	
	@Test
	public void numbers() {
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("1234");
		Assert.assertFalse(testAddress);
	}
	@Test
	public void incorrectAddressFormat1(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("34800 Main St.");
		Assert.assertFalse(testAddress);
	}
	@Test
	public void incorrectAddressFormat2(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("34b800 Main St.");
		Assert.assertFalse(testAddress);
	}
	@Test
	public void incorrectAddressFormat3(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("34800 Main");
		Assert.assertFalse(testAddress);
	}
	@Test
	public void emptyString(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("");
		Assert.assertFalse(testAddress);
	}
	@Test
	public void addressWithNoDirection(){
		StringParsingProblem strParsing = new StringParsingProblem();
		boolean testAddress = strParsing.isAddressValid("25873 Apple St.");
		Assert.assertFalse(testAddress);
	}
}
