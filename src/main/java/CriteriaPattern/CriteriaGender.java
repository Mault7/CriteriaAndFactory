package CriteriaPattern;
import Person.*;
import java.util.ArrayList;
import Person.Person;

public class CriteriaGender implements Criteria {
	
	private String genred;
	
	public CriteriaGender(String genred) {
		this.genred = genred;
	}
	
	
	
	public ArrayList<Person> meetCriteria(ArrayList<Person> input) {

		ArrayList<Person> list = new ArrayList<Person>();

		for (Person object : input) {

			if(this.genred == "F") {
				
				if (object.getGender().equalsIgnoreCase("Female")) {

					list.add(object);
				}
			}
			else {
				
				if (object.getGender().equalsIgnoreCase("Male")) {

					list.add(object);
				}
			}
		}
		return list;
	}
}
