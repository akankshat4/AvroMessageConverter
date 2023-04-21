package classes.functionalInterface.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumerInterface {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=10; i++){
            list.add(i);
        }

        Consumer<ArrayList<Integer>> modify = (ArrayList<Integer> list1)->{
            for (int i=1; i<10; i++){
                list1.set(i, (list1.get(i))*2);
            }
        };

        modify.accept(list);

        for(int temp : list){
            System.out.println(temp);
        }
    }
}
