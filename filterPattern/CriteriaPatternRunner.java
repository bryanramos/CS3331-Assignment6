package filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternRunner {

	public static void main(String[] args) {
		List<Vendor> vendors = new ArrayList<Vendor>();
		
		vendors.add(new Vendor(
				"Venues", 
				"150 Sunset", 
				"http://thesocietyep.com/images/OneFiftySunset.jpg",
				"150 Sunset is El Paso's premier Event Venue for weddings, quinceañeras, sweet 16s, corporate events. Breakfast & Lunch Kitchen, Landscaping & Nursery, and Outdoor Living Landscape Design & Construction Experts.",
				"gabbir@150sunset.com",
				"9155850801",
				"https://150sunset.com/"));
		
		vendors.add(new Vendor(
				"Bridal Boutiques",
				"Bridal Novias",
				"http://thesocietyep.com/images/BridalNovias.jpg",
				"Premier Bridal Boutique of the Southwest. Best collection of wedding dresses, bridesmaid gowns and mother of the bride gowns.",
				"epadamson@gmail.com",
				"9157751910",
				"http://bridalnoviasboutique.com/"));
		
		vendors.add(new Vendor(
				"Bakery",
				"Chantilly Cakes",
				"http://thesocietyep.com/images/Chantilly.jpg",
				"We create beautiful wedding or birthday cakes in El Paso.",
				"laura@weddingcakeselpaso.com",
				"9155024500",
				"http://www.weddingcakeselpaso.com/"));
		
		vendors.add(new Vendor(
				"Florists",
				"Debbie's Bloomers",
				"http://thesocietyep.com/images/DebbiesBloomers.jpg",
				"Brilliant bouquets, lush centerpieces and custom designed floral structures are all part of what makes a Debbie’s Bloomers event unique. We work with each of our clients to create unique designs based on their inspiration photos and ideas.",
				"debbies_bloomers@msn.com",
				"9158578600",
				"http://www.debbiesbloomers.com/"));
		
		vendors.add(new Vendor(
				"Venues",
				"Coronado Country Club",
				"http://thesocietyep.com/images/CoronadoCountryClub.jpg",
				"Coronado Country Club is a scenic course that offers panoramic views of Mexico, New Mexico, and Texas to the southeast. This course resembles the desert tracks of Arizona and features plush fairways and greens that are considered some of the fastest in the nation.",
				"catering@coronadocountryclub.com",
				"9155841171",
				"https://www.coronadocountryclub.com/"));
		
		vendors.add(new Vendor(
				"Planners",
				"Three Sisters",
				"http://thesocietyep.com/images/ThreeSisters.jpg",
				"Three Sisters El Paso is a wedding and event planning agency in El Paso, Texas. El Paso and Las Cruces' only boutique wedding and event designer, wedding and other events planner.",
				"info@threesistersep.com",
				"9152586258",
				"http://www.threesistersep.com/"));
		
		vendors.add(new Vendor(
				"Venues",
				"Ardovinos",
				"http://thesocietyep.com/images/Ardovinos.jpg",
				"We are a destination – an experience – where you can dine in our restaurant, relax on our patios, celebrate a momentous occasion or shop at our Farmers’ Market. All it takes is one visit; and, as you watch the evening passenger train wind its way around Mount Cristo Rey you'll understand why you'll want to keep coming back.",
				"marina@ardovinos.com",
				"5755890653",
				"https://www.ardovinos.com/"));
		
		Criteria type = new TypeCriteria();
		Criteria planner = new CriteriaPlanner();
		Criteria venueOrPlanner = new OrCriteria(type, planner);
		
		System.out.println("Venues: ");
		printVendors((type.meetCriteria(vendors)));
		
		System.out.println("------------------------");
		System.out.println("Venues and Planners: ");
		printVendors(venueOrPlanner.meetCriteria((vendors)));
	}
	
	public static void printVendors(List<Vendor> vendors) {
		for (Vendor vendor : vendors) {
			System.out.println("Type: " + vendor.getType());
			System.out.println("Name: " + vendor.getName());
			System.out.println("Image: " + vendor.getImage());
			System.out.println("Description: " + vendor.getDescription());
			System.out.println("Phone Number: " + vendor.getPhoneNumber());
			System.out.println("Email: " + vendor.getEmail());
			System.out.println("Url: " + vendor.getUrl());
			System.out.println();
		}
	}
}
