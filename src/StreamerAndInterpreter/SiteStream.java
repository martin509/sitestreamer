package StreamerAndInterpreter;

import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

class SiteStream { //Reads the site into an organized Reader.
	
	private URL url;
	private BufferedReader reader;
	private String currentLine; //buffer where you can hold the current line of the website source
	
	/**
	 * Sets up a SiteStream object from a URL.
	 * @param url The website URL (ie. http://www.speedhunters.com)
	 */
	public SiteStream(String url) {
		try {
			this.url = new URL(url);
			this.reader = new BufferedReader(new InputStreamReader(this.url.openStream()));
			
		} catch (MalformedURLException e) {
			System.out.println("Invalid URL Error.");
			System.out.println(url);
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Invalid URL IO Exception Error. Check Internet Connection.");
			System.out.println(url);
			//e.printStackTrace();
			System.exit(0);
		}
		currentLine = "";
	}
	
	/**
	 * Advances the current line and puts the result in currentLine.
	 */
	private void advanceLine() {
		try {
			this.currentLine = this.reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the current line without advancing the stream.
	 * @return the current line.
	 */
	public String getLine() {
		return currentLine;
	}
	
	/**
	 * Helper function that advances the line and then returns what was advanced.
	 * @return the line advanced to.
	 */
	public String advanceGet() {
		advanceLine();
		return currentLine;
	}
	
	/**
	 * 
	 * @return Whether or not there are any more lines to be read in the web page.
	 */
	public boolean hasLines() {
		return this.currentLine != null;
	}
	

	

}
