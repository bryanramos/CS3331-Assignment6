package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPlanner implements Criteria {
	@Override
	public List<Vendor> meetCriteria(List<Vendor> vendors) {
		List<Vendor> planners = new ArrayList<Vendor>();
		
		for (Vendor vendor : vendors) {
			if (vendor.getType().equalsIgnoreCase("Planners")) {
				planners.add(vendor);
			}
		}
		return planners;
	}
}
