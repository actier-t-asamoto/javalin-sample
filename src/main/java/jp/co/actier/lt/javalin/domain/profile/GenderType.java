package jp.co.actier.lt.javalin.domain.profile;

import java.util.Objects;

public class GenderType {
    private Gender value;

    public GenderType() {
    }

    public GenderType(Gender value) {
        this.value = value;
    }

    public Gender getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenderType that = (GenderType) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "GenderType{" +
                "value=" + value +
                '}';
    }
}
