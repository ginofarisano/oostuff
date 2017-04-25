package com.ginofarisano.strategypattern;

import java.util.List;

/**
 * @author ginofarisano
 * The strategy interface implemented by the concrete strategy.
 * The user can use any T type that implements Comparable.
 * @param <T> is a class that implements Comparable
 */
public interface SortAlgorithm <T extends Comparable<T>>{
	public void sort(List<T> list);
}
