package Feature;

import java.util.ArrayList;
import java.util.List;

public class AddFeatures {
	public List<Feature> AddArrayStringFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("Array_Q_Array", new String[] { "Array" }));
		ret.add(new Feature("Array_Q_ArrayList", new String[] { "ArrayList" }));
		ret.add(new Feature("Array_Q_String", new String[] { "String" }));
		ret.add(new Feature("Array_Q_StringBuffer", new String[] { "StringBuffer" }));
		ret.add(new Feature("Array_Q_Add", new String[] { "Add" }));
		ret.add(new Feature("Array_Q_IndexOf", new String[] { "IndexOf" }));
		ret.add(new Feature("Array_Q_Last", new String[] { "Last" }));
		ret.add(new Feature("Array_Q_First", new String[] { "First" }));
		ret.add(new Feature("Array_Q_Remove", new String[] { "Remove" }));
		ret.add(new Feature("Array_Q_All", new String[] { "Array", "ArrayList", "String",
				"StringBuffer", "Add", "IndexOf", "Last", "First" }));
		// maybe some more
		ret.add(new Feature(true, "Array_QA_Array", new String[] { "Array" }));
		ret.add(new Feature(true, "Array_QA_ArrayList", new String[] { "ArrayList" }));
		ret.add(new Feature(true, "Array_QA_String", new String[] { "String" }));
		ret.add(new Feature(true, "Array_QA_StringBuffer", new String[] { "StringBuffer" }));
		ret.add(new Feature(true, "Array_QA_Add", new String[] { "Add" }));
		ret.add(new Feature(true, "Array_QA_IndexOf", new String[] { "IndexOf" }));
		ret.add(new Feature(true, "Array_QA_Last", new String[] { "Last" }));
		ret.add(new Feature(true, "Array_QA_First", new String[] { "First" }));
		ret.add(new Feature(true, "Array_QA_Remove", new String[] { "Remove" }));
		ret.add(new Feature(true, "Array_QA_All", new String[] { "Array", "ArrayList", "String",
				"StringBuffer", "Add", "IndexOf", "Last", "First" }));
		return ret;
	}
}
