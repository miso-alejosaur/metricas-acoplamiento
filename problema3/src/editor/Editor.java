package editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Editor {

	Validator validator;

	public Editor(Validator validator) {
		this.validator = validator;
	}

	public void runEditor() {
		Displayer.displayMessage("Running editor...");
		Displayer.displayMessage("Enter text:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text;
		try {
			text = br.readLine();
			this.validator.checkSpelling(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
