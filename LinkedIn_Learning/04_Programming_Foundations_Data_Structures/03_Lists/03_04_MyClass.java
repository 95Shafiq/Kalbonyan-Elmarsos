import java.util.LinkedList;

public class MyClass {
    public static void main(String args[]) {
        LinkedList travelBucketList = new LinkedList();
        
        // add distination
        travelBucketList.add("'Aswan, Egypt'");
        travelBucketList.addFirst("'Luxor, Egypt'");
        travelBucketList.addLast("'Abu Dhabi, UAE'");
        travelBucketList.add(2, "'Tokyo, Japan'");
        travelBucketList.add("'Texas, USA'");
        
        System.out.println(travelBucketList);
        
        // access
        
        System.out.println(travelBucketList.get(2));
        System.out.println(travelBucketList.getFirst());
        System.out.println(travelBucketList.contains("'Paris, France'"));
        
        // remove
        travelBucketList.removeFirst();
        travelBucketList.removeLast();
        
        System.out.println(travelBucketList);
        
        travelBucketList.remove("'Aswan, Egypt'");
        travelBucketList.remove(1);
        
        System.out.println(travelBucketList);

    }
}