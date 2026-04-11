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
      printDiamondRow(countDiamonds, diamondWidth);
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

  public static void printDiamondRow(int countDiamonds, int diamondWidth) {
    int rowWidth = 2 * countDiamonds - 1;
    int diamondSpace = (diamondWidth - rowWidth) / 2;

    for (int i = 0; i < diamondSpace; i++) System.out.print(" ");

    for (int i = 0; i < countDiamonds; i++) {
      System.out.print("*");
      if (i < countDiamonds - 1) System.out.print(" ");
    }

    System.out.println();
  }

  public static void printFirstLastRow(int diamondWidth) {
    int dimaondSpaces = (diamondWidth - 1) /2;

    for (int i =0; i < dimaondSpaces; i++) System.out.print(" ");

    System.out.println("*");
  }
}
