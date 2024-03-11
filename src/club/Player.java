package club;

public class Player extends Club {
    private String playerName;
    private int age;
    private String position;

    public static boolean activePlayer = true;


    public Player(String playerName, int age, String position ){
        this.playerName= playerName;
        this.age = age;
        this.position= position;
    }
    @Override
    public String toString() {
        return
                "playerName='" + playerName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'';
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
