package Question;

//import Feature.ArrayStringFeature;
//import Feature.Feature;
//import Feature.LinkedListFeature;
//import Feature.StackQueueFeature;
//import Feature.TreeAndArrayFeature;
//import Feature.TreeGraphFeature;

import java.util.ArrayList;
import java.util.List;

import Feature.FeatureList;
import Feature.TestFeature;
import Feature.TotalFeature;

public class Question implements Comparable<Question> {
	private String title = "";
	private Integer voteCount = 0;
	private Integer Answers = 0;
	//private TotalFeature arrayFeature = new TotalFeature();
	private FeatureList arrayFeature = new TotalFeature();
	private String location = "";
	private List<String> classes = new ArrayList<String>();

	public Question(String question, String answers) {
		title = question;
		String[] tokens = question.split(" ");
		for (String token : tokens) {
			if (!token.equals("")) {
				arrayFeature.updateFeatureValue(token, false);
			}
		}
		tokens = answers.split(" ");
		for (String token : tokens) {
			if (!token.equals("")) {
				arrayFeature.updateFeatureValue(token, true);
			}
		}
	}
	
	public void setVote(Integer votes) {
		voteCount = votes;
	}
	
	public void setUrl(String url) {
		location = url;
	}
	
	public void setAnswer(Integer answer) {
		Answers = answer;
	}
	
	public Integer getVote() {
		return voteCount;
	}
	
	public Integer getAnswer() {
		return Answers;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getUrl() {
		return location;
	}
	
	public List<String> getClasses() {
		return classes;
	}
	
	public void addClass(String m_class) {
		classes.add(m_class);
	}
	
	public void addClasses(List<String> classes) {
		(this.classes).addAll(classes);
	}
	
	public FeatureList getFeature() {
		return arrayFeature;
	}
	
	public void OutputFeatures() {
		arrayFeature.outputNormalizedToConsole();
	//	arrayFeature.outputOriginalToConsole();
	}
	
	public void OutputFeatureNames() {
		arrayFeature.printHead();
	}
	
	@Override
	public int compareTo(Question other) {
		if(this.Answers==other.Answers){
            return this.title.compareTo(other.title);
        }
        return (int) (other.Answers-this.Answers);
	}
}
