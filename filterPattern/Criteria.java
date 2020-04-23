package filterPattern;

import java.util.List;

public interface Criteria {
	public List<Vendor> meetCriteria(List<Vendor> vendors);
}
