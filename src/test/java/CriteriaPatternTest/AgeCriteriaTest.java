package CriteriaPatternTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import CriteriaPattern.Criteria;
import Factory.CriteriaFactory;
import Person.Person;

public class AgeCriteriaTest {
	
	ArrayList<Person> persons = new ArrayList<Person>();
	ArrayList<Person> auxlist = new ArrayList<Person>();
	int[] expected = new int[]{34,31};
	CriteriaFactory factory = new CriteriaFactory();
	Criteria age = factory.getCriteria("ageGt","30");
	
	
	@Before
	public void before() {
		persons.add(new Person(28, "Male","Michael"));
		persons.add(new Person(21, "Male","Joe"));
		persons.add(new Person(34, "Male","Joe2"));
		persons.add(new Person(31, "Male","Joe3"));
		persons.add(new Person(29, "Male","Joe4"));
		persons.add(new Person(30, "Female","Katy"));
	}
	

	@Test
	public void test() {
		
		auxlist = age.meetCriteria(persons);
		int[] ages = new int[2];
		for(int i = 0; i < auxlist.size(); i++) {
			ages[i] = auxlist.get(i).getAge();
		}
		

		assertArrayEquals(expected, ages);
	}

}
