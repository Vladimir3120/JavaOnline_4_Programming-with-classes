package AgregationAndComposition01;

public class Text {

	private String text = "";
	private String header = "";

	public Text(String header, Sentence... sentences) {
		super();
		this.header = header;
		for (Sentence sentence : sentences) {

			text += sentence;

		}
	}

	@Override
	public String toString() {
		return "\t" + header + "\n" + text;
	}

}
