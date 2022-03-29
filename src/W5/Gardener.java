package W5;

import java.util.ArrayList;
import java.util.List;

public class Gardener {
    public void uprootWeeds(List<Plant> garden) {
        for (Plant p: garden) {
            if (p.isWeed()) {
                p.uprooted();
            }
        }
    }

    public void removeUndesirables(List<Plant> garden) {
        for (int i = 0; i<garden.size(); i++) {
            Plant p = garden.get(i);
            if (!p.isAlive() || p.uprooted)
                garden.remove(p);
        }
    }

    public static void main(String[] args) {
        Plant p = new Plant(1, "a");
        Weed w = new Weed(2, "b");
        List<Plant> garden = new ArrayList<>();
        garden.add(p);
        garden.add(w);

        Gardener x = new Gardener();
        x.uprootWeeds(garden);
        x.removeUndesirables(garden);

        p.kill();
        x.removeUndesirables(garden);

        System.out.println();
    }
}
