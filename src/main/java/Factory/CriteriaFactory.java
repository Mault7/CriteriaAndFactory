package Factory;

import CriteriaPattern.*;

public class CriteriaFactory {
	
	public Criteria getCriteria(String param) {
		if (param.equalsIgnoreCase("gender=F")) {
			return new CriteriaGender("F");
		} else if(param.equalsIgnoreCase("gender=M")) {
			return new CriteriaGender("M");
		} else if(param.split("=")[0].equalsIgnoreCase("name")) {  // param = name=* and this get the name -> param.split("=")[0]
			String [] parts = param.split("=");
			return new CriteriaName(parts[1]);			
		} else {
			String[] parts = param.split("=");
			if(parts[0].equalsIgnoreCase("ageGt")) {
				return new AgeCriteria(Integer.parseInt(parts[1]),true);
			} else if(parts[0].equalsIgnoreCase("ageLt")) {
				return new AgeCriteria(Integer.parseInt(parts[1]),false);
			}
		}
		return null;
	}

}
