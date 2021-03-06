/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int[] elements;
    private int filledElements;

    private static final int INITIAL_CAPACITY = 10;	
	
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        elements = new int[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String s = "[";
        for ( int count = 0 ; count < filledElements ; count++) {
			s = s
				+ elements[count]
				+ ",";
	    }
        return s + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add(int value) {
        if (filledElements >= elements.length) {
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
        int[] temp = new int[2 * elements.length];
        for (int i = 0; i < elements.length ; i++) {
            temp[i] = elements[i];
        }
        elements = temp;
    }
}
