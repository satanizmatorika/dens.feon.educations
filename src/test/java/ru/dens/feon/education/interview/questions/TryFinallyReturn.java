package ru.dens.feon.education.interview.questions;

import org.junit.Test;
import ru.dens.feon.education.interview.questions.annotations.Questable;

public class TryFinallyReturn implements Questable {

	@Test
	public void quest() {
		System.out.println(TryFinallyReturn.fooReturn());
		System.out.println(TryFinallyReturn.fooThrow());
		TryFinallyReturn.fooThrow();
	}

	private static int fooReturn() {
		try {
			return 0;
		} finally {
			return 42;
		}
	}

	private static int fooThrow() {
		try {
			throw new RuntimeException();
		} finally {
			return 42;
		}
	}

	private static void fooCatchThrow() {
		try {
			throw new NullPointerException("NPE 1");
		} catch (NullPointerException e) {
			throw new NullPointerException("NPE 2");
		} finally {
			return;
		}
	}


}
