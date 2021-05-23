public class Album {
    public String name;
    public String artist;
    public int songs;
    public double timePlayed;
    public Album(String name, String artist, int songs, double timePlayed){
        this.name = name;
        this.artist = artist;
        this.songs = songs;
        this.timePlayed =  timePlayed;
    }
    public String name(){
        return name;
    }
    public String  artist(){
        return artist;
    }
    public int songs() {
        return songs;
    }
    public double timePlayed(){
        return timePlayed;
    }
    public String toString(){
        String info = "Album Name:"+ name + "\n" + "Artist:"+ artist +"\n"+ "Number of Songs:"+ songs +"\n"+ "Total play time:"+ timePlayed +"\n";
        return info;
    }
}
