package club;

public class Club {

    private String clubName;
    private String city;
    private int foundingYear;
    private String president;

    public Club() {}

    public Club(String clubName) {
        this.clubName = clubName;
    }

    public Club(String clubName, String city, int foundingYear, String president) {
        this.clubName = clubName;
        this.city = city;
        this.foundingYear = foundingYear;
        this.president = president;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }


    public String getName() {
        return clubName;
    }

    public void setName(String name) {
        this.clubName = name;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    @Override
    public String toString() {
        return
                "ClubName = '" + clubName + '\'' +
                        ", City = " + city +
                        ", Founding Year = '" + foundingYear + '\'' +
                        ", President = '" + president + '\'';
    }

}
