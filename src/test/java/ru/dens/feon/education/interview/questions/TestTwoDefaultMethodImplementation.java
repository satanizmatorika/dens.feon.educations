package ru.dens.feon.education.interview.questions;

import org.junit.jupiter.api.Test;

class TestTwoDefaultMethodImplementation {

	interface DeafaultOne {
		default String method(){
			return "DeafaultOne";
		}
	}
	interface DeafaultTwo {
		default String method(){
			return "DeafaultTwo";
		}
	}
	class DefaultImpl implements DeafaultOne, DeafaultTwo {
		@Override
		public String method() {
			return "DeafaultOverride";
		}
	}

	class DefaultImplA implements DeafaultOne {

		public String method() {
			return "DefaultImplA";
		}

	}

	class DefaultImplB extends DefaultImplA {

		public String method() {
			return "DefaultImplB";
		}

	}

	@Test
	void check() {
		//TODO response IDEA support of new Interface() error router || auto-completion
		System.out.println(new DeafaultOne(){}.method());

		System.out.println(new DeafaultTwo(){}.method());

		System.out.println(new DefaultImpl().method());

		System.out.println(new DefaultImpl(){
			@Override
			public String method() {
				return "DefaultImplAnon";
			}
		}.method());

		System.out.println(((DeafaultOne) new DefaultImplB()).method());

	}
}

