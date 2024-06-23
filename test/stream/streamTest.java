package stream;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cassiano.filter.Filter;
import com.cassiano.model.Person;

public class streamTest {
	Person person = new Person();
	@Test
	public void womanFilter() {

		List<Person> persons = person.doPersonsList();
		List<Person> woman = new Filter().women(persons);
		
		woman.forEach(element -> {
			Assert.assertEquals(element.getGender(), "F");
		});
	}
	
	@Test
	public void manFilter() {
		List<Person> persons = person.doPersonsList();
		List<Person> man = new Filter().men(persons);
		man.forEach(element -> {
			Assert.assertEquals(element.getGender(), "M");
		});
	}
}
