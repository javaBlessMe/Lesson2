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

    //second task
    private static int[] fillArray(){
        int[] arr = new int[8];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i*3;
        }
        return arr;
    }

    //third task
    private static int[] fillArray3(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<6) arr[i]*=2;
        }
        return arr;
    }

    private static int[][] multArr(int size){
        int[][] multArr = new int[size][size];
        int a=size;
        for (int i = 0; i <size ; i++) {

            for (int j = 0; j <size ; j++) {
                if(j==(size-i-1)) {
                    multArr[i][j] = 1;
                }
                else{
                    multArr[i][j] = 0;
                }

            }
        }
      return multArr;
    }
}
