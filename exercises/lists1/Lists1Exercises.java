public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
    	if (L.rest == null) 
    		L = new IntList(L.first+x, null);
    	else 
    		L = new IntList(L.first+x, incrList(L.rest, x));
        return L;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
    	L.first = L.first + x;
    	if (L.rest != null)
    		L.rest = dincrList(L.rest, x);
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        
        for (int i=0; i<L.size(); i++)
			System.out.println(L.get(i));
        
        IntList G = dincrList(L,10);
        IntList H = incrList(L,20);        
        
        for (int i=0; i<G.size(); i++)
			System.out.println(G.get(i));
        for (int i=0; i<H.size(); i++)
			System.out.println(H.get(i));
        for (int i=0; i<L.size(); i++)
			System.out.println(L.get(i));
        
        /** dincrList returns the same address as input L but incrList returns a different address.
         *  dincrList changes the value in L but incrList does not. */
        System.out.println(L);
        System.out.println(G);
        System.out.println(H);
        
        // System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}