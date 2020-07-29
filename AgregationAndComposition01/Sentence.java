package AgregationAndComposition01;

public class Sentence {

	private String sentece = "";

	public Sentence(Word... words) {
		super();

		for (Word word : words) {
			sentece += word;

		}
	}

	@Override
	public String toString() {
		return sentece + "";
	}

}