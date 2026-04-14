public class Matrix {
  private int [] [] matrix;

  public Matrix(int size) {
    matrix = new int [size] [size];
    System.out.println("Your matrix is " + size + "x" + size + "\n");
  }

  public void populateMatrix() {
    int value = 1;
    int size = matrix.length;
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        matrix[row] [col] = value++;
      }
    }
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix [x1] [y1];
    matrix [x1] [y1] = matrix [x2] [y2];
    matrix [x2] [y2] = temp;
  }

  public void flipMatrix() {
    int size = matrix.length;

    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if ( row + col < size - 1) {
          int swapR = size - 1 - col;
          int swapC = size - 1 - row;
          swap(row, col, swapR, swapC);
        }
      }
    }
  }

  public void printMatrix(){
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";

    int size = matrix.length;

    for (int row =0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if (row + col == size - 1) {
          System.out.print(HIGHLIGHT + matrix[row][col] + RESET + "\t");
        } else {
          System.out.print(matrix[row][col] + "\t");
        }

      }
        System.out.println();
    }
  }
  public int [][] getMatrix(){
    return matrix;
  }
}
