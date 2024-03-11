package club;

import java.sql.SQLOutput;

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

        Club firstClub = new Club("exampleName","Muenchen",2024,"Viktor" );
        System.out.println(firstClub);
        Club secondClub = new Club("exampleName","Stuttgart",2024,"Chris" );
        System.out.println(secondClub);

        Match firstMatch = new Match(20000, firstStadium, firstClub, secondClub,firstSinger );
        System.out.println(firstMatch);



    }
}