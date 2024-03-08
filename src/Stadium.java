public class Stadium {
        private String name;
        private int size;
        private String club;
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

        public String getClub(){
            return club;
        }

        public void setClub(String club) {
            this.club = club;
        }

        public Stadium () {
            this.name = "Allianz Arena";
            this.size = 75000;
            this.club = "FC Bayern";
        }
        public Stadium (String name, int size, String club) {
            this.name = name;
            this.size = size;
            this.club = club;
        }


}
