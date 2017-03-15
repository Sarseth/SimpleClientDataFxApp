package pl.marapp.model.person;

public enum Gender {

    MALE("gender.male"),
    FEMALE("gender.female");

    private String code;

    private Gender(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}