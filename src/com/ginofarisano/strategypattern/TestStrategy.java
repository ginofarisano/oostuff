package com.ginofarisano.strategypattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Client where I use my context (ElementList).
 * I test elementListTrack (where track implements comparable) and
 * quickSortAlgorithmInteger (implements Comparable by default.)
 * @author ginofarisano
 */
public class TestStrategy {

	public static void main(String[] args) {
		
		MergeSortAlgorithm<Track> quickSortAlgorithmTrack = new MergeSortAlgorithm<>();
		List<Track> trackToOrder = new ArrayList<Track>();
		
		System.out.println("Not ordered tracks");
		
		for(int i = 0; i< 10; i++){
			Track track = new Track("track"+i, "author"+i, (int)(Math.random()*100));
			trackToOrder.add(track);
			System.out.println(track);
		}
		
		ElementList<Track> elementListTrack = new ElementList<>(trackToOrder, quickSortAlgorithmTrack);
		elementListTrack.sort();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Ordered tracks by duration");
		
		for(Track track : trackToOrder){
			System.out.println(track);
		}
		
		//TO DO: implement sort in QuickSortAlgorithm
        // This allows dynamic changes for flyingType
		//elementListTrack.setSortAlgorithm(new QuickSortAlgorithm<>());
		//elementListTrack.sort();

		//for(Track track : trackToOrder){
			//System.out.println(track);
		//}
		
		//System.out.println();
		//System.out.println(); 
		
		System.out.println();
		System.out.println();
		
		MergeSortAlgorithm<Integer> quickSortAlgorithmInteger = new MergeSortAlgorithm<>();

		List<Integer> integerToOrder = new ArrayList<Integer>();
		
		System.out.println("Not ordered integers");

		for(int i = 0; i< 10; i++){
			Integer integer = new Integer((int)(Math.random()*100));
			integerToOrder.add(integer);
			System.out.println(integer);
		}
		
		ElementList<Integer> elementListInteger = new ElementList<>(integerToOrder, quickSortAlgorithmInteger);
		elementListInteger.sort();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Ordered integers");

		for(Integer integer : integerToOrder){
			System.out.println(integer);
		}
		
	}

}
