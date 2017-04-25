package com.ginofarisano.strategypattern;

import java.util.Collections;
import java.util.List;

/**
 * A concrete strategy that implements the SortStrategy interface.
 * @author ginofarisano
 * @param <T> is a class that implements Comparable
 */
public class MergeSortAlgorithm <T extends Comparable<T>> implements SortAlgorithm<T> {

	public void sort(List<T> list) {
		//The sorting algorithm is a modified mergesort. See https://www.quora.com/What-sorting-algorithm-is-used-by-Javas-Collections-sort-and-why
		Collections.sort(list);
	}

	
	

}
