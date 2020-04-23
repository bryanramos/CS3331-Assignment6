package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class TypeCriteria implements Criteria {
	
	@Override
	public List<Vendor> meetCriteria(List<Vendor> vendors) {
		List<Vendor> vendorsOfType = new ArrayList<Vendor>();
	
		for (Vendor vendor : vendors) {
			if (vendor.getType().equalsIgnoreCase("Venues")) {
				vendorsOfType.add(vendor);
			}

		}
		
		return vendorsOfType;
	}
}
