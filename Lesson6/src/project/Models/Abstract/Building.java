package project.Models.Abstract;

import project.Interfaces.Parseable;
import project.Interfaces.Printable;
import project.Models.Street;

public abstract class Building implements Parseable, Printable {
    protected int address;
    protected Street street;

    protected Building() {
        this(0);
    }

    protected Building(int address) {
        this(address, null);
    }

    protected Building(int address, Street street) {
        this.address = address;
        this.street = street;
    }

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}
