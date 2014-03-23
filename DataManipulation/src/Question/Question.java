package Question;

import Feature.ArrayStringFeature;
import Feature.Feature;
import Feature.LinkedListFeature;
import Feature.StackQueueFeature;
import Feature.TreeAndArrayFeature;
import Feature.TreeGraphFeature;

public class Question implements Comparable<Question> {
	private String title = "";
	private Integer voteCount = 0;
	private Integer Answers = 0;
	private TreeAndArrayFeature arrayFeature = new TreeAndArrayFeature();

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
