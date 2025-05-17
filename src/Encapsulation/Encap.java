package Encapsulation;

public class Encap {

	public static void main(String[] args) {

		City c1 = new City("Maharashtra", 500000);
		City c2 = new City("hyderabad", 9090);
		c1.displaycityinfo();
		c2.displaycityinfo();
		
		c1.setPopulation(20000);
		System.out.println( "updated poulation of  " + " "+c1.getCityname()+" : "+c1.getPopulation());
		
	}

}
class City{
	private String cityname;
	private int population;
	
	public City(String cityname, int population) {
		this.cityname=cityname;
		this.population=population;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	public void displaycityinfo() {
		System.out.println("city : "+cityname+", population :"+population);
	}
}
