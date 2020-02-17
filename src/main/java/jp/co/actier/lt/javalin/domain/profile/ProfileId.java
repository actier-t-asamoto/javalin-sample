package jp.co.actier.lt.javalin.domain.profile;

import java.util.Objects;

public class ProfileId {
    private Long value;

    public ProfileId() {
    }

    public boolean numbered() {
        return this.value != null;
    }

    public ProfileId(Long value) {
        this.value = value;
    }

    public ProfileId(String value) {
        this.value = Long.valueOf(value);
    }

    public Long getValue() {
        return value;
    }

    public ProfileId nextId() {
        return new ProfileId(this.value == null ? 1 : this.value + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileId profileId = (ProfileId) o;
        return Objects.equals(value, profileId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ProfileId{" +
                "value=" + value +
                '}';
    }
}
