package jp.co.actier.lt.javalin.domain.profile;

import java.util.ArrayList;
import java.util.List;

public class Profiles {
    private List<Profile> list = new ArrayList<>();

    public Profiles() {
    }

    public Profiles(List<Profile> list) {
        this.list = list;
    }

    public List<Profile> getList() {
        return list;
    }

    public Profile find(ProfileId id) {
        return list.stream()
                .filter(profile -> profile.getProfileId().equals(id))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
