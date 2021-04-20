import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(sequentialSearch(3,list));

    }
    public static int sequentialSearch(int key, List<Integer>list){
        int low = 0;
        int hight = list.size()-1;
        while (hight >= low){
            int mid = (low+hight)/2;
            if (key <list.get(mid)){
                hight = mid-1;
            }else
                if (key == list.get(mid)){
                    return mid;
                }
                else {
                    low = mid+1;
                }
        }return  -1;

    }
}
