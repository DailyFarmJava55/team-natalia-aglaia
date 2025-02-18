package java55.farm.auth.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
