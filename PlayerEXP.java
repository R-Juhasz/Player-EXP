public class NPC {
    private int experience;

    public NPC(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void onDeath(Player player) {
        player.giveExperience(experience);
    }
}

public class Player {
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void giveExperience(int amount) {
        experience += amount;
        // Here you can also add code to update the player's level if necessary.
    }
}

    

