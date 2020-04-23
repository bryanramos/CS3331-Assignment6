package filterPattern;

import java.util.List;

public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Vendor> meetCriteria(List<Vendor> vendors) {
		List<Vendor> firstCriteriaItems = criteria.meetCriteria(vendors);
		List<Vendor> otherCriteriaItems = otherCriteria.meetCriteria(vendors);
		
		for (Vendor vendor : otherCriteriaItems) {
			if (!firstCriteriaItems.contains(vendor)) {
				firstCriteriaItems.add(vendor);
			}
		}
		return firstCriteriaItems;
	}
}
