public class Beersong {
    
    public static void words(int bottles){
        if(bottles == 0){
            System.out.println("No more bottles of beer on the wall.");
            
        } else {
            System.out.println(bottles + " bottles of beer on the wall," + bottles + " bottles of beer");
            System.out.println("take one down, pass it around," + (bottles -1) + " bottles of beer on the wall.");
            System.out.println();
        }
    }}