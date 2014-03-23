package Feature;

public class StackQueueFeature extends FeatureList {
	public StackQueueFeature() {
		super();
		addFeatures(new AddFeatures().AddStackQueueFeatures());
	}
}
