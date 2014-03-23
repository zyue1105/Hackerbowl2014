package JsonTest;

import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class GraphTreeWordFrequency {
	private final static String QuestionList = "interview_questions_list";
	private final static String Question = "interview_questions";
	private final static String QuestionDescription = "title";
	
	public static void main(String[] args) throws IOException, ParseException {
		Reader file = new FileReader(
				"C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\tree_graph.json");
		JSONParser parser = new JSONParser();
		JSONObject object = (JSONObject)parser.parse(file);
		file.close();
		JSONObject questionList = (JSONObject)object.get(QuestionList);
		JSONArray questions = (JSONArray)questionList.get(Question);
		String wordCollection = "";
		for (Object iterator : questions) {
			wordCollection += " " + ((JSONObject)iterator).get(QuestionDescription).toString();
		}
		String[] tokens = wordCollection.split(" ");
		Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
		for (String token : tokens) {
			if (token.equals("")) {
				continue;
			}
			if (wordFrequency.get(token) == null) {
				wordFrequency.put(token, 0);
			}
			wordFrequency.put(token, wordFrequency.get(token) + 1);
		}
		PriorityQueue<WordFrequency> queue = new PriorityQueue<WordFrequency>();
		for (Map.Entry<String, Integer> wf : wordFrequency.entrySet()) {
			queue.add(new WordFrequency(wf.getKey(), wf.getValue()));
		}
		for (WordFrequency wf : queue) {
			System.out.println(wf.name + " " + wf.count);
		}
	}
}
