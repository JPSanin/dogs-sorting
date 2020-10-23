package model;

import java.util.Comparator;

public class DateComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog d1, Dog d2) {
		return d1.getBirthDate().compareTo(d2.getBirthDate());
	}

}
