package assignment2;
import algs4.*;
/*
 * <Tsvety Sotonov>
 * <Time Symbol Tables>
 */
public class TimeSymbolTables 
{
	public static void main(String[] args) 
	{
		StdIn.fromFile("data/tinyTale.txt");
		//SequentialSeatchST
		SequentialSearchST<String, Integer> wordCountTest = new SequentialSearchST<String, Integer>();
		//BinarySearchST
		BinarySearchST<String, Integer> wordCountTest2 = new BinarySearchST<String, Integer>();
		//BST
		BST<String, Integer> wordCountTest3 = new BST<String, Integer>();
		
		//Timers for each search
		Stopwatch timer1 = new Stopwatch();
		Stopwatch timer2 = new Stopwatch();
		Stopwatch timer3 = new Stopwatch();
		
		String[] words = StdIn.readAllStrings();
		
		int value = 0;
		
		//SequentialSeatchST
		for (int i = 0; i < words.length; i++) 
		{
			String w = words[i].toLowerCase(); //change case to lowercase
		if (!wordCountTest.contains(w))
			wordCountTest.put(w, 1);
		else
			{
			value = wordCountTest.get(w);
			value++;
			wordCountTest.put(w, value);
			}
		
		//BinarySearchST
		for (int j = 0; j < words.length; j++) 
		{
			String word = words[j].toLowerCase(); 
		if (!wordCountTest2.contains(word))
			wordCountTest2.put(word, 1);
		else
			{
			value = wordCountTest2.get(word);
			value++; 
			wordCountTest2.put(word, value);
			
			}
			}
		
		//BST
		for (int k = 0; k < words.length; k++) 
		{
			String wo = words[k].toLowerCase(); 
		if (!wordCountTest3.contains(wo))
			wordCountTest3.put(wo, 1);
		else
			{
			value = wordCountTest3.get(wo);
			value++; 
			wordCountTest3.put(wo, value);
			
			}
			}
		}
		
		//Results 
		System.out.println("Time taken to fill SequentialSearchST: " + timer1.elapsedTime() + " seconds");
		System.out.println("Time taken to fill BinarySeachST: " + timer2.elapsedTime() + " seconds");
		System.out.println("Time taken to fill BST: " + timer3.elapsedTime() + " seconds");
				
	}
}


