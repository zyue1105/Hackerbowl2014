package Feature;

public class TreeAndArrayFeature extends FeatureList {
	public TreeAndArrayFeature() {
		super();
		addFeatures(new AddFeatures().AddArrayStringFeatures());
		addFeatures(new AddFeatures().AddTreeGraphFeatures());
	}
}
