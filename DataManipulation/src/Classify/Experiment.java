package Classify;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import Question.Question;
import Question.QuestionBuilder;

public class Experiment {
	private static Classify m_classifier = new Classify();
	private static Classes m_classes = new Classes();
	private static JSONObject m_output = new JSONObject();
	private final static String path = "C:\\Users\\Yin\\Documents\\GitHub\\Hackerbowl2014\\DataReal\\";
	
	@SuppressWarnings("unchecked")
	public static void buildRootNode() {
		m_output.put("name", "Campany");
		m_output.put("children", new JSONArray());
	}

	public static void main(String[] args) throws IOException {
		buildRootNode();
		buildFromFiles(new String[] {"amazon", "microsoft", "google", "facebook"});
		outputToFile();
	}

	private static void outputToFile() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(path+"Experiment1.json"));
		m_output.writeJSONString(writer);
		writer.close();
	}

	public static void buildFromFiles(String[] files) {
		for (String file : files) {
			buildFromFile(file);
		}
	}

	public static void buildFromFile(String file) {
		Set<Question> questions = null;
		try {
			questions = new QuestionBuilder().build(path + file + ".json");
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buildQuestions(questions, file);
	}

	public static void buildQuestions(Set<Question> questions, String company) {
		for (Question question : questions) {
			List<String> classes = m_classifier.classifyResult(question.getFeature());
			question.addClasses(classes);
		}
		buildJSONNode(questions, company);
	}

	@SuppressWarnings("unchecked")
	public static void buildJSONNode(Set<Question> questions, String company) {
		JSONObject node = getChildNode(m_output, company);
		Integer count = 0;
		for (Question question :questions) {
			count += buildHighClassNode(node, question);
		}
		node.put("size", count);
		
	}
	
	@SuppressWarnings("unchecked")
	public static Integer buildHighClassNode(JSONObject company, Question question) {
		List<String> classes = question.getClasses();
		for (String eachClass : classes) {
			String highClass = m_classes.map.get(eachClass);
			JSONObject node = getChildNode(company, highClass);
			Integer count = (Integer) node.get("size") + 1;
			node.put("size", count);
			buildLowClassNode(node, question, eachClass);
		}
		Integer count = 0;
		for (Object obj : (JSONArray) company.get("children")) {
			count += (Integer)((JSONObject) obj).get("size");
		}
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public static void buildLowClassNode(JSONObject highClass, Question question, String lowClass) {
		JSONObject node = getChildNode(highClass, lowClass);
		Integer count = (Integer) node.get("size") + 1;
		node.put("size", count);
		buildQuestionNode(node, question, count);
	}

	@SuppressWarnings("unchecked")
	public static void buildQuestionNode(JSONObject lowClass, Question question, Integer count) {
		JSONArray questionList = (JSONArray) lowClass.get("children");
		JSONObject questionNode = new JSONObject();
		questionNode.put("name", String.format("Question #%d", count));
		questionNode.put("votes", question.getVote());
		questionNode.put("size", question.getAnswer());
		questionNode.put("location", question.getUrl());
		questionNode.put("title", question.getTitle());
		questionList.add(questionNode);
	}
	
	@SuppressWarnings("unchecked")
	public static JSONObject getChildNode(JSONObject obj, String name) {
		JSONArray list = (JSONArray) obj.get("children");
		JSONObject node = null;
		if (list.size() == 0) {
			node = new JSONObject();
			node.put("name", name);
			node.put("size", 0);
			node.put("children", new JSONArray());
			list.add(node);
			return node;
		} else {
			for (Object company : list) {
				if (((JSONObject) company).get("name").equals(name)) {
					return (JSONObject) company;
				}
			}
			node = new JSONObject();
			node.put("name", name);
			node.put("size", 0);
			node.put("children", new JSONArray());
			list.add(node);
			return node;
		}
	}
}
