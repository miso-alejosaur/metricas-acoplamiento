package editor;

public class Main {
	public static void main(String[] args) {
		Validator validator = new Validator();
		Editor editor = new Editor(validator);
		editor.runEditor();
	}
}
