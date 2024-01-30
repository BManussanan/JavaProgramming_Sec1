import java.time.Year;
public class FictionBook implements Author,Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	FictionBook(String title,int publicYear){
		this.title=title;
		this.publicYear=publicYear;
	}
	public void setAuthorName(String name) {
		author_name= name;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	public String getLastName() {
		return author_name.substring(author_name.indexOf(' ')+1,author_name.length()-1);
	}
	public String getFirstName() {
		return author_name.substring(0,author_name.indexOf(' '));
	}
	public int totalPublicYear() {
		return Year.now().getValue()-publicYear;
	}
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com")||this.email.endsWith("@windowslive.com")) {
			return true;}
		return false;
	}
	public boolean checkFormatName() {
	if(author_name.startsWith(getFirstName())&&author_name.endsWith(getLastName())) {
			return true;}
		return false;
	}
	public String toString() {
		return getTitle()+" write by "+getLastName().charAt(0)+"."+getFirstName().toUpperCase()+"("+email+")"
	+"\nPublished for "+totalPublicYear()+" years.";
	}
}
