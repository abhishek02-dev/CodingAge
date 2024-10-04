package Java_Practise_Set;

public class MusicAlbum {
String title;
String artist;
int totalSongs;
double price;

    public MusicAlbum(String title, String artist, int totalSongs, double price) {
        this.title = title;
        this.artist = artist;
        this.totalSongs = totalSongs;
        this.price = price;
    }
    void playSong(int songNumber) {
        System.out.print("Current song playing :");
        switch (songNumber) {
            case 1:
                System.out.println("Born to shine ");
                break;
            case 2:
                System.out.println("G.O.A.T");
                break;
            case 3:
                System.out.println("Raat di gedi");
                break;
            case 4:
                System.out.println("Time");
                break;
            case 5:
                System.out.println("Do You Know");
                break;
            case 6:
                System.out.println("Clas");
                break;
            case 7:
                System.out.println("5 Taara");
                break;
            case 8:
                System.out.println("Muchh");
                break;
            case 9:
                System.out.println("Laembadgini");
                break;
            default:
                System.out.println("No songs available");
        }
    }
void changePrice(double newPrice){
this.price=newPrice;
    System.out.println("The new price of album is "+price);
}
void printAlbumDetails(){
    System.out.println("Title :"+title);
    System.out.println("Artist :"+artist);
    System.out.println("Total Songs :"+totalSongs);
    System.out.println("Price :"+price);
}
    public static void main(String[] args) {
        MusicAlbum mb=new MusicAlbum("Aura","Diljit",9,120);
        mb.printAlbumDetails();
        mb.playSong(3);
        mb.changePrice(115);
        mb.printAlbumDetails();
    }
}
