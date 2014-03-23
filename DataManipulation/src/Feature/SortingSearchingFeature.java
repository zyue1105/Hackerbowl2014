package Feature;

public class SortingSearchingFeature extends FeatureList{
	public SortingSearchingFeature() {
		super();
		addFeatures(new AddFeatures().AddSortSearchFeatures());
	}
}
