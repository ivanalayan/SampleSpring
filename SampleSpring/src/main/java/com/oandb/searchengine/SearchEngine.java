package com.oandb.searchengine;

import java.util.Set;

public class SearchEngine {

	private Set<String> dictionary;
	
	public boolean search(String wordToFind){
		return dictionary.contains(wordToFind);
	}

	public Set<String> getDictionary() {
		return dictionary;
	}
	
	public void setDictionary(Set<String> dictionary) {
		this.dictionary = dictionary;
	}
	
	public void init(){
		System.out.println("Starting up....");
	}
	
	public void finish(){
		System.out.println("Shutting down....");
	}

}
