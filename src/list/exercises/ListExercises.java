/*
 * Copyright 2021 Marc Liberatore.
 */

package list.exercises;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

	/**
	 * Counts the number of characters in total across all strings in the supplied list;
	 * in other words, the sum of the lengths of the all the strings.
	 * @param l a non-null list of strings
	 * @return the number of characters
	 */
	public static int countCharacters(List<String> l) {
		int sum = 0;
		for (String string: l){
			sum += string.length();
		}
		return sum;
	}
	
	/**
	 * Splits a string into words and returns a list of the words. 
	 * If the string is empty, split returns a list containing an empty string.
	 * 
	 * @param s a non-null string of zero or more words
	 * @return a list of words
	 */
	public static List<String> split(String s) {
		String [] words = s.split("\\s+");
		List <String> wordings = new ArrayList<String>();
		for(int i = 0; i < words.length; i++){
			wordings.add(words[i]);
		}
		return wordings;
	}

	/**
	 * Returns a copy of the list of strings where each string has been 
	 * uppercased (as by String.toUpperCase).
	 * 
	 * The original list is unchanged.
	 * 
	 * @param l a non-null list of strings
	 * @return a list of uppercased strings
	 */
	public static List<String> uppercased(List<String> l) {
		List <String> uppered = new ArrayList<String>();
		if(l.size() <= 0){
			return uppered;
		}
		for(int i = 0; i < l.size(); i++){
			uppered.add(l.get(i).toUpperCase());
		}
		return uppered;
	}

	/**
	 * Returns true if and only if each string in the supplied list of strings
	 * starts with an uppercase letter. If the list is empty, returns false.
	 * 
	 * @param l a non-null list of strings
	 * @return true iff each string starts with an uppercase letter
	 */
	public static boolean allCapitalizedWords(List<String> l) {
		if (l.size() == 0){
			return false;
		}
		for(String i : l){
			if(i == null || i.isEmpty() || Character.isUpperCase(i.charAt(0)) == false){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns a list of strings selected from a supplied list, which contain the character c.
	 * 
	 * The returned list is in the same order as the original list, but it omits all strings 
	 * that do not contain c.
	 * 
	 * The original list is unmodified.
	 * 
	 * @param l a non-null list of strings
	 * @param c the character to filter on
	 * @return a list of strings containing the character c, selected from l
	 */
	public static List<String> filterContaining(List<String> l, char c) {
		List <String> has_c = new ArrayList<>();
		for(int i = 0; i < l.size(); i++){
			if (l.get(i).isEmpty() == false){
				if(l.get(i).indexOf(c) != -1){
					has_c.add(l.get(i));
				}
			}
		}
		return has_c;
	}
	
	/**
	 * Inserts a string into a sorted list of strings, maintaining the sorted property of the list.
	 * 
	 * @param s the string to insert
	 * @param l a non-null, sorted list of strings
	 */
	public static void insertInOrder(String s, List<String> l) {
		int i = 0;
		while(i < l.size() && (l.get(i).compareTo(s) < 0)){
			i++;
		}
		l.add(i, s);
	}
}
