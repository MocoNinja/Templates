import processing.core.PApplet;

/**
 * In processing IDE, *setup()* sets the size of the window as well as the other
 * parameters In this case, the size of the window must be specified at
 * *settings()*
 */
public class ProcessingApp extends PApplet {
	private final int WIDTH = 1200, HEIGHT = 900;

	public static void main(String[] args) {
		PApplet.main("ProcessingApp");
	}

	public void settings() {
		size(WIDTH, HEIGHT);
	}

	public void setup() {
		background(0);
		stroke(255);
		strokeWeight(10);
	}

	public void draw() {
		line(0, 0, 500, 500);
	}
}