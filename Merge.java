import java.util.Arrays;
public class Merge {
  public static void mergesort(int[] dat) {
    msh(dat, 0, dat.length - 1);
  }
  public static void msh(int[] dat, int l, int h) {
    if(l >= h) {return;}
    int[] lra = Arrays.copyOfRange(dat, 0, (dat.length + 1) / 2);
    int[] hra = Arrays.copyOfRange(dat, (dat.length + 1) / 2, dat.length);
    msh(lra, 0, lra.length - 1);
    msh(hra, 0, hra.length - 1);
    for(int q = 0; q < lra.length; q++) {
      if(lra[q] >= hra[q]) {
        dat[q] = hra[q];
      }
      else {
        dat[q] = lra[q];
      }
    }
  }
  public static void main(String[] javabeans) {
    int[] da = {8,6,7,5,12,2,4,0,3,1,9,10};
    mergesort(da);
/*    for(int q = 0; q < da.length; q++) {
      System.out.print(da[q] + " ");
    } */
  }
}
