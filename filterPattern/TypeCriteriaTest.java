package filterPattern;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TypeCriteriaTest {
	
	/**
	 * Tests for original size of vendors list to make sure all of
	 * the vendors were successfully added. Size should be 7.
	 */
	@Test
	public void OriginalListSize() {
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
		
		assertEquals(7, vendors.size());
	}
	
	/**
	 * List should only contain vendors that fit the criteria -> vendorType: Venues
	 */
	@Test
	public void TypeCriteriaListSize() {
		
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
		assertEquals(3, type.meetCriteria(vendors).size());
	}
	
	/**
	 * List should contain vendors with type, Venues, and type, Planner, for a size of 4.
	 */
	@Test
	public void AndCriteriaTest() {
		
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
		assertEquals(4, venueOrPlanner.meetCriteria(vendors).size());
	}

}
