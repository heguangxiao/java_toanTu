import java.util.Scanner;


public class java_toanTu {
    public static void main(String[] args) {
        float width;
        float height;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width : ");
        width = scanner.nextFloat();

        System.out.println("Enter height : ");
        height = scanner.nextFloat();

        area = width * height;

        System.out.println("Area is : " + area);
    }
}