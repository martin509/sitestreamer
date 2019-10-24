package websiteTranscriber;

import java.io.*;
import java.util.LinkedList;

public class Template {
	//Holds info on how specifically to research the site. May follow multiple links but only one main article 'body'.
	private String siteURL;
	private final Link[] links;
	private String bodyFormat;
	
	private static String DEFAULT_FILENAME = "site_template.cfg";
	
	public String getSiteURL() {
		return siteURL;
	}
	public Link[] getLinkFormat() {
		return links;
	}
	public String getBodyFormat() {
		return bodyFormat;
	}
	
	public Template() {
		this(DEFAULT_FILENAME);
		//this("http://speedhunters.com", new String[] {"link"}, "body");
	}
	
	public Template(String filename) {
		File file = new File(filename);
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		}catch (FileNotFoundException e) {
			System.out.println("Could not find or read template file.");
			System.exit(0);
		}
		BufferedReader buffer = new BufferedReader(reader);
		int currentMode = 1; //1 is 'read title', 2 is 'read links', 3 is 'read body format', 0 is 'end'
		String line;
		try {
			line = buffer.readLine();
		} catch (IOException e) {
			line = null;
		}
		LinkedList<Link> linkBuffer = new LinkedList<Link>();
		while(line != null) {
			switch(line) {
			case "LINKS":
				currentMode = 2;
				break;
			case "BODY":
				currentMode = 3;
				break;
			case "END":
				currentMode = 0;
				break;
			default:
				interpretLine(line, currentMode, linkBuffer);
			}
			try {
				line = buffer.readLine();
			} catch (IOException e) {
				line = null;
			}
		}
		this.links = linkBuffer.toArray(new Link[0]);	
	}
	
	public Template(String siteURL, Link[] links, String bodyFormat) {
		this.siteURL = siteURL;
		this.links = links;
		this.bodyFormat = bodyFormat;
	}
	/**
	 * 
	 * @param line
	 * @param mode 1 is 'read title', 2 is 'read links', 3 is 'read body format', 0 is 'end'
	 */
	private void interpretLine(String line, int mode, LinkedList<Link> links) {
		switch(mode) {
		case 1:
			this.siteURL = line;
			break;
		case 2:
			String[] split = line.split("###");
			links.add(new Link(split[0], Integer.parseInt(split[1])));
			break;
		case 3:
			this.bodyFormat = line;
			break;
		}
	}
	
	public String toString() {
		String out = "";
		out += this.siteURL;
		out += "\n";
		if(this.links.length == 0) {
			out += "No links!";
			out += "\n";
		}else {
			for(int n = 0; n < this.links.length; n++) {
				out += this.links[n].getMark();
				out += ", ";
				out += this.links[n].getOffset();
				out += "\n";
			}
		}
		
		out += this.bodyFormat;
		return out;
	}
	
}