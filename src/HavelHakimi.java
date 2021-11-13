import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class HavelHakimi {

    //Delete all zeroes from the list
    public static void deleteZeros(ArrayList<Integer> list){

        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            if(num == 0){
                list.remove(i);
                i = 0;
            }
        }
    }

    //Put the list in descending order
    public static void descendingSort(ArrayList list){
        Collections.sort(list, Collections.reverseOrder());
    }

    //Check the length of the list against a given number
    public static boolean lengthCheck(int length, ArrayList list){
        if(length > list.size()){
            return true;
        } else{
            return false;
        }
    }
    //Subtract 1 from the first N numbers in the list
    public static void frontElim(int numElim, ArrayList list){
        System.out.println(numElim);
        System.out.println(list.size());
        if(numElim >= list.size()){
            System.out.println("Shits fucked");
        }
        for(int i = 0; i <= numElim; i++){
            list.set(i, (Integer) list.get(i) -1);
        }
    }

    //Recursively perform the Havel-Hakimi algorithm
    public static boolean HavelHakimi(ArrayList list){
        int N = 0;
        deleteZeros(list);
        if(list.size() == 0)
            return true;
        descendingSort(list);
        N = (int) list.remove(0);
        if(N > list.size())
            return false;
        frontElim(N, list);
        return HavelHakimi(list);
    }

    public static void main(String[] args){

        int numWitness = 10;

        //Create a random list
        Random random = new Random();

        ArrayList<Integer> randList = new ArrayList<>();
        for(int i = 0; i <= numWitness -1; i++){
            randList.add(random.nextInt(15));
        }

        //Make a pre defined list for testing
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(2);
        testList.add(0);
        testList.add(1);
        testList.add(5);
        testList.add(0);

        //Test the algorithm and print the result
        System.out.println(HavelHakimi(testList));
    }
}
