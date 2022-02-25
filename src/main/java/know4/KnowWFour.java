package know4;

import java.util.ArrayList;

public class KnowWFour{

    public static boolean isArrayListEmpty(ArrayList<String> list){
        if(list == null || list.isEmpty() ){
            System.out.println("Empty or Null Arraylist");
            return true;
        }else{
            return false;
        }
    }

    public boolean meetScheduler(ArrayList<String> list){
        if(isArrayListEmpty(list)){
            return true;
        }else if(list.size()%2==1){
            list.add("No Meet");
            meetPairGenerator(list);
        }else{
            meetPairGenerator(list);
        }
        return true;
    }

    public ArrayList meetPairGenerator(ArrayList<String> list){
        for(int itr=0;itr< list.size()-1;itr++){
            System.out.println("Schedule for Day "+(itr+1));
            for(int i=0;i<(list.size())/2;i++){
                System.out.println(list.get(i)+" - "+list.get(list.size()-1-i));
            }
            System.out.println(":::::::::::");
            list.add(1,list.get(list.size()-1));
            list.remove(list.size()-1);
        }
        return list;
    }
}