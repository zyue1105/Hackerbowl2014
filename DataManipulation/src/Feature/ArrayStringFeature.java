package Feature;

public class ArrayStringFeature extends FeatureList {

	public ArrayStringFeature() {
		super();
		addFeatures(new AddFeatures().AddArrayStringFeatures());
	}
}
