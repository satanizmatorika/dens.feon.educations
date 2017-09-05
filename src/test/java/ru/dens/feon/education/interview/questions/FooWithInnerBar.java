package ru.dens.feon.education.interview.questions;

import org.junit.Test;
import ru.dens.feon.education.interview.questions.annotations.Questable;

public class FooWithInnerBar implements Questable {
	class Foo {
		void boo() {
			class Bar {
			}
			Bar b = new Bar();
			System.out.println(b);
		}
	}

	@Test
	public void quest() {
		new FooWithInnerBar.Foo().boo();
	}
}
