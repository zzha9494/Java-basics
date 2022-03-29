package W5;

public class Plant {
    private double height;
    private String species;
    private boolean alive;
    boolean uprooted;

    public Plant(double height, String species) {
        this.height = height;
        this.species = species;
        this. alive = true;
    }

    public boolean isWeed() {
        return false;
    }

    public boolean uprooted() {
        this.uprooted = true;
        return true;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void kill() {
        this.alive = false;
    }

    public double getHeight() {
        return this.height;
    }

    public String getSpecies() {
        return this.species;
    }

    public boolean equals(Plant p) {
        return this.alive == p.alive && this.species.equals(p.species) && this.height == p.height && this.uprooted == p.uprooted;
    }

}
