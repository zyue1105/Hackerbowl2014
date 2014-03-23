package Feature;

public class TestFeature extends FeatureList {
	public TestFeature() {
		super();
		addFeatures(new AddFeatures().AddNetFeatures());

		addFeatures(new AddFeatures().AddTreeGraphFeatures());
	}
}
