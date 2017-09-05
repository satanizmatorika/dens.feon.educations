package ru.dens.feon.education.interview.questions;

public class TestSingletonHolder {
	private static class Holder {
		private static TestSingletonHolder INSTANCE = new TestSingletonHolder();
	}

	private TestSingletonHolder() {
	}

	public static TestSingletonHolder getInstance() {
		return Holder.INSTANCE;
	}


}
