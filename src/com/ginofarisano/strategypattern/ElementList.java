package com.ginofarisano.strategypattern;

import java.util.List;
/**
 * @author ginofarisano
 * The strategy context: contains the data and the algorithm to use (you can add others 
 * strategy for example PrintAlgorithm, etc.)
 * The user can change the algorithm with setSortAlgorithm
 * @param <T> is a class that implements Comparable
 */
public class ElementList <T extends Comparable<T>> {
	
	private List<T> list;
	// I'm decoupling : encapsulating the concept that varies
	private SortAlgorithm<T> sortAlgorithm;
	
	public ElementList(List<T> list, SortAlgorithm<T> sortAlgorithm) {
		this.list = list;
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public void Add(T element){
		list.add(element);
	}
	
	public void sort(){
		sortAlgorithm.sort(list);
	}
	
	public void setSortAlgorithm(SortAlgorithm<T> sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
}
