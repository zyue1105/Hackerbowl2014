package Feature;

public class DatabaseFeature extends FeatureList {
	public DatabaseFeature() {
		super();
		addFeatures(new AddFeatures().AddDBFeatures());
	}
}
