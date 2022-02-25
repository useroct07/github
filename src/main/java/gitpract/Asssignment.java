package gitpract;
import java.util.*;

public class Asssignment {
    public static void findUnmatched(ArrayList<String> l){
        ArrayList<String> unmatched = new ArrayList<>(l);
        for(int i=0;i<l.size()/2;i++){
            System.out.println(unmatched.get(i)+"->"+unmatched.get(l.size()-i-1));
        }
    }
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<String>();
        list.add("sidharth");
        list.add("arbazz");
        list.add("pritam");
        list.add("aryan");
        list.add("mayank");
        list.add("roger");
        list.add("rohot");
        list.add("nitin");
        findUnmatched(list);

    }
}
