package Feature;

public class ThreadFeature extends FeatureList {
	public ThreadFeature() {
		super();
		addFeatures(new AddFeatures().AddThreadsFeatures());
	}
}
