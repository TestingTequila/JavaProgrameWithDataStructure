package Day23_Patterns;

public class MirroredRightTriangle {
    public static void main(String[] args) {
        mirroredTriangle(10);
    }

    public static void mirroredTriangle(int count) {
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j <= (count - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

}
