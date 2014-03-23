package Feature;

import java.util.ArrayList;
import java.util.List;

public class FeatureList {
	protected List<Feature> features = new ArrayList<Feature>();

	public void addFeature(Feature feature) {
		features.add(feature);
	}
	
	public void addFeatures(List<Feature> featureList) {
		features.addAll(featureList);
	}

	public List<Feature> getFeatureKeys() {
		return features;
	}

	public void updateFeatureValue(String token, boolean QA) {
		for (Feature feature : features) {{
				feature.updateFeatureValue(token, QA);
			}
		}
	}

	public List<Double> getNormalizedVector() {
		List<Double> ret = new ArrayList<Double>();
		Double normalizer = 0.0;
		for (Feature feature : features) {
			Double value = feature.getFeatureValue();
			ret.add(value);
			normalizer += value*value;
		}
		normalizer = Math.sqrt(normalizer);
		int size = ret.size();
		for (int index = 0; index < size; index++) {
			ret.set(index, 1.0 * ret.get(index) / normalizer);
		}
		return ret;
	}
	
	public double cosine(FeatureList target) {
		List<Double> vec1 = getNormalizedVector();
		List<Double> vec2 = target.getNormalizedVector();
		Double ret = 0.0;
		int size = vec1.size();
		for (int index = 0; index < size; index++) {
			ret += vec1.get(index) * vec2.get(index);
		}
		return ret;
	}

	public void outputOriginalToConsole() {
		printHead();
		printValue();
		System.out.println();
	}

	public void outputOriginalToFile(String fileName) {
		
	}

	public void outputNormalizedToConsole() {
//		printHead();
//		printNValue();
//		System.out.println();
		int size = features.size();
		List<Double> values = getNormalizedVector();
		for (int index = 0; index < size; index++) {
			System.out.println(features.get(index).getFeatureName() + "\t" + features.get(index).getFeatureValue() + "\t" + values.get(index));
		}
	}

	public void outputNormalizedToFile(String fileName) {
		
	}
	
	public void printHead() {
		for (Feature feature : features) {
			System.out.print(feature.getFeatureName() + '\t');
		}
		System.out.println();
	}
	
	public void printValue() {
		for (Feature feature : features) {
			System.out.print(String.format("%.2f\t\t\t",feature.getFeatureValue()));
		}
		System.out.println();
	}
	
	public void printNValue() {
		for (Double value : getNormalizedVector()) {
			System.out.print(String.format("%.2f\t\t\t",value));
		}
		System.out.println();
	}
	
}
