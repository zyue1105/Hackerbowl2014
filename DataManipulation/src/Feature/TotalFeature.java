package Feature;

public class TotalFeature extends FeatureList {
	public TotalFeature() {
		super();
		addFeatures(new AddFeatures().AddArrayStringFeatures());
		addFeatures(new AddFeatures().AddBitManiFeatures());
		addFeatures(new AddFeatures().AddCPPFeatures());
		addFeatures(new AddFeatures().AddDBFeatures());
		addFeatures(new AddFeatures().AddJavaFeatures());
		addFeatures(new AddFeatures().AddLinkedListFeatures());
		addFeatures(new AddFeatures().AddMathFeatures());
		addFeatures(new AddFeatures().AddNetFeatures());
		addFeatures(new AddFeatures().AddOODFeatures());
		addFeatures(new AddFeatures().AddRecursionFeatures());
		addFeatures(new AddFeatures().AddSortSearchFeatures());
		addFeatures(new AddFeatures().AddStackQueueFeatures());
		addFeatures(new AddFeatures().AddTestingFeatures());
		addFeatures(new AddFeatures().AddThreadsFeatures());
		addFeatures(new AddFeatures().AddTreeGraphFeatures());
	}
}
