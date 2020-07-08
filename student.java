package schoolprogram;


public class student {
	private String id;
	private String name;
	private String bangla;
	private String english;
	private String math;
	private String religion;
	
	public student(String id,String name,String bangla,String english,String math,String religion)
	{
	this.name = name;
	this.bangla = bangla;
	this.english = english;
	this.math = math;
	this.religion = religion;
	
	}
	public String getnamee() {return name; }
	public String getbangla() { return bangla; }
	public String getenglish() { return english; }
	public String getmath() { return math; }
	public String getreligion() { return religion; }
	
	
}
