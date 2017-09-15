package ru.dens.feon.education.interview.questions;

import org.junit.jupiter.api.Test;
import ru.dens.feon.education.interview.questions.annotations.Questable;

import java.util.HashMap;
import java.util.Map;

public class MapReplaceAllMap implements Questable {

	@Test
	public void quest() {
		questMapReplaceAllMapBy(4, 4);
		questMapReplaceAllMapBy(6, 4);
		questMapReplaceAllMapBy(4, 6);
	}
	
	private void questMapReplaceAllMapBy(int firstMapCapacity, int secondMapCapacity) {
		questMapReplaceAllMapBy(firstMapCapacity, "FIRST", secondMapCapacity, "SECOND");
	}
	

	private void questMapReplaceAllMapBy(int firstMapCapacity, String firstMapName, int secondMapCapacity, String secondMapName) {
		System.out.println(new StringBuilder("\ninit ").append(firstMapName)
				.append("[").append(firstMapCapacity)
				.append("]\ninit ").append(secondMapName)
				.append("[").append(secondMapCapacity).append("]"));

		Map<String, String> m1 = newRandomMap(firstMapCapacity, firstMapName);
		Map<String, String> m2 = newRandomMap(secondMapCapacity, secondMapName);

		System.out.println(m1);
		System.out.println(m2);

		System.out.println(new StringBuilder(firstMapName).append("[").append(firstMapCapacity)
				.append("].replaceAll(").append(secondMapName).append("[").append(secondMapCapacity).append("])"));
		m1.replaceAll(m2::put);

		System.out.println(m1);
		System.out.println(m2);

	}

	private Map<String,String> newRandomMap(int capacity, String objectName) {
		Map<String, String> returnedmap = new HashMap<>(capacity);
		for (int i = 0; i < capacity; i++) {
			returnedmap.put(String.valueOf(i), new StringBuilder(objectName).append(i).toString());
		}
		return returnedmap;
	}

}
