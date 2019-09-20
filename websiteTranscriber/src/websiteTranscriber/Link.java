package websiteTranscriber;

public class Link {
	String mark;
	int offset;
	public Link(String mark, int offset) {
		this.mark = mark;
		this.offset = offset;
	}
	public String getMark() {
		return mark;
	}
	public int getOffset() {
		return offset;
	}
	
}
