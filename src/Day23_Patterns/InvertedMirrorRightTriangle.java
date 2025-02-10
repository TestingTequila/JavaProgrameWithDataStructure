package Day23_Patterns;

public class InvertedMirrorRightTriangle {
    public static void main(String[] args) {
        invertedMirrorTriangle(10);
    }

    //i=1; j=2; [j>9]
    public static void invertedMirrorTriangle(int count) {
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
