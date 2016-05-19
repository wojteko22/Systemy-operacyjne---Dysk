package archiwum;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public class Call implements Cloneable {
    private static int nextID = 1;
    private int ID = nextID++;
    private final int cylinder;
    private final int startTime;
    private final int duration;


    public Call(int startTime, int duration, int cylinder) {
        this.startTime = startTime;
        this.duration = duration;
        this.cylinder = cylinder;
    }

/*
    public String toString() {
        return "Zgłoszenie " + ID;
    }
*/

    public Call clone() throws CloneNotSupportedException {
        return (Call) super.clone();
    }

    public int getID() {
        return ID;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getDuration() {return duration;}

    public int getCylinder() {
        return cylinder;
    }
}
