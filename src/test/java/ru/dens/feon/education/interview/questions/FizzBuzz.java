package ru.dens.feon.education.interview.questions;

import org.junit.Test;
import ru.dens.feon.education.interview.questions.annotations.Questable;

public class FizzBuzz implements Questable {

	@Test
	public void quest() {
		for (int i = 1; i <= 100; i++) {
			if ((i%3 == 0) && (i%5 ==0)) System.out.println("FizzBuzz");
			else if (i%3 ==0) System.out.println("Fizz");
			else if (i%5 ==0) System.out.println("Buzz");
		}
	}
}
