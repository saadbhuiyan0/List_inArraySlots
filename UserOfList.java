/** 
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inArraySlots list = new List_inArraySlots();

        // System.out.println( "number of elements: " + list.size() );
        // System.out.println( "empty list:" + list);

        // /* Populate the list with elements, but with a small enough
           // number that we expect no invocation of expand().
        // */
        // int i = 0;
        // for( ; i < 5; i++ ) {
            // list.add( -i); // differs from index, but similar
            // System.out.println( "number of elements: " + list.size() );
        // }
        // System.out.println("initial population of " + list.size() + " elements:");
        // System.out.println( list);
        
        // // Add enough elements that expansion is expected
        // for( ; i < 15; i++ ) {
            
            // if( i == 10) System.out.println( "expansion expected");
            
            // list.add( -i);
            // System.out.println( "number of elements: " + list.size() );
        // }
        // System.out.println("result of second population: " + list.size() + " elements:");
        // System.out.println( list);
        
        // // Trust no one.
        // for( ; i < 35; i++ ) 
            // list.add( -i);
        // System.out.println("after second expansion: " + list.size() + " elements:");
        // System.out.println( list);
    }
}
