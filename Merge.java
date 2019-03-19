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
    int li = 0;
    int hi = 0;
    int ind = 0;
    while(ind < dat.length) {
      if(li >= lra.length) {
        while(hi < hra.length) {
          dat[ind] = hra[hi];
          ind++;
          hi++;
        }
        return;
      }
      else if(hi >= hra.length) {
        while(li < lra.length) {
          dat[ind] = lra[li];
          ind++;
          li++;
        }
        return;
      }
      else if(lra[li] >= hra[hi]) {
        dat[ind] = hra[hi];
        hi++;
      }
      else {
        dat[ind] = lra[li];
        li++;
      }
      ind++;
    }
  }
  public static void main(String[] javabeans) {
    int[] da = {4,4,4,4,4,4,0,0,0,0,0,0,0,0,1,1,1,1,1,6,1,1,1,1,1,1};
    mergesort(da);
    for(int q = 0; q < da.length; q++) {
      System.out.print(da[q] + " ");
    }
  }
}
