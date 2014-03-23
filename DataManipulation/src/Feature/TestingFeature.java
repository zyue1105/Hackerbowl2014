package Feature;

public class TestingFeature extends FeatureList {
	public TestingFeature() {
		super();
		addFeatures(new AddFeatures().AddTestingFeatures());
	}
}
