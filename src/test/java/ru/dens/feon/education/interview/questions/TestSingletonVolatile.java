package ru.dens.feon.education.interview.questions;

public class TestSingletonVolatile {
	private static volatile TestSingletonVolatile INSTANCE = null;
	private TestSingletonVolatile() {
	}
	public static TestSingletonVolatile getInstance() {
		if(INSTANCE == null) {
			synchronized (TestSingletonVolatile.class) {
				INSTANCE = new TestSingletonVolatile();
			}
		}
		return INSTANCE;
	}
}
