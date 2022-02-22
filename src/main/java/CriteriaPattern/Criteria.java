package CriteriaPattern;
import java.util.ArrayList;

import Person.Person;

public interface Criteria {
	
	public ArrayList<Person> meetCriteria(ArrayList<Person> person);
}
