package com.ginofarisano.strategypattern;

import java.util.Collections;
import java.util.List;

/**
 * A concrete strategy that implements the SortStrategy interface.
 * @author ginofarisano
 * @param <T> is a class that implements Comparable
 */
public class QuickSortAlgorithm <T extends Comparable<T>> implements SortAlgorithm<T> {

	public void sort(List<T> list) {
		//insert here your quicksort implementation
		throw new UnsupportedOperationException();
	}
}