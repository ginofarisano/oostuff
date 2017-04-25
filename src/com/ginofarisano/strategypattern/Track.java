package com.ginofarisano.strategypattern;

/**
 * Track to order by duration 
 * 
 * If you want use your custom class it must implements Comparable. 
 * @author ginofarisano
 *
 */
public class Track implements Comparable<Track> {
	
	private String name;

	private String author;
	private int duration;
	
	public Track(String name, String author, int duration) {
		this.name = name;
		this.author = author;
		this.duration = duration;
	}
	
	@Override
	public int compareTo(Track track) {
		int durationTrackToCompare = track.getDuration(); 
		int toReturn = 1;//duration > durationTrackToCompare
		if(duration == durationTrackToCompare){
			toReturn = 0;
		} else if(duration < durationTrackToCompare){
			toReturn = -1;
		}
		
		return toReturn;
	}

	public int getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "Track [name=" + name + ", author=" + author + ", duration=" + duration + "]";
	}
	
}
