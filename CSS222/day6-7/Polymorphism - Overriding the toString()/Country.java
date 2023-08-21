public class Country
{
    private String name;
    private String capital;
    private long population;

    public Country(String name) {this.name = name;}
    public String getName() {return name;}
    public String getCapital() {return capital;}
    public void setCapital(String capital) {this.capital = capital;}
    public long getPopulation() {return population;}
    public void SetPopulation(long population) {this.population = population;}

    @Override
    public String toString()
    {return "Country [name = " + name + ", capital = " + capital + ", population = " + population + "]";}

    public static void main(String[] args)
    {
        Country India = new Country("India");
        India.setCapital("New delhi");
        India.SetPopulation(1200000000);
        System.out.println(India);    
    }
}