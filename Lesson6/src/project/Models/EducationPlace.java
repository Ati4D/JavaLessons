package project.Models;

import project.Enums.AccreditationLevel;
import project.Enums.HomeType;
import project.Interfaces.AutoSetable;
import project.Models.Abstract.Building;

import java.util.Objects;
import java.util.Random;

import static java.lang.System.out;

public class EducationPlace extends Building implements AutoSetable {
    private int numOfPupils;
    private AccreditationLevel accreditation;

    public EducationPlace() {
        this(0, AccreditationLevel.SCHOOL);
    }

    public EducationPlace(int numOfPupils, AccreditationLevel accreditation) {
        this(0, numOfPupils, accreditation);
    }

    public EducationPlace(int address, int numOfPupils, AccreditationLevel accreditation) {
        this(address, null, numOfPupils, accreditation);
    }

    public EducationPlace(int address, Street street, int numOfPupils, AccreditationLevel accreditation) {
        super(address, street);
        this.numOfPupils = numOfPupils;
        this.accreditation = accreditation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationPlace that = (EducationPlace) o;
        return numOfPupils == that.numOfPupils && accreditation == that.accreditation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfPupils, accreditation);
    }

    @Override
    public String toString() {
        return "EducationPlace{" +
                "numOfPupils=" + numOfPupils +
                ", accreditation=" + accreditation +
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
        setNumOfPupils(Integer.parseInt(args[2]));
        accreditation.setType(args[3]);
    }

    @Override
    public String parseTo() {
        StringBuilder str = new StringBuilder();
        String spliter = ":";
        str.append(address + spliter).append(street.getName() + spliter);
        str.append(numOfPupils + spliter).append(accreditation.getType());
        return str.toString();
    }

    @Override
    public void print() {
        out.println("|" + accreditation.getType() + "(" + street.getName() + " " + address + ") study " + numOfPupils + " pupils |");
    }

    @Override
    public void autoSet() {
        autoSet(new Street("Random Street"));
    }

    @Override
    public void autoSet(Street street) {
        setAddress(new Random().nextInt(1000));
        setStreet(street);
        setNumOfPupils(new Random().nextInt(100) + 1);
        setAccreditation(AccreditationLevel.values()[new Random().nextInt(AccreditationLevel.values().length)]);
    }

    public int getNumOfPupils() {
        return numOfPupils;
    }

    public void setNumOfPupils(int numOfPupils) {
        if (numOfPupils < 0) {
            out.println("Error number; default number was set");
            this.numOfPupils = 0;
            return;
        }
        this.numOfPupils = numOfPupils;
    }

    public AccreditationLevel getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(AccreditationLevel accreditation) {
        this.accreditation = accreditation;
    }

}
