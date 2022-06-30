package com.png.sort.comparable;

public class Music implements Comparable<Music>{
	private String title;

	private String artist;
	
	private int ranking;
	
	public Music() {
	}

	public Music(String title, String artist, int ranking) {
		this.title = title;
		this.artist = artist;
		this.ranking = ranking;
	}
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getRanking() {
		return ranking;
	}

	@Override
	public int compareTo(Music o) {
		
		return (this.ranking > o.ranking) ? 1 : (this.ranking == o.ranking) ? 0 : -1;
	}
	
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", ranking=" + ranking + "]";
	}

	
	
}
