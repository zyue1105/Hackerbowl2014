package Feature;

public class MathematicalFeature extends FeatureList {
	public MathematicalFeature() {
		super();
		addFeatures(new AddFeatures().AddMathFeatures());
	}
}
