package t02h01;

/**
 * @author rodo
 * This program show details about the song:
 * A Kind of Magic
 */
public class T02h01 {
    
    public static void main(String[] args) {
        //Variable declaration
        String name = "A kind of magic";
        String group = "Queen";
        int min = 4;
        int sec = 24;
        String album = "A kind of magic";
        int released = 1986;
        double albumPrice = 20.18;
        
        //Output
        System.out.println("Song name: "+name);
        System.out.println("Length: "+min+"min "+sec+"secs");
        System.out.println("Group: "+group);
        System.out.println("Released: "+released);
        System.out.println("Album price: "+albumPrice+"€");
    }    
}
