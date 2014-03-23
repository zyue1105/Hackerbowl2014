package test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Question.Question;
import Question.QuestionBuilder;

public class OutputTest {
	private final static String path = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataSample\\";
		
	@SuppressWarnings("unchecked")
	public static JSONArray createAmazon(String[] files, String[] classString) throws IOException, ParseException {
		JSONArray amazon = new JSONArray();
		JSONObject obj = new JSONObject();
		obj.put("name", "Amazon");
		JSONArray classes = new JSONArray();
		for (int i = 0; i < files.length; i++) {
			buildLowLevelClass(classes, classString[i], files[i]);
		}
		obj.put("children", classes);
		amazon.add(obj);
		return amazon;
	}
	
	
	@SuppressWarnings("unchecked")
	public static JSONObject buildJSONOutput(String[] files, String[] classString) throws IOException, ParseException {
		JSONObject obj = new JSONObject();
		obj.put("name", "Campany");
		obj.put("children", createAmazon(files, classString));
		return obj;
	}
	
	@SuppressWarnings("unchecked")
	public static JSONArray buildLowLevelClass(JSONArray classes, String cls, String fileName) throws IOException, ParseException {
		JSONObject obj = new JSONObject();
		obj.put("name", cls);
		obj.put("size", 30);
		obj.put("children", buildLeafQuestion(null, fileName));
		classes.add(obj);
		return classes;
	}
	
	@SuppressWarnings("unchecked")
	public static JSONArray buildLeafQuestion(JSONArray array, String fileName) throws IOException, ParseException {
		Set<Question> questions = new QuestionBuilder().build(path+fileName);
		if (array == null) array = new JSONArray();
		int index = 0;
		for (Question question : questions) {
			index++;
			JSONObject obj = new JSONObject();
			obj.put("name", String.format("Question #%d", index));
			obj.put("votes", question.getVote());
			obj.put("answerCount", question.getAnswer());
			obj.put("location", question.getUrl());
			obj.put("title", question.getTitle());
			array.add(obj);
		}
		return array;
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
		BufferedWriter writer = new BufferedWriter(new FileWriter(path+"question with class structure.json"));
//		String[] files = {"amazon_algorithm_1.json", "amazon_arrays_1.json", "amazon_bitmanipulation_1.json", "amazon_brain_teaser_1.json",
//				"amazon_Cplusplus_1.json", "amazon_database_1.json", "amazon_java_1.json", "amazon_linkedlist_1.json",
//				"amazon_math_1.json", "amazon_network_1.json", "amazon_ood_1.json", "amazon_system_design_1.json", "amazon_testing_1.json", "amazon_tree_graph_1.json"};
//		String[] classes = {"Algorithm", "Array & String", "Bit Manipulation", "Brain Teaser", "C++", "DataBase",
//				"Java", "Linked List", "Mathematical and Computing", "Networking", "Object Oriented Design", "System Design", "Testing", "Tree & Graph"};
		String[] files = {"amazon_algorithm_1.json", "amazon_arrays_1.json"};
		String[] classes = {"Algorithm", "Array & String"};
		JSONObject obj = buildJSONOutput(files, classes);
		obj.writeJSONString(writer);
		writer.close();
	}
}
