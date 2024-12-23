import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
        myList.add("tom");
        myList.add("jerry");
        myList.add("cat");
        myList.add(3, "mouse");
        myList.add(1, "dog");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("fish"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("jerry");
        
        System.out.println("New Size of ArrayList: " + myList.size());
	}

}
