package JsonTest;

public class WordFrequency implements Comparable<WordFrequency>  {
	public String name = "";
	public int count = 0;
	
	public WordFrequency(String n, Integer c) {
		name = n;
		count = c;
	}
	
	public int compareTo(WordFrequency otherWord) {
        if(this.count==otherWord.count){
            return this.name.compareTo(otherWord.name);
        }
        return (otherWord.count-this.count);
    }
}
