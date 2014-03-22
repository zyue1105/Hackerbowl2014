package JsonTest;

import org.json.JSONObject;

public class GraphTreeWordFrequency {
	public static void main(String[] args) {
		String myString = new JSONObject().put("JSON", "Hello, World!").toString();
		System.out.println(myString);
	}
}
