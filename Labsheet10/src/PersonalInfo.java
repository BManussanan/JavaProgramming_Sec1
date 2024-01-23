
public class PersonalInfo {
		private Person name;
		private Date bDay;
		private int personID;
		
	//Default Constructor
	public PersonalInfo() {
		name = new Person();//firstname="",lastname=""
		bDay = new Date();//dMonth=1,dDay=1,dYear=1900
		personID=0;
	}
	public PersonalInfo(String first,String last,int month,int day,int year,int ID) {
		//initialize the object name
		name = new Person(first,last);
		bDay =  new Date(month,day,year);
		personID=ID;
	}
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first,last);
		bDay.setDate(month,day,year);
		personID=ID;
	}
	public String toString() {
		return "Name: "+name.toString()+"\nDate of birth: "+bDay.toString()
		+"\nPersonal ID: "+personID;
	}
}
