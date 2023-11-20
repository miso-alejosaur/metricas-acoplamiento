package editor;

import java.util.ArrayList;

public class Validator implements IValidator {
	
	public void checkSpelling(String text) {
		ArrayList<String> errors = this.check(text);
		if(errors != null)
			Displayer.displayErrors(errors);
		else
			Displayer.displaySuccessMessage();
	}

	private ArrayList<String> check(String text) {
		String[] words = text.split("");
		ArrayList<String> errors = new ArrayList<String>();
		for(int i=0; i< words.length; i++) {
			String[] realWords = {"foo", "bar"};
			for(int j=0; j<realWords.length; j++) {
				if(!words[i].equalsIgnoreCase(realWords[j])) {
					errors.add(words[i]);
				}
			}
		}
		return errors;
	}
}
