package StreamerAndInterpreter;

import websiteTranscriber.*;

public class SourceReader {
	//This class is responsible for the actual logic of reading the site.
	private SiteStream site;
	private Template template;
	//private String curParagraph;
	
	public SourceReader(Template template) {
		this.template = template;
		site = new SiteStream(this.template.getSiteURL());
	}
	
	/**
	 * 
	 * @param Substring to search for.
	 * @return The entire line the substring was found in.
	 * @throws Exception 
	 */
	private String findSubString(String substring){
		if(this.site.getLine().contains(substring)) { //Check current line to see if it is the substring.
			return this.site.getLine();
		}
		while(this.site.hasLines()) { //Otherwise, advance until substring is found.
			if(this.site.advanceGet().contains(substring)) {
				System.out.println(this.site.getLine());
				return site.getLine();
			}
		}
		System.out.println("ERROR: Could not find substring: '" + substring + "'. Check template.");
		return "";
	}
	
	
	/**
	 * Loads everything from the start of brackets in the current line to the end of those
	 * brackets into one big string.
	 * @return the 'body 'paragraph', unfiltered
	 */
	private String loadParagraph() {
		String paragraph = site.getLine();
		System.out.println(paragraph);
		int numDivs = 0;
		numDivs += paragraph.split("<div").length - paragraph.split("</div>").length;
		System.out.println(numDivs);
		while(numDivs > 0) {
			paragraph += site.advanceGet();
			System.out.println(site.getLine());
			numDivs = paragraph.split("<div").length - paragraph.split("</div>").length;
			System.out.println(numDivs);
		}
		return paragraph;
	}
	
	public String loadText() {
		followLinks();
		findSubString(this.template.getBodyFormat());
		return ScrubUtils.scrubParagraph(loadParagraph());
	}
	
	/**
	 * Recursive algorithm.
	 * Goes through the entire ordering of links until it reaches the 'final' page (ie, when there are no more links to search for).
	 */
	public void followLinks() {
		followLinks(0);
	}
	
	private void followLinks(int placeInArray) {
		System.out.println(this.template.getLinkFormat().length - placeInArray);
		if(this.template.getLinkFormat().length - placeInArray == 0) {
			System.out.println("We're done!!");
		}else {
			findLink(placeInArray);
			this.site = new SiteStream(ScrubUtils.scrubLink(site.getLine()));
			followLinks(placeInArray + 1);
		}
	}
	
	/**
	 * finds and loads the appropriate link
	 * @param placeInArray
	 */
	private void findLink(int placeInArray) {
		Link linkToFind = this.template.getLinkFormat()[placeInArray];
		findSubString(linkToFind.getMark());
		for(int x = 0; x < linkToFind.getOffset(); x++) {
			this.site.advanceGet();
			System.out.println(this.site.getLine());
		}
	}
	
	

}


