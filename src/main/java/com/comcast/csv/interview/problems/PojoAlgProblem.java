package com.comcast.csv.interview.problems;

import java.awt.Rectangle;

/**
 * Using absolute coordinates for EVERYTHING, implement the following methods to position the inner rectangle relative
 * to the outer rectangle.
 */
public class PojoAlgProblem {
	

    /**
     * Put the inner rectangle so that it's bottom right corner aligns with the bottom right corner of the outer
     * rectangle.
     * 
     * @param inner the inner rectangle to position
     * @param outer the outer rectangle to use as a reference
     */
    public void bottomRight(Rectangle inner, Rectangle outer) {
    	double newX, newY;
    	newX = outer.getX() + outer.getWidth() - (int)inner.getWidth();
    	newY = outer.getY() - outer.getHeight() + (int)inner.getHeight();
    	inner.setLocation((int)newX, (int)newY);
    }

    /**
     * Put the inner rectangle so that it is centered vertically and horizontally 
     * 
     * @param inner the inner rectangle to position
     * @param outer the outer rectangle to use as a reference
     */
    public void middleCenter(Rectangle inner, Rectangle outer) {
    	double moveX = (outer.getWidth() - inner.getWidth()) / 2;
    	double moveY = (outer.getHeight() - inner.getHeight()) / 2;
    	
    	double newX = outer.getX() + outer.getWidth() - (int)inner.getWidth() - moveX;
    	double newY = outer.getY() - outer.getHeight() + (int)inner.getHeight() + moveY;
    	inner.setLocation((int)newX, (int)newY);
    	
    }
}