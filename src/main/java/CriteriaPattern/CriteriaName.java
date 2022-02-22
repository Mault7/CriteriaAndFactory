package CriteriaPattern;

import java.util.ArrayList;

import Person.Person;

public class CriteriaName implements Criteria {

	private String data;

	public CriteriaName(String data) {

		this.data = data;
	}

	public ArrayList<Person> meetCriteria(ArrayList<Person> input) {

		ArrayList<Person> list = new ArrayList<Person>();

		for (Person object : input) {

			if (object.getName().compareTo(this.data) == 0) {

				list.add(object);
			}
		}
		return list;
	}
}