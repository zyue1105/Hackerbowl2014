package Question;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

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
		return Integer.getInteger(retString);
	}
	
	public Integer getQuestionAnswerCount(JSONObject questionEntry) {
		JSONObject question = getQuestion(questionEntry);
		String retString = (String) question.get(AnswersCount);
		return Integer.getInteger(retString);
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
	
	public List<Question> build(String fileName) throws IOException, ParseException {
		JSONArray questionArray = generateJSONArray(fileName);
		List<Question> questionList = new ArrayList<Question>();
		for (Object entry : questionArray) {
			JSONObject questionEntry = (JSONObject) entry;
			String title = getQuestionDescription(questionEntry);
			String answers = getQuestionCommentsDescription(questionEntry);
			Question question = new Question(title, answers);
			question.setAnswer(getQuestionAnswerCount(questionEntry));
			question.setVote(getQuestionVote(questionEntry));
			questionList.add(question);
		}
		return questionList;
	}
}
