/**
 Test list features.
 */
public class UserOfList_addenda {
  private static List_inArraySlots_addenda list = new List_inArraySlots_addenda();
    public static void main( String[] args ) {

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        /* Populate the list with elements, but with a small enough
           number that we expect no invocation of expand().
        */
        int elemIndex;
        for( elemIndex = 0; elemIndex < 5; elemIndex++ ) {
            list.add( -elemIndex); // differs from index, but similar
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("initial population of " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Add enough elements that expansion is expected
        for( ; elemIndex < 15; elemIndex++ ) {

            if( elemIndex == 10) System.out.println( "expansion expected");

            list.add( -elemIndex);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of second population: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // Trust no one.
        for( ; elemIndex < 35; elemIndex++ )
            list.add( -elemIndex);
        System.out.println("after second expansion: " + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        // --------- end of "code that worked in v0" ---------

/*
Test methods newly-added to List_inArraySlots.

Start by marking the end the code that has been tested.
I am reluctant to delete working code (since working 
code is rare in my life, and I might have further use 
for these tests. But I'd like make it easy to find new tests,
for myself and other readers. I'd use a comment like...
*/

        // --------- end of "code that worked in v0" ---------

        // test accessor
        System.out.println( "sample elements from list:");
        for( elemIndex = 1; elemIndex < list.size(); elemIndex *= 2 ) {
            System.out.println( "element " + elemIndex + ": "
                              + list.get( elemIndex)
                              );
        }
        
// -------------------------------------------
     // Local method and invocations of it to...
        // test set
        setTest(  8);
        setTest( 16);

        removeTest( 2);
        removeTest( 33);

        addAtTest( 0, 29); // beginning of the list

        // end of the list using the new add method
        addAtTest( list.size(), 17);

        addAtTest( 2, 19); // middle of a small list

        // Check this test. Is the array full?
        addAtTest( 2, 23); // force an expansion
      }
          
    /**
      Test the set() method, reporting and
      changing the value at index @modifyAt.
     */
    private static void setTest( int modifyAt) {
        System.out.println(
            "changed element " + modifyAt + " from "
          + list.set( modifyAt, modifyAt + 1000) + " to "
          + list.get( modifyAt)
          );
     }
     
     
// -------------------------------------------
        /* 
          Test one-argument method: remove( int index)
        */
        private static void removeTest( int removeFrom) {
          list.remove(removeFrom);
          System.out.println(
            "remove from index: " + removeFrom
            + ", resulting in " + list.size() + " elements: "
            + System.lineSeparator()
            + list
            + System.lineSeparator()
            );
        }


// -------------------------------------------
//      Local method and invocations of it to
//      test adding an element at a specified position.

    /**
      Test the 2-argument add( index, value) method.
     */
    private static void addAtTest( int addAt
                                 , int value
                                 ) {
        list.add( addAt, value);
        System.out.println(
            "insert " + value 
          + " at position " + addAt
          + ", resulting in "  + list.size() + " elements:"
          + System.lineSeparator()
          + list
          + System.lineSeparator()
        );
    }
  }

