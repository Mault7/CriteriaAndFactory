package CriteriaPattern;
import java.util.ArrayList;
import Person.Person;

public class AgeCriteria implements Criteria {

	private int age;
	private boolean comparator;

	public AgeCriteria(int age, boolean comparator) {

		this.age = age;
		this.comparator = comparator;
	}

	public ArrayList<Person> meetCriteria(ArrayList<Person> person) {

		ArrayList<Person> list = new ArrayList<Person>();

		for (Person p : person) {

			if (this.comparator) {

				if (p.getAge() > this.age) {

					list.add(p);
				}
			}

			else {

				if (p.getAge() < this.age) {

					list.add(p);
				}
			}

		}
		return list;
	}
}