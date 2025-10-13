package Model;

public class Alien {
    private int aId;
    private String Name;
    private String tech;

    public int getaId() {
        return aId;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aId='" + aId + '\'' +
                ", Name='" + Name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }


}
