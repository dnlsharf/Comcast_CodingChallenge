package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import com.comcast.csv.meme.Meme;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {
	 /**
     * Sorts a Collection of Memes by year
     * @param memes The Collection to sort
     * @param ascending true if the collection should be sorting in ascending order, otherwise false.
     */
	public void sort(Collection<Meme> memes, boolean ascending) {
		if (ascending == true) { 
			Collections.sort((ArrayList<Meme>)memes, new Comparator<Meme>(){
				public int compare(Meme meme1, Meme meme2) {
					return meme1.getYear() < meme2.getYear() ? -1 
							: meme1.getYear() > meme2.getYear() ? 1
							: 0;
				}
			});
		} else {
			Collections.sort((ArrayList<Meme>)memes, new Comparator<Meme>(){
				public int compare(Meme meme1, Meme meme2) {
					return meme1.getYear() < meme2.getYear() ? 1 
							: meme1.getYear() > meme2.getYear() ? -1
							: 0;
				}
			});
		}
		
	}
	
    /**
     * Adds a tag to all meme's that contain another tag
     * @param memes The collection of memes to mutate
     * @param tag The tag that is to be added
     */
    public void addTag(Collection<Meme> memes, String tag){
    	ArrayList<Meme> memesList = (ArrayList<Meme>)memes;
    	
    	for (Meme meme : memesList) {
    		String[] tags = meme.getTags();
    		if ((tags != null) && (tags.length > 0)) {
    			String[] tagsArray = Arrays.copyOf(tags, tags.length + 1);
    			tagsArray[tags.length] = tag;
    			meme.setTags(tagsArray);
    			}
    	}
    }
	
}
