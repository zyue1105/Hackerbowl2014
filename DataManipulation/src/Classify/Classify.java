package Classify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.simple.parser.ParseException;

import Feature.FeatureList;

public class Classify {
	private Map<FeatureList, String> template = null;
	private final static Double Threshold = 0.9;
	public Classify() {
		try {
			template = new Train().train();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> classifyResult(FeatureList toClassify) {
		List<String> ret = new ArrayList<String>();
		for (Map.Entry<FeatureList, String> entry : template.entrySet()) {
			if (entry.getKey().cosine(toClassify) >= Threshold) {
				ret.add(entry.getValue());
			}
		}
		return ret;
	}
}
