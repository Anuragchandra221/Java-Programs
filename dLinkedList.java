import java . util .*;
class Dlinkedlist {
    public static void main ( String args []) {
        LinkedList < Integer > ll = new LinkedList < Integer >(); //Create a LinkedList object ll

        ll.add(10); // appends 10 to the list
        ll.add(30); // appends 30 to the list
        ll.addFirst(0); // adding 0 in first position
        ll.addLast(40); // adding 30 in last position
        ll.add(2, 20); // adding 20 in second position

        System.out.println ( "List After Insertion : " );
        ListIterator < Integer > itr = ll.listIterator(); // creating iterator object itr
        
        while ( itr.hasNext()) {
            System.out.print( itr.next () + " "); // 0 10 20 30 40
        }

        System.out.println("\nList from backwards before removing: ");
        while(itr.hasPrevious()){
            System.out.print(itr.previous() + " "); // 40 30 20 10 0
        }

        ll.remove ( 0 ); // removing value at 0th position
        ll.remove(Integer.valueOf(10)); // removing value 10

        System.out.println("\nSize is " + ll.size()); // 3

        System.out.println ( "List After Removing : " );
        ListIterator < Integer > rti = ll.listIterator(); 

        while ( rti.hasNext ()) {
            System.out.print( rti.next ()+" "); // 20 30 40
        }

        System.out.println("\nList from backwards: ");
        while(rti.hasPrevious()){
            System.out.print(rti.previous()+" "); // 40 30 20
        }

        int a;
        System.out.println("\nSearching for 40: ");
        while(rti.hasNext()){
            a = rti.next();
            if(a==40){
                System.out.println(a); // 40
                System.out.println("found at index "+ll.indexOf(a)); //2
            }
        }
    }
}