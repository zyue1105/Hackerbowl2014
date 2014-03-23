package Question;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Feature.ArrayStringFeature;
import JsonTest.WordFrequency;

public class QuestionManipulator {

	private final static String QuestionList = "interview_questions_list";
	private final static String Question = "interview_questions";
	private final static String QuestionDescription = "title";

	String fileName = "";
	ArrayStringFeature arrayFeature = new ArrayStringFeature();

	public void calculateFeatures(String fileName) throws IOException, ParseException {
		Reader file = new FileReader(fileName);
		JSONParser parser = new JSONParser();
		JSONObject object = (JSONObject) parser.parse(file);
		file.close();
		JSONObject questionList = (JSONObject) object.get(QuestionList);
		JSONArray questions = (JSONArray) questionList.get(Question);
		String wordCollection = "";
		for (Object iterator : questions) {
			wordCollection += " " + ((JSONObject) iterator).get(QuestionDescription).toString();
		}
		String[] tokens = wordCollection.split(" ");
		for (String token : tokens) {
			if (token.equals("")) {
				continue;
			}
			arrayFeature.updateFeatureValue(token, false);
		}
	}
	
	public void OutputFeatures() {
		arrayFeature.outputNormalizedToConsole();
	//	arrayFeature.outputOriginalToConsole();
	}

}
