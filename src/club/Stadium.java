package club;

public class Stadium extends Club {
    private String name;
    private int size;
    private int builtYear;
    public static String groundSurface = "grass";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    @Override
    public String toString() {
        return
                "StadiumName = '" + name + '\'' +
                        ", Size = " + size +
                        ", Built Year = '" + builtYear + '\'';
    }

    public Stadium() {
        this.name = "Allianz Arena";
        this.size = 75024;
        this.builtYear = 2005;
    }

    public Stadium(String clubName, String name, int size, int builtYear) {
        super(clubName);
        this.name = name;
        this.size = size;
        this.builtYear = builtYear;
    }


}
