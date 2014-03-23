package Question;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Set;
import java.util.TreeSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class QuestionBuilder {
	private final static String VoteCount = "votes";
	private final static String AnswersCount = "answersCount";
	private final static String Answers = "interview_question_comments";
	private final static String Question = "question";
	private final static String QuestionDescription = "title";
	private final static String Location = "location";
	
	public JSONObject generateJSONObject(String fileName) throws IOException, ParseException {
		Reader file = new FileReader(fileName);
		JSONParser parser = new JSONParser();
		JSONObject object = (JSONObject) parser.parse(file);
		file.close();
		return object;
	}
	
	public JSONArray generateJSONArray(String fileName) throws IOException, ParseException {
		Reader file = new FileReader(fileName);
		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(file);
		file.close();
		return array;
	}
	
	public JSONObject getQuestion(JSONObject questionEntry) {
		JSONObject question = (JSONObject)questionEntry.get(Question);
		return question;
	}
	
	public Integer getQuestionVote(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		String retString = (String) question.get(VoteCount);
		Integer ret = Integer.parseInt(retString);
		return ret;
	}
	
	public String getLocation(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		return (String) question.get(Location);
	}
	
	public Integer getQuestionAnswerCount(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		String retString = (String) question.get(AnswersCount);
		Integer ret = Integer.parseInt(retString);
		return ret;
	}
	
	public String getQuestionDescription(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		return (String) question.get(QuestionDescription);
	}
	
	public JSONArray getQuestionComments(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		return (JSONArray) question.get(Answers);
	}
	
	public String getQuestionCommentsDescription(JSONObject questionEntry) {
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
	
	public Set<Question> build(String fileName) throws IOException, ParseException {
		JSONArray questionArray = generateJSONArray(fileName);
		Set<Question> questionList = new TreeSet<Question>();
		for (Object entry : questionArray) {
			JSONObject questionEntry = (JSONObject) entry;
			String title = getQuestionDescription(questionEntry);
			String answers = getQuestionCommentsDescription(questionEntry);
			Question question = new Question(title, answers);
			question.setAnswer(getQuestionAnswerCount(questionEntry));
			question.setVote(getQuestionVote(questionEntry));
			question.setUrl(getLocation(questionEntry));
			questionList.add(question);
		}
		return questionList;
	}
}
