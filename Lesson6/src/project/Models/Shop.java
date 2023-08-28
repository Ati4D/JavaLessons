package project.Models;

import project.Enums.HomeType;
import project.Enums.ShopType;
import project.Interfaces.AutoSetable;
import project.Models.Abstract.Building;

import java.util.Objects;
import java.util.Random;

import static java.lang.System.out;

public class Shop extends Building implements AutoSetable {
    private ShopType type;

    public Shop() {
        this(ShopType.GROCERY);
    }

    public Shop(ShopType type) {
        this(0, type);
    }

    public Shop(int address, ShopType type) {
        this(address, null, type);
    }

    public Shop(int address, Street street, ShopType type) {
        super(address, street);
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return type == shop.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "type=" + type +
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
    }

    @Override
    public String parseTo() {
        StringBuilder str = new StringBuilder();
        String spliter = ":";
        str.append(address + spliter).append(street.getName() + spliter);
        str.append(type.getType());
        return str.toString();
    }

    @Override
    public void print() {
        out.println("|" + type.getType() + "(" + street.getName() + " " + address + ") |");
    }

    @Override
    public void autoSet() {
        autoSet(new Street("Random Street"));
    }

    @Override
    public void autoSet(Street street) {
        setAddress(new Random().nextInt(1000));
        setStreet(street);
        setType(ShopType.values()[new Random().nextInt(ShopType.values().length)]);
    }

    public ShopType getType() {
        return type;
    }

    public void setType(ShopType type) {
        this.type = type;
    }

}
