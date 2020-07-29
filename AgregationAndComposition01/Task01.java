package AgregationAndComposition01;

public class Task01 {

	public static void main(String[] args) {

		Word w1 = new Word("Shla");
		Word w2 = new Word("Sasha");
		Word w3 = new Word("po");
		Word w4 = new Word("shosse");
		Word w5 = new Word("i");
		Word w6 = new Word("sosals");
		Word w7 = new Word("sushku");

		Sentence sentence = new Sentence(w1, w2, w3, w4, w5, w6, w7);

		Text text = new Text("Saha", sentence);

		System.out.println(text);

		Word w8 = new Word(">>END<<");

		Sentence sentence2 = new Sentence(w1, w2, w3, w4, w5, w6, w7, w8);

		text = new Text("Sasha", sentence2);

		System.out.println(text);

	}
}
