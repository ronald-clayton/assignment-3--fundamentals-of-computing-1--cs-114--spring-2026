import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("\nPlease enter the size of your matrix:");
    int size = input.nextInt();

    Matrix mymatrix = new Matrix(size);

    System.out.println("\nPrinting matrix with default values:");
    mymatrix.printMatrix();

    System.out.println("\nPopulating matrix...matrix populated")
    System.out.println("\nPrinting matrix:");
    mymatrix.populateMatrix();
    mymatrix.printMatrix();

    System.out.println("\nFlipping matrix...matrix flipped");
    System.out.println("\nPrinting Flipped matrix:");
    mymatrix.flipmatrix();
    mymatrix.printMatrix();

    input.close();
  }
}
