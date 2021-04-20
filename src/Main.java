import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số muốn tìm kiếm: ");
        int number = scanner.nextInt();
        if (sequentialSearch(number,list)== -1){
            System.out.println("Không có trong danh sách!");
        }else {
            System.out.println(sequentialSearch(number,list));
        }


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
