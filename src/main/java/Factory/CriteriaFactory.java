package Factory;

import CriteriaPattern.*;

public class CriteriaFactory {

	public Criteria getCriteria(String intruccion, String parameter) {

		switch (intruccion) {

		case "gender":

			return new CriteriaGender(parameter);

		case "name":

			return new CriteriaName(parameter);

		case "ageGt":

			return new AgeCriteria(Integer.parseInt(parameter), true);

		case "ageLt":

			return new AgeCriteria(Integer.parseInt(parameter), false);

		default:

			return null;
		}

	}

}
