package project.Enums;

public enum AccreditationLevel {
    SCHOOL("School"),
    GYMNASIUM("Gymnasium"),
    LYCEUM("Lyceum"),
    TECHNICAL_SCHOOL("Technical school"),
    COLLEGE("College"),
    UNIVERSITY("University");

    private String type;

    AccreditationLevel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
