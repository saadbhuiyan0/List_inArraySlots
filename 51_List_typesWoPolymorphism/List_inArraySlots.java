/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        typeOfElements = new int[INITIAL_CAPACITY];
        intElements = new int[INITIAL_CAPACITY];
        doubleElements = new double[INITIAL_CAPACITY];
        stringElements = new String[INITIAL_CAPACITY];
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
         String result = "[";
         for( int elemIndex = 0; elemIndex < filledElements; elemIndex++) {
             if (typeOfElements[elemIndex] == 0) {
                 result += intElements[elemIndex] + ",";
             }
             if (typeOfElements[elemIndex] == 1) {
                 result += doubleElements[elemIndex] + ",";
             }
             if (typeOfElements[elemIndex] == 2) {
                 result += stringElements[elemIndex] + ",";
             }
         }
         return result + "]";
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( int type   // same meaning as in typeOfElements
                        , int    intValue
                        , double doubleValue
                        , String stringValue
                        ) {
          if( filledElements == typeOfElements.length) expand();
          if (type == 0) {
              typeOfElements[filledElements] = type;
              intElements[filledElements] = intValue;
          }
          if (type == 1) {
              typeOfElements[filledElements] = type;
              doubleElements[filledElements] = doubleValue;
          }
          if (type == 2) {
              typeOfElements[filledElements] = type;
              stringElements[filledElements] = stringValue;
          }
          filledElements++;
          return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
         System.out.println( "expand... (for debugging)");
            /* S.O.P. rules for debugging:
               Working methods should be silent. But during
               development, the programmer must verify that
               this method is called when that is appropriate.
               So test using the println(), then comment it out.
               */

          int[] typeExpansion = new int[filledElements * 2];
          for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
              typeExpansion[ elemIndex] = typeOfElements[ elemIndex];
          typeOfElements = typeExpansion;

          int[] intExpansion = new int[filledElements * 2];
          for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
              intExpansion[ elemIndex] = intElements[ elemIndex];
          intElements = intExpansion;

          double[] doubleExpansion = new double[filledElements * 2];
          for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
              doubleExpansion[ elemIndex] = doubleElements[ elemIndex];
          doubleElements = doubleExpansion;

          String[] stringExpansion = new String[filledElements * 2];
          for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
              stringExpansion[ elemIndex] = stringElements[ elemIndex];
          stringElements = stringExpansion;
      }

      public Element get(int index) {
          Element getValue = new Element();
          if (typeOfElements[index] == 0) {
              getValue.type = 0;
              getValue.intValue = intElements[index];
          }
          if (typeOfElements[index] == 1) {
              getValue.type = 1;
              getValue.doubleValue = doubleElements[index];
          }
          if (typeOfElements[index] == 2) {
              getValue.type = 2;
              getValue.stringValue = stringElements[index];
          }
          return getValue;
      }
}