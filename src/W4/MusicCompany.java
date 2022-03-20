package W4;

import java.util.List;

public class MusicCompany {

    private String name;
    private String location;
    private List<MusicStore> stores;

    public MusicCompany(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public List<MusicStore> getStores() {
        return this.stores;
    }

}
