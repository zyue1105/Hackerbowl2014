package JsonTest;

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

import Question.Question;

public class GraphTreeWordFrequency {
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
		String fileName = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\amazon_ood_1.json";
		JSONArray questionArray = generateJSONArray(fileName);
		String text = "";
		for (Object entry : questionArray) {
			JSONObject questionEntry = (JSONObject) entry;
			text += " " + getQuestionDescription(questionEntry);
			text += " " + getQuestionCommentsDescription(questionEntry);
		}
		String[] tokens = text.split(" ");
		Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
		for (String token : tokens) {
			if (token.equals("")) {
				continue;
			}
			if (wordFrequency.get(token.toLowerCase()) == null) {
				wordFrequency.put(token.toLowerCase(), 0);
			}
			wordFrequency.put(token.toLowerCase(), wordFrequency.get(token.toLowerCase()) + 1);
		}
		Set<WordFrequency> queue = new TreeSet<WordFrequency>();
		for (Map.Entry<String, Integer> wf : wordFrequency.entrySet()) {
			queue.add(new WordFrequency(wf.getKey(), wf.getValue()));
		}
		for (WordFrequency wf : queue) {
			System.out.println(wf.name + " " + wf.count);
		}
	}
}
