package model;

public class Team<City>
{
private String	name;
private  String coach;
private String captain;

private City city;




public String getCaptain() {
	return captain;
}

public void setCaptain(String captain) {
	this.captain = captain;
}

public Team(String name, String coach, String captain, City city) {
	super();
	this.name = name;
	this.coach = coach;
	this.captain = captain;
	this.city = city;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCoach() {
	return coach;
}

public void setCoach(String coach) {
	this.coach = coach;
}

public City getCity() {
	return city;
}

public void setCity(City city) {
	this.city = city;
}


}

