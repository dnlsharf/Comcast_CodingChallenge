package com.comcast.csv.interview.problems;

import java.io.*;
import java.util.*;
import java.util.List;

import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Read a list of {@link Meme}s from a JSON source file that might be on the classpath or file system.
 */
public class FileJsonResourceProblem {

    /**
     * Read a list of memes from a JSON file stored on the filesystem
     * 
     * @param file the file to read
     * @return the list of memes read
     */
    public List<Meme> readFromFile(File file) throws YoureDoingItWrongException {
    	List<Meme> listMeme = new ArrayList<Meme>();
    	
      	if (file.exists()) {
	    	String path = file.toString();
	    	try {
	    		Reader reader = new FileReader(path);
	        	Gson gson = new Gson();
	        	listMeme = gson.fromJson(reader, new TypeToken<List<Meme>>(){}.getType());
				
	    	} catch (IOException e) {
	    		e.printStackTrace();
	    	}
      	}
      	else 
      		listMeme = null;
		return listMeme;
    }

    /**
     * Read a list of memes from a JSON file stored on the classpath
     * 
     * @param path the path to the resource
     * @return the list of memes read
     */
    public List<Meme> readFromClasspath(String path) throws YoureDoingItWrongException {
    	List<Meme> listMeme = new ArrayList<Meme>();
    	try {
    		Reader reader = new FileReader(path);
        	Gson gson = new Gson();
        	listMeme = gson.fromJson(reader, new TypeToken<List<Meme>>(){}.getType());
			
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
		return listMeme;
    }

}
