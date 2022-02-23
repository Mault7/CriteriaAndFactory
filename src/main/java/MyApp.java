import java.util.ArrayList;
import java.util.List;
import Person.*;
import CriteriaPattern.*;
import Factory.*;
public class MyApp {
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		ArrayList<Person> auxlist = new ArrayList<Person>();
		ArrayList<Person> malelist = new ArrayList<Person>();
		ArrayList<Person> femalelist = new ArrayList<Person>();
		CriteriaFactory factory = new CriteriaFactory();

		persons.add(new Person(28, "Male","Michael"));
		persons.add(new Person(21, "Male","Joe"));
		persons.add(new Person(34, "Male","Joe2"));
		persons.add(new Person(31, "Male","Joe3"));
		persons.add(new Person(29, "Male","Joe4"));
		persons.add(new Person(30, "Female","Megan"));

		//********************** EXERCISE 1*****************************
		//GET MALE PERSON WITH AGE > 30 OR FEMALE WITH AGE > 25
		
		//get person where age > 30 and are Male
		Criteria age = factory.getCriteria("ageGt","30");
		Criteria gender = factory.getCriteria("gender","M");
		auxlist = age.meetCriteria(persons);
		auxlist = gender.meetCriteria(auxlist);
		print(auxlist);
		
		//get person where age > 25 and are Female
		age = factory.getCriteria("ageGt","29");
		gender = factory.getCriteria("gender","F");
		femalelist = age.meetCriteria(persons);
		femalelist = gender.meetCriteria(femalelist);
		print(femalelist);
		//join the two list
		List<Person> newList = new ArrayList<Person>(auxlist);
		newList.addAll(femalelist);
		System.out.print("\n MALE PERSON WITH AGE > 30 OR FEMALE WITH AGE > 25");
		printList(newList);
		
		
		//********************** EXERCISE 2*****************************
		//GET MALE PERSON WITH AGE > 18 AND AGE < 55
		
		age = factory.getCriteria("ageGt","18");
		auxlist = new ArrayList<Person>();
		auxlist = age.meetCriteria(persons);
		age = factory.getCriteria("ageLt","55");
		auxlist = age.meetCriteria(auxlist);
		gender = factory.getCriteria("gender","M");
		malelist = gender.meetCriteria(auxlist);
		System.out.print("\n MALE PERSON WITH AGE > 18 AND AGE < 55");
		print(malelist);
		
		
		//********************** EXERCISE 3*****************************
		//GET FEMALE PERSON WITH AGE > 18 AND AGE < 55
		gender = factory.getCriteria("gender","F");
		femalelist = gender.meetCriteria(auxlist);
		System.out.print("\n FEMALE PERSON WITH AGE > 18 AND AGE < 55");
		print(femalelist);
		
		
		//********************** EXERCISE 4*****************************
		//GET FEMALE PERSON WITH AGE > 18 AND AGE < 55 AND name=a
		Criteria name = factory.getCriteria("name","Megan");
		femalelist = name.meetCriteria(femalelist);
		System.out.print("\n FEMALE PERSON WITH AGE > 18 AND AGE < 55 AND NAME=Megan");
		print(femalelist);
		
	}
	
	public static void print(ArrayList<Person> auxlist) {
		
		for (int i = 0; i < auxlist.size(); i++) {
			System.out.print("\n" + auxlist.get(i).getAge() + " " + auxlist.get(i).getGender());
		}
		System.out.println("\n End");
	}
	public static void printList(List<Person> auxlist) {
		
		for (int i = 0; i < auxlist.size(); i++) {
			System.out.print("\n" + auxlist.get(i).getAge() + " " + auxlist.get(i).getGender());
		}
		System.out.println("\n End");
	}
}
