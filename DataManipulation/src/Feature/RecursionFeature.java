package Feature;

public class RecursionFeature extends FeatureList {
	public RecursionFeature() {
		super();
		addFeatures(new AddFeatures().AddRecursionFeatures());
	}
}
