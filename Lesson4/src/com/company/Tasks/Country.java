package com.company.Tasks;

public class Country {
    String name;
    String continent;
    long numberOfPeople;
    short phoneCode;
    String capital;
    String[] cities;

    public Country(String name, String continent) {
        this(name, continent, 0L, (short)0);
    }

    public Country(String name, String continent, long numberOfPeople, short phoneCode) {
        this(name, continent, numberOfPeople, phoneCode, "", (String[])null);
    }

    public Country(String name, String continent, long numberOfPeople, short phoneCode, String capital, String[] cities) {
        this.name = "";
        this.continent = "";
        this.numberOfPeople = 0L;
        this.phoneCode = 0;
        this.capital = "";
        this.cities = null;
        this.name = name;
        this.continent = continent;
        this.numberOfPeople = numberOfPeople;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void printCountry() {
        System.out.println("--------------------------------------------");
        System.out.println("Name: " + this.name + " (" + this.continent + ") ");
        System.out.println("Number of people: " + this.numberOfPeople);
        System.out.println("Phone Code: +" + this.phoneCode);
        System.out.println("Capital: " + this.capital);
        System.out.print("Cities: ");
        if (this.cities != null) {
            int i = 0;
            String[] var2 = this.cities;
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String city = var2[var4];
                if (i == 4) {
                    System.out.print("\n");
                    i = 0;
                }

                ++i;
                System.out.print(city + "; ");
            }
        } else {
            System.out.print("No cities");
        }

        System.out.println("\n--------------------------------------------");
    }

    public String getName() {
        return this.name;
    }

    public String getContinent() {
        return this.continent;
    }

    public long getNumberOfPeople() {
        return this.numberOfPeople;
    }

    public short getPhoneCode() {
        return this.phoneCode;
    }

    public String getCapital() {
        return this.capital;
    }

    public String[] getCities() {
        return this.cities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setPhoneCode(short phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}

class Task3 {

    public static void main(String[] args) {
        Country country = new Country("Ukraine", "Europe", 36744634L, (short)380);
        country.printCountry();
        String capital = new String("Kyiv");
        String[] cities = new String[]{"Kyiv", "Kharkiv", "Lviv", "Odessa", "Dnipro", "Zaporizhia", "Kryvyi Rih", "Mykolaiv", "Mariupol", "Luhansk", "Vinnytsia", "Poltava", "Chernivtsi", "Cherkasy", "Zhytomyr", "Sumy", "Rivne", "Ternopil", "Ivano-Frankivsk", "Kirovohrad", "Kherson", "Chernihiv", "Zaporizhzhia", "Khmelnytskyi", "Lutsk", "Uzhhorod", "Kovel"};
        country.setCapital(capital);
        country.setCities(cities);
        country.printCountry();
    }
}