package project.Models;

import project.Enums.HomeType;
import project.Interfaces.AutoSetable;
import project.Models.Abstract.Building;

import java.util.Objects;
import java.util.Random;

import static java.lang.System.out;

public class HomePlace extends Building implements AutoSetable {
    private HomeType type;
    private int numOfPeople;

    public HomePlace() {
        this(HomeType.SINGLE_FAMILY_HOUSE, 0);
    }

    public HomePlace(HomeType type, int numOfPeople) {
        super();
        this.type = type;
        this.numOfPeople = numOfPeople;
    }

    public HomePlace(int address, HomeType type, int numOfPeople) {
        super(address);
        this.type = type;
        this.numOfPeople = numOfPeople;
    }

    public HomePlace(int address, Street street, HomeType type, int numOfPeople) {
        super(address, street);
        this.type = type;
        this.numOfPeople = numOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomePlace homePlace = (HomePlace) o;
        return numOfPeople == homePlace.numOfPeople && type == homePlace.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numOfPeople);
    }

    @Override
    public String toString() {
        return "HomePlace{" +
                "type=" + type +
                ", numOfPeople=" + numOfPeople +
                ", address=" + address +
                ", street=" + street +
                '}';
    }

    @Override
    public void parseFrom(String str) {
        String spliter = ":";
        String[] args = str.split(spliter);
        setAddress(Integer.parseInt(args[0]));
        setStreet(new Street(args[1]));
        type.setType(args[2]);
        setNumOfPeople(Integer.parseInt(args[3]));
    }

    @Override
    public String parseTo() {
        StringBuilder str = new StringBuilder();
        String spliter = ":";
        str.append(address + spliter).append(street.getName() + spliter);
        str.append(type.getType() + spliter).append(numOfPeople);
        return str.toString();
    }

    @Override
    public void print() {
        out.println("|" + type.getType() + "(" + street.getName() + " " + address + ") lives " + numOfPeople + " peoples| ");
    }

    @Override
    public void autoSet() {
        autoSet(new Street("Random Street"));
    }

    @Override
    public void autoSet(Street street) {
        setAddress(new Random().nextInt(1000));
        setStreet(street);
        setType(HomeType.values()[new Random().nextInt(HomeType.values().length)]);
        setNumOfPeople(new Random().nextInt(10) + 1);
    }

    public HomeType getType() {
        return type;
    }

    public void setType(HomeType type) {
        this.type = type;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        if (numOfPeople < 0) {
            out.println("Error number; default number was set");
            this.numOfPeople = 0;
            return;
        }
        this.numOfPeople = numOfPeople;
    }

}
