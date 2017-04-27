package com.thbono.cameltdc;

import org.apache.camel.Exchange;

public class HtmlDecoratorTransformer {

	public String transform(final Exchange exchange) {
        final String sender = (String) exchange.getIn().getHeader("sender");
		final String[] words = exchange.getIn().getBody().toString().split(" ");

		final StringBuilder buffer = new StringBuilder("<div class='tweet'>");
        buffer.append("<span class='sender'>").append(sender).append("</span>");

		for (final String word: words) {
			if (word.startsWith("#")) {
				buffer.append("<span class='hashtag'>").append(word).append("</span>");
			} else if (word.startsWith("@")) {
				buffer.append("<span class='user'>").append(word).append("</span>");
			} else if (word.startsWith("http")) {
				buffer.append("<a href='").append(word).append("'>").append(word).append("</a>");
			} else {
				buffer.append(word);
			}
			buffer.append(" ");
		}

        buffer.append("</div>");
		return buffer.toString();
	}

}
