package com.comcast.csv.interview.problems;

import java.util.*;

import com.comcast.csv.meme.Meme;

/**
 * Using all forms of loops and recursions to iterate over a {@link List} of {@link Meme}s and log it's name and year.
 * Format of the log message isn't important.
 */
public class LoopProblem {
	
	public static void printMemes(ArrayList<Meme> memeList) {
		
		for(Meme meme: memeList) {
			System.out.println("Name: " + meme.getName() +
					", Year: " + meme.getYear());
		}
	}
	
	public static void printMemesWithTags(ArrayList<Meme> memeList) {
		for(Meme temp: memeList) {
			System.out.println();
			String[] tags = temp.getTags();
			if (tags != null) {
				int numOfTags = tags.length;
				for (int k = 0; k < numOfTags; k++) {
					System.out.print(tags[k] + " ");
				}
			}
		}
	}
	
}
