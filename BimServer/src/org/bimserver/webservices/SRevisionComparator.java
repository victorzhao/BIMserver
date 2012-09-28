package org.bimserver.webservices;

import java.util.Comparator;

import org.bimserver.interfaces.objects.SRevision;

public class SRevisionComparator implements Comparator<SRevision> {

	private boolean increment;

	public SRevisionComparator(boolean increment) {
		this.increment = increment;
	}

	@Override
	public int compare(SRevision o1, SRevision o2) {
		return (o1.getId() - o2.getId()) * (increment ? 1 : -1);
	}
}