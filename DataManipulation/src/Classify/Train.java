package Classify;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Question.Question;
import Question.QuestionBuilder;

public class Train {
	private final static String path = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\";
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
	
	public static List<Double> getVector(String fileName) throws IOException, ParseException {
		JSONArray questionArray = generateJSONArray(path+fileName);
		String questiontext = "";
		String qatext = "";
		for (Object entry : questionArray) {
			JSONObject questionEntry = (JSONObject) entry;
			questiontext += " " + getQuestionDescription(questionEntry);
			qatext += " " + getQuestionDescription(questionEntry);
			qatext += " " + getQuestionCommentsDescription(questionEntry);
		}
		Question training = new Question(questiontext, qatext);
		return training.getFeature().getNormalizedVector();
	}
	
	public static void write(BufferedWriter writer, String title, List<Double> vector) throws IOException {
		writer.write(title+"\t");
		for (Double value : vector) {
			writer.write(String.format("%.6f\t", value));
		}
		writer.newLine();
	}
	
	//public static void training(String title, List<>)
	
	public static void main(String[] args) throws IOException, ParseException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(path+"training model.csv"));
		String fileName = "amazon_algorithm_1.json";
		List<Double> SD = getVector(fileName);
		write(writer, "Algorithm", SD);
		
		fileName = "amazon_arrays_1.json";
		SD = getVector(fileName);
		write(writer, "Array & String", SD);
		
		fileName = "amazon_bitmanipulation_1.json";
		SD = getVector(fileName);
		write(writer, "Bit Manipulation", SD);
		
		fileName = "amazon_brain_teaser_1.json";
		SD = getVector(fileName);
		write(writer, "Brain Teaser", SD);
		
		fileName = "amazon_Cplusplus_1.json";
		SD = getVector(fileName);
		write(writer, "C++", SD);
		
		fileName = "amazon_database_1.json";
		SD = getVector(fileName);
		write(writer, "DataBase", SD);
		
		fileName = "amazon_java_1.json";
		SD = getVector(fileName);
		write(writer, "Java", SD);
		
		fileName = "amazon_linkedlist_1.json";
		SD = getVector(fileName);
		write(writer, "Linked List", SD);
		
		fileName = "amazon_math_1.json";
		SD = getVector(fileName);
		write(writer, "Mathematical and Computing", SD);
		
		fileName = "amazon_network_1.json";
		SD = getVector(fileName);
		write(writer, "Networking", SD);
		
		fileName = "amazon_ood_1.json";
		SD = getVector(fileName);
		write(writer, "Object Oriented Design", SD);
		
		fileName = "amazon_system_design_1.json";
		SD = getVector(fileName);
		write(writer, "System Design", SD);
		
		fileName = "amazon_testing_1.json";
		SD = getVector(fileName);
		write(writer, "Testing", SD);
		
		fileName = "amazon_tree_graph_1.json";
		SD = getVector(fileName);
		write(writer, "Tree & Graph", SD);
		
		writer.close();
	}
}
