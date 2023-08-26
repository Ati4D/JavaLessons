package com.company.Tasks;

import com.company.Models.Country;

public class Task3 {

    public static void main(String[] args) {
        Country country = new Country("Ukraine", "Europe", 36744634L, (short) 380);
        country.printCountry();
        String capital = new String("Kyiv");
        String[] cities = new String[]{"Kyiv", "Kharkiv", "Lviv", "Odessa", "Dnipro", "Zaporizhia", "Kryvyi Rih", "Mykolaiv", "Mariupol", "Luhansk", "Vinnytsia", "Poltava", "Chernivtsi", "Cherkasy", "Zhytomyr", "Sumy", "Rivne", "Ternopil", "Ivano-Frankivsk", "Kirovohrad", "Kherson", "Chernihiv", "Zaporizhzhia", "Khmelnytskyi", "Lutsk", "Uzhhorod", "Kovel"};
        country.setCapital(capital);
        country.setCities(cities);
        country.printCountry();
    }
}
