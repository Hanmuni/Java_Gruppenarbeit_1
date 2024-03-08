import com.sun.security.jgss.GSSUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Player firstPlayer = new Player("Chris", 25, "Goalkeeper");
        System.out.println(firstPlayer);

        Stadium firstStadium = new Stadium();
        System.out.println(firstStadium.getName());

        Singer firstSinger = new Singer("Shakira", "Heavy Metal", 77);
        System.out.println(firstSinger.getSingerName());

    }
}