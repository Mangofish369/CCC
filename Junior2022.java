import java.util.*;
import java.io.*;

public class Junior2022
{
    public static void main (String [] args) throws Exception {
        j4();
    }
    
    public static void j4(){
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> toPair = new HashMap<>();
        HashMap<String, String> noPair = new HashMap<>();
        
        int numOfPairs = scan.nextInt();
        for(int i = 0; i<numOfPairs; i++){
            
        }
    }
    
    public static void store(int totalLines, HashMap<String, String> map){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < totalLines; i++){
            String pair = scan.nextLine();
            
            String [] list = pair.split(" ");
            
            map.put(list[0], list[1]);
            map.put(list[1], list[0]);
        }
    }
}
