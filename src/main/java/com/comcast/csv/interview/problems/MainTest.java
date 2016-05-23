package com.comcast.csv.interview.problems;
import java.io.File;
import java.io.FileReader;
import java.awt.Rectangle;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/*
 * 
* @author Danil Sharafutdinov
* MainTest tests 5 existing Problems. 
* "mvn test" tests StringParsing problem.
* 
* */

public class MainTest {

	public static void main(String[] args) throws YoureDoingItWrongException {
		
		//-------------------Read JSON from File.
		//System.out.println("\nTesting readFromClasspath");
		String path = "src/Files/memeFile.txt";
		FileJsonResourceProblem fileJson = new FileJsonResourceProblem();
		ArrayList<Meme> memeList = (ArrayList<Meme>)fileJson.readFromClasspath(path);
		
		//------------------Sort Collection by Year.
		CollectionsProblemImpl collectionProblemImpl = new CollectionsProblemImpl();
		collectionProblemImpl.sort(memeList, true);
		
		//-------------------Add Tag.
		//collectionProblemImpl.addTag(memeList, "TagAdditional");
		
		//-------------------Print List Meme Elements.		
		System.out.println();
		LoopProblem.printMemes(memeList);
		//LoopProblem.printMemesWithTags(memeList);
		
		//----------------StringPatternProblem test.
		System.out.println("\n\nDISTANCE TEST:");
		StringParsingProblem strPars = new StringParsingProblem();
		int distance = strPars.getDistanceFromCityCenter("234e34800 Main St.");
		System.out.println("DistanceFromCity: " + distance);
		
		System.out.println("\n\nPATTERN TEST:");
		// More test in a TestNG suite.
		
		boolean testPattern = strPars.isAddressValid("234e34800 Main St.");
		System.out.println("testPattern = " + testPattern);
		
		//----------------PojoAlgProblem test
		// 1st Area (positive x, positive y)
		System.out.println("\nAlign inner Rectangle:");
		Rectangle outer = new Rectangle(1, 7, 6, 6);
		Rectangle inner = new Rectangle(1, 7, 2, 2);
		PojoAlgProblem pojoAlgProblem = new PojoAlgProblem();
		pojoAlgProblem.bottomRight(inner, outer);
		System.out.println("XY coordinates = (1, 7)");
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		System.out.println("\nAlign to the middle:");
		pojoAlgProblem.middleCenter(inner, outer);
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		
		// 2nd Area (positive x, negative y)
		System.out.println("\nAlign inner Rectangle:");
		outer = new Rectangle(1, -1, 6, 6);
		inner = new Rectangle(1, -1, 2, 2);
		pojoAlgProblem = new PojoAlgProblem();
		pojoAlgProblem.bottomRight(inner, outer);
		System.out.println("XY coordinates = (1, -1)");
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		System.out.println("\nAlign to the middle:");
		pojoAlgProblem.middleCenter(inner, outer);
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		
		// 3rd Area (negative x, negative y)
		System.out.println("\nAlign inner Rectangle:");
		outer = new Rectangle(-7, -1, 6, 6);
		inner = new Rectangle(-7, -1, 2, 2);
		pojoAlgProblem.bottomRight(inner, outer);
		System.out.println("XY coordinates = (-7, -1)");
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		System.out.println("\nAlign to the middle:");
		pojoAlgProblem.middleCenter(inner, outer);
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		
		// 4th Area (negative x, negative y)
		System.out.println("\nAlign inner Rectangle:");
		outer = new Rectangle(-7, 7, 6, 6);
		inner = new Rectangle(-7, 7, 2, 2);
		pojoAlgProblem.bottomRight(inner, outer);
		System.out.println("XY coordinates = (-7, 7)");
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		System.out.println("\nAlign to the middle:");
		pojoAlgProblem.middleCenter(inner, outer);
		System.out.println("Inner x = " + inner.getX());
		System.out.println("Inner y = " + inner.getY());
		
	}
}
