package oneMethod;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public class Call implements Cloneable, Comparable<Call> {
    private static int nextID = 1;
    private int ID = nextID++;
    private int cylinder;

    public Call(int cylinder) {
        this.cylinder = cylinder;
    }

    public Call clone() throws CloneNotSupportedException {
        return (Call) super.clone();
    }

    int getCylinder() {
        return cylinder;
    }

    int getID() {
        return ID;
    }

    public String toString() {
        return Integer.toString(cylinder);
    }

    @Override
    public int compareTo(Call o) {
        return ID - o.ID;
    }

    void increaseCylinder(int increase) {
        cylinder += increase;
    }
}
