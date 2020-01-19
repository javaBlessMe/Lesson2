public class lesson2 {
    public static void main(String[] args) {

    }
    //first task
    private static int[] changeZeroOne (int[] a){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==0) a[i]=1;
            else a[i] =0;
        }
        return a;
    }
}
