package project.Enums;

public enum ShopType {
    GROCERY("Grocery"),
    CLOTHING_STORE("Clothing store"),
    ELECTRONICS_STORE("Electronics store"),
    PHARMACY("Pharmacy"),
    ONLINE_RETAIL_STORE("Online retail store");

    private String type;
    ShopType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
