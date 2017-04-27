package com.thbono.cameltdc;

public class SelectUtil {

	private static String[] java = { "java", "j2ee", "ejb", "jms", "spring", "jsf", "cdi", "servlet"};

	public static boolean isAboutJava(final String message) {
		return contains(message, java);
	}

	private static boolean contains(final String text, final String[] words) {
		for (final String word : words) {
			if (text.toLowerCase().contains(word.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
