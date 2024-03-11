package club;

public class Singer {
    private String name;
    private String genre;
    private int age;

    public Singer(String name, String genre, int age){
        this.name = name;
        this.genre = genre;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", age=" + age +
                '}';
    }
    public String getSingerName() {
        return name;
    }
    public String getSingerGenre() {
        return genre;
    }
    public int getSingerAge() {
        return age;
    }

}
