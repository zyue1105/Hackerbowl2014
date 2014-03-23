package Feature;

public class CPPFeature extends FeatureList{
	public CPPFeature() {
		super();
		addFeatures(new AddFeatures().AddCPPFeatures());
	}
}
