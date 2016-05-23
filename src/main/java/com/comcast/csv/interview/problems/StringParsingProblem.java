package com.comcast.csv.interview.problems;

import java.util.regex.*;
/**
 * The following methods operate on street addresses in a particular format. The format contains the following components:
 * 
 *  1. Number of miles from the center of the city
 *  2. Primary direction from the city as a single lower-case letter
 *  3. Street number
 *  4. Street name (always a single word)
 *  5. An abbreviation for either a Street or Avenue with a period
 * 
 * </h2>Example Valid Addresses</h2>
 * 25w873 Apple St.
 * 3n17 Special Ave.
 * 0e34800 Main St.
 */
public class StringParsingProblem {

    /**
     * Returns true if the address is valid, otherwise false.
     * 
     * @param address the address to validate
     * @return true if the address is valid
     */
    public boolean isAddressValid(String address) {
		String pattern = "(^\\d+(w|e|s|n)\\d+\\s\\w+\\s\\w+\\.)";
		boolean isMatch = Pattern.matches(pattern, address);
        return isMatch;
    }
    
    /**
     * Get the distance in miles from the center of the city from the given address.
     * 
     * @param address the address
     * @return the distance
     */
    public int getDistanceFromCityCenter(String address) {
    	
    	if (isAddressValid(address)) {
    		int x = 0;
    		char tempChar;
    		
    		do {
    			tempChar = address.charAt(x);
    			x = x + 1;
    		}
    		while((Character.isDigit(tempChar)) && (x < address.length()));
    		
    		String distance = address.substring(0, x - 1);
    		return Integer.parseInt(distance);
    	}
    	return 0;
    }
}
