package club;

public class Match {

    private int viewers;
    private Stadium stadium;
    private Club homeClub;

    private Club awayClub;

    private Singer singer;

    public Match(int viewers, Stadium stadium, Club homeClub, Club awayClub, Singer singer) {
        this.viewers = viewers;
        this.stadium = stadium;
        this.homeClub = homeClub;
        this.awayClub = awayClub;
        this.singer = singer;
    }
    @Override
    public String toString() {
        return "Match{" +
                "viewers=" + viewers +
                ", stadium=" + stadium +
                ", club=" + homeClub +" VS "+ awayClub +
                ", singer=" + singer +
                '}';
    }
    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public Club getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(Club club) {
        this.homeClub = club;
    }

    public Club getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(Club awayClub) {
        this.awayClub = awayClub;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

}
