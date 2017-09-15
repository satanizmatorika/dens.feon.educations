package ru.dens.feon.education.interview.questions;

import org.junit.jupiter.api.Test;

import java.util.*;

class LambdaStream {

	private static Print print;

	private static List<String> list1;
	private static List<String> list2;
	private static Map<String, String> map1;

	static{
		print = new Print();

		list1 = new ArrayList<>(Arrays.asList("test1", "test2", "test3", "test4", "test5"));
		list2 = new ArrayList<>(Arrays.asList("fast1", "fast2", "fast3", "fast4", "fast5"));
		map1 = new HashMap<String, String>() {
			{
				put("fast1", "test1");
				put("fast2", "test2");
				put("fast3", "test3");
				put("fast4", "test4");
			}
		};
	}

	interface Printable {
		void println(String str);
	}

	private static class Print implements Printable {

		@Override
		public void println(String str) {
			System.out.println(str);
		}
	}


	@Test
	void printResult() {
		LambdaStream.list1.forEach(System.out::println);

		LambdaStream.list1.forEach(LambdaStream.print::println);

		//TODO why next - error?
		//LambdaStream.list1.forEach(PrintEr::println);

	}

	interface PrintableEr {
		static void println(String str) {
			System.out.println(str);
		}
	}

	private static class PrintEr implements PrintableEr {

	}


}
