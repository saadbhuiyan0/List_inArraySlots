/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int[] arrayOfInts;
    private int elements;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        arrayOfInts = new int[10];
        elements = 0;
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return elements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String s = "[";
        for ( int count = 0 ; count < elements ; count++) {
			s = s
				+ arrayOfInts[count]
				+ ",";
	    }
        return s + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add(int value) {
        if (elements >= arrayOfInts.length) {
            expand();
        }
        arrayOfInts[elements] = value;
        elements++;
        return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
    private void expand() {
        int[] temp = new int[2 * arrayOfInts.length];
        for (int i = 0; i < arrayOfInts.length ; i++) {
            temp[i] = arrayOfInts[i];
        }
        arrayOfInts = temp;
    }
}
