package StreamerAndInterpreter;

public class ScrubUtils {
	//This class holds functions intended to 'scrub out' data from raw HTML/CSS code.
	
	/**
	 * 
	 * @param link the unfiltered HTML code. Must have two quotation marks in it, no more, no less.
	 * @return the actual link within
	 */
	public static String scrubLink(String link) {
		String[] splitted = link.split("\"");
		if(splitted.length != 3) {
			return "";
		}else {
			return splitted[1];
		}
		//Split it into everything between quotation marks, and specifically return the 'middle' section as that's the actual quote.
		//A weakness of this is you should not send it links that have multiple quote marks in it.
	}
	
	/**
	 * Scrubs everything but plain-text from a 'paragraph' of HTML text.
	 * @return non-bracketed text from the paragraph.
	 */
	public static String scrubParagraph(String paragraph) {
		paragraph.replaceAll("<p>", "\n");
		return paragraph.replaceAll("<[^>]*>|\t", ""); //It just works.
	}
}
