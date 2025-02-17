package java55.farm.auth.model;

public enum Language {
    ENGLISH("en"),
    HEBREW("heb"),
    ARABIC("ar");

    private final String code;

    Language(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
