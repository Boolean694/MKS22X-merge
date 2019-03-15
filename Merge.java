public class Merge {
  public static void mergesort(int[] dat) {
    msh(dat, 0, dat.length - 1);
  }
  public static void msh(int[] dat, int l, int h) {
    if(l >= h) {return;}
    msh(dat, 0, (dat.length - 1) / 2);
    msh(dat, (dat.length - 1) / 2 + 1, dat.length - 1);
  }
  public static void main(String[] javabeans) {
    
  }
}
