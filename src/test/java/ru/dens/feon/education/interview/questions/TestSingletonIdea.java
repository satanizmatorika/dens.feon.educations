package ru.dens.feon.education.interview.questions;

public class TestSingletonIdea {
	private static TestSingletonIdea ourInstance = new TestSingletonIdea();

	public static TestSingletonIdea getInstance() {
		return ourInstance;
	}

	private TestSingletonIdea() {
	}
}
