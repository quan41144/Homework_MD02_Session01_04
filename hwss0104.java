import java.util.*;

public class hwss0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("width = ");
        float width =  sc.nextFloat();
        System.out.print("height = ");
        float height = sc.nextFloat();
        float area = width*height;
        float perimeter = 2*(width+height);
        System.out.printf("Diện tích: %.2f%n", area);
        System.out.printf("Chu vi: %.2f%n", perimeter);
        sc.close();
    }
}
