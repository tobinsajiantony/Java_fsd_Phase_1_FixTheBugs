package com.FixtTheBugs.fixTheBugs;

import java.util.ArrayList;

public class Search {
	
   void SearchArray(ArrayList<Integer> arr, int startIndex, int endIndex, int elementToBeSearched){
	   try {
	   int midIndex = (startIndex + endIndex)/2;
			   if(elementToBeSearched > arr.get(midIndex) && midIndex < endIndex) {
				   SearchArray(arr, midIndex+1, endIndex, elementToBeSearched);
			   }
			   else if(elementToBeSearched < arr.get(midIndex) && startIndex < midIndex) {
				   SearchArray(arr, startIndex, midIndex-1, elementToBeSearched);
			   }
			   else if(elementToBeSearched == arr.get(midIndex)) {
				   System.out.println("Element found");
			   }
			   else {
				   System.out.println("Element Not found!");
			   }
   }catch(Exception e) {System.out.println(e.getStackTrace());}
	}
}
