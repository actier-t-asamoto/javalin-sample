package jp.co.actier.lt.javalin.domain.profile;

import java.util.Objects;

public class Age {
    private Long value;

    public Age() {
    }

    public Age(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Age age = (Age) o;
        return Objects.equals(value, age.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Age{" +
                "value=" + value +
                '}';
    }
}
