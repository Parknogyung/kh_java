package com.png.sort.comparable;

import java.util.Comparator;

public class comparator_ implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		int result = o1.getArtist().compareTo(o2.getArtist());
		
		if(result == 0) {
			return (o1.getRanking() > o2.getRanking()) ? 1 : 
				(o1.getRanking() == o2.getRanking()) ? 0 : -1;
		}
		return result;
	}

}
