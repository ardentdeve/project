package project;

import java.util.*;

public class UniversityHome {
	private List<University> universities;
	
	public UniversityHome(){
		universities = new List<University>();
	}
	
	public void addUniversityToList(University u){
		universities.add(u);
	}
	
	public void removeFromList(University u){
		universities.remove(u);
	}
	
	public List<University> getUniversities(){
		return List<University> universities;
	}
	
}
