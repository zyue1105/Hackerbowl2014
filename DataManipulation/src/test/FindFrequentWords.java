package test;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import Question.Question;
import Question.QuestionBuilder;

public class FindFrequentWords {
	public static void main(String[] args) throws IOException, ParseException {
		String fileName = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_brain_teaser_1.json";
		List<Question> questions = new QuestionBuilder().build(fileName);
	}
}
