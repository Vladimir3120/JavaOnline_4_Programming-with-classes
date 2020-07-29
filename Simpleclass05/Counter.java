package Simpleclass05;

public class Counter {

	private int min;
	private int max;
	private int current;

	public Counter(int min_, int max_, int current_) {

		min = min_;
		max = max_;
		current = current_;

		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		if (current < min)
			current = min;
		if (current > max)
			current = max;
	}

	public Counter(int min_, int max_) {
		this(min_, max_, min_);
		current = min;
	}

	public Counter() {
		this(0, 16, 0);
	}

	public void inc() {
		current++;
		if (current > max)
			current = min;
	}

	public void dec() {
		current--;
		if (current < min)
			current = max;
	}

	public int value() {
		return current;
	}
}