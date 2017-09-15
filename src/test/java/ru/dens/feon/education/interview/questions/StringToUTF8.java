package ru.dens.feon.education.interview.questions;

import org.junit.jupiter.api.Test;
import ru.dens.feon.education.interview.questions.annotations.Questable;

import java.io.UnsupportedEncodingException;


public class StringToUTF8 implements Questable {
	@Test
	public void quest() {
		try {
			System.out.println("девклаб".getBytes("UTF-8"));
			System.out.println("devclub".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
