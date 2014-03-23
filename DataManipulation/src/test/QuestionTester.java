package test;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import Question.QuestionManipulator;

public class QuestionTester {
	public static void main(String[] args) throws IOException, ParseException {
		QuestionManipulator question = new QuestionManipulator();
		question.calculateFeatures("C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\tree_graph.json");
		question.OutputFeatures();
	}
}
