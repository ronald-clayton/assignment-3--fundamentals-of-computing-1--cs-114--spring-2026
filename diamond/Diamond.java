import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int height = scan.nextInt();

    printDiamond(height);

    scan.close();
  }

  public static void printDiamond(int height) {
    int basediamond, diamondWidth;

    if (height % 2 == 0) {
      basediamond = height / 2;
      diamondWidth = 4 * basediamond - 1;

      printFirstLastRow(diamondWidth);

      for (int row = 1; row <= basediamond; row++) {
        int countDiamonds = 2 * row;
        printDiamondRow(countDiamonds, diamondWidth);
      }

    for (int row = basediamond - 1; row >= 1; row--) {
      int countDiamonds = 2 * row;
      printDiamondROw(countDiamonds, dimaondWidth);
    }

    printFirstLastRow(diamondWidth);

  }else{
    basediamond = (height +1) /2;
    diamondWidth = 4 * basediamond - 3;

      for (int row =1; row <= height; row++) {
        int countDiamonds;

        if (row <= basediamond){
          countDiamonds = 2 * row - 1;
        } else {
          countDiamonds = 2 * (height - row) + 1;
        }
        printDiamondRow(countDiamonds, diamondWidth);
      }
    }
  }
}
