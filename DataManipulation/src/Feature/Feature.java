package Feature;

import java.util.ArrayList;
import java.util.List;

public class Feature implements Comparable<Feature>{
	protected List<String> featureKey = new ArrayList<String>();
	protected double featureValue = 0.0;
	public String name = "";
	public boolean QA = false;
	
	public void addFeatureKey(String feature) {
		featureKey.add(feature.toLowerCase());
		featureValue = 0.0;
	}
	
	public Feature(String name, String[] featureKeys) {
		this.name = name;
		for (String key : featureKeys) {
			addFeatureKey(key);
		}
	}
	
	public Feature(boolean QA, String name, String[] featureKeys) {
		this.QA = QA;
		this.name = name;
		for (String key : featureKeys) {
			addFeatureKey(key);
		}
	}
	
	public String getFeatureName() {
		return name;
	}

	public List<String> getFeatureKeys() {
		return featureKey;
	}

	public Double getFeatureValue() {
		return featureValue;
	}

	public void updateFeatureValue(String token, boolean QA) {
		if (!this.QA && QA) {
			return;
		}
		for (String featureName : featureKey) {
			if (token.toLowerCase().contains(featureName)) {
				featureValue += 1.0;
				return;
			}
		}
	}

	@Override
	public int compareTo(Feature other) {
		if(this.featureValue==other.featureValue){
            return this.name.compareTo(other.name);
        }
        return (int) (other.featureValue-this.featureValue);
	}
}
