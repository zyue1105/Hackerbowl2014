package Feature;

public class TreeGraphFeature extends FeatureList {
	public TreeGraphFeature() {
		super();
		addFeatures(new AddFeatures().AddTreeGraphFeatures());
	}
}
