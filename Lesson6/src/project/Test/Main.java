package project.Test;

import project.Interfaces.AutoSetable;
import project.Interfaces.Parseable;
import project.Interfaces.Printable;
import project.Models.Abstract.Building;
import project.Models.EducationPlace;
import project.Models.HomePlace;
import project.Models.Shop;
import project.Models.Street;

import static java.lang.System.out;

/**
 * Задание на наследование и полиморфизм.
 * <p>
 * С помощью классов и связей между ними описать улицу города.
 *
 * <p>
 * На улице должны присутствовать дома разного типа.
 * <p>
 * Например, жилые дома, магазины, больницы, школы.
 * <p>
 * Предусмотреть тестовую инициализацию каждого объекта и улицы в целом.
 * <p>
 * Каждый дом должен иметь определенный адрес в рамках улицы.
 * <p>
 * Кроме того каждый тип дома должен иметь свою совокупность полей.
 * Например,
 * должен быть тип магазина,
 * количество жильцов в жилом доме,
 * количество учащихся и уровень аккредитации в школе (общеобразовательная, гимназия, лицей и т.д.).
 * <p>
 * Предусмотреть возможность установки адреса для каждого объекта как через конструктор, так и через сетер.
 * <p>
 * Также предусмотреть виртуальный метод, который будет принимать строку и на ее основе устанавливать поля объекта.
 * <p>
 * Сделать вывод информации о каждом доме в консоль.
 * <p>
 * Сделать вывод информации по улице в консоль.
 * <p>
 * В работе использовать интерфейсы, абстрактные классы (при необходимости) и перечисления.
 */

public class Main {
    public static void main(String[] args) {

        Street someStreet = new Street("Bandery");
        Building[] buildings = new Building[]{
                new HomePlace(),
                new HomePlace(),
                new HomePlace(),
                new Shop(),
                new HomePlace(),
                new EducationPlace(),
                new Shop(),
                new HomePlace(),
                new HomePlace()
        };

        for (var building : buildings) {
            ((AutoSetable) building).autoSet(someStreet);
        }

        out.println("\nTest 1");
        out.println("-----Street " + someStreet.getName() + "-----");
        for (var building : buildings) {
            ((Printable) building).print();
        }
        out.println("----- End Of Street -----");

        out.println("\n\nTest 2");
        String[] savedAddresses = new String[buildings.length];
        out.println("-----Street " + someStreet.getName() + "-----");
        for (int i = 0; i < buildings.length; i++) {
            out.println(((Parseable) buildings[i]).parseTo());
            savedAddresses[i] = ((Parseable) buildings[i]).parseTo();
        }
        out.println("----- End Of Street -----");
        out.println("Street data saved");

        out.println("\n\nTest 3");
        out.println("-----Street " + someStreet.getName() + "-----");
        for (int i = 0; i < buildings.length; i++) {
            ((AutoSetable) buildings[i]).autoSet();
            ((Printable) buildings[i]).print();
        }
        out.println("----- End Of Street -----");
        out.println("Street data changed");

        out.println("\n\nTest 4");
        out.println("-----Street " + someStreet.getName() + "-----");
        for (int i = 0; i < buildings.length; i++) {
            ((Parseable) buildings[i]).parseFrom(savedAddresses[i]);
            ((Printable) buildings[i]).print();
        }
        out.println("----- End Of Street -----");
        out.println("Street data returned");

    }
}