package Feature;

public class NetworkFeature extends FeatureList {
	public NetworkFeature() {
		super();
		addFeatures(new AddFeatures().AddNetFeatures());
	}
}
