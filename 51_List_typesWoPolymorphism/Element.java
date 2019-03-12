public class Element {

    public int type;
    public int intValue;
    public double doubleValue;
    public String stringValue;

    public String toString() {
        String s = "";
        if (type == 0) {
            s += intValue;
        }
        if (type == 1) {
            s += doubleValue;
        }
        if (type == 2) {
            s = stringValue;
        }
        return s;
    }

}