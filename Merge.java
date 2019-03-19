import java.util.Arrays;
public class Merge {
  public static void mergesort(int[] dat) {
    msh(dat, 0, dat.length - 1);
  }
  public static void msh(int[] dat, int l, int h) {
    if(l >= h) {return;}
    int[] lra = Arrays.copyOfRange(dat, 0, (dat.length + 1) / 2);
    int[] hra = Arrays.copyOfRange(dat, (dat.length + 1) / 2, dat.length);
  }
  public static void main(String[] javabeans) {
    int[] da = {8,6,7,5,2,4,0,3,1,9};
    mergesort(da);
    for(int q = 0; q < da.length; q++) {
      System.out.print(da[q] + " ");
    }
  }
}
