package test;

import java.io.IOException;
import java.util.Set;

import org.json.simple.parser.ParseException;

import Question.Question;
import Question.QuestionBuilder;

public class QuestionTester {
	public static void main(String[] args) throws IOException, ParseException {
		String fileName = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_arrays_1.json";
		Set<Question> questions = new QuestionBuilder().build(fileName);
		//questions.get(0).OutputFeatureNames();
		for (Question question : questions) {
			question.OutputFeatures();
		}
		
		fileName = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_system_design_1.json";
		questions.clear();
		questions = new QuestionBuilder().build(fileName);
		System.out.println("\n");
		for (Question question : questions) {
			question.OutputFeatures();
		}
		
		fileName = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_tree_graph_1.json";
		questions.clear();
		questions = new QuestionBuilder().build(fileName);
		System.out.println("\n");
		for (Question question : questions) {
			question.OutputFeatures();
		}
	}
}
