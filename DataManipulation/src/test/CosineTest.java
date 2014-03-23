package test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Question.Question;
import Question.QuestionBuilder;

public class CosineTest {
	private final static String Answers = "interview_question_comments";
	private final static String Question = "question";
	private final static String QuestionDescription = "title";
	
	public static JSONArray generateJSONArray(String fileName) throws IOException, ParseException {
		Reader file = new FileReader(fileName);
		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(file);
		file.close();
		return array;
	}
	
	public static String getQuestionDescription(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		return (String) question.get(QuestionDescription);
	}
	
	public static JSONObject getQuestion(JSONObject questionEntry) {
		JSONObject question = (JSONObject)questionEntry.get(Question);
		return question;
	}
	
	public static JSONArray getQuestionComments(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		return (JSONArray) question.get(Answers);
	}
	
	public static String getQuestionCommentsDescription(JSONObject questionEntry) {
		JSONArray comments = getQuestionComments(questionEntry);
		if (comments == null) {
			return "";
		}
		String commentsString = "";
		for (Object comment : comments) {
			commentsString += " " + (String)((JSONObject) comment).get(QuestionDescription);
		}
		return commentsString;
	}
	
	
	
	public static void main(String[] args) throws IOException, ParseException {
		String fileName = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_tree_graph_1.json";
		JSONArray questionArray = generateJSONArray(fileName);
		String questiontext = "";
		String qatext = "";
		for (Object entry : questionArray) {
			JSONObject questionEntry = (JSONObject) entry;
			questiontext += " " + getQuestionDescription(questionEntry);
			qatext += " " + getQuestionDescription(questionEntry);
			qatext += " " + getQuestionCommentsDescription(questionEntry);
		}
		Question training = new Question(questiontext, qatext);
		List<Question> questions = new QuestionBuilder().build("C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_arrays_1.json");
		questions.get(0).OutputFeatureNames();
		for (Question question : questions) {
			question.OutputFeatures();
			System.out.println(training.getFeature().cosine(question.getFeature()));
		}
	}
}
