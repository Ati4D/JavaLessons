package project.Enums;

import project.Models.Street;

public enum HomeType {
    SINGLE_FAMILY_HOUSE("Single family house"),
    APARTMENT("Apartment"),
    TOWNHOUSE("Townhouse");

    private String type;

    HomeType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
