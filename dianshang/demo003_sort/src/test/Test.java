package test;

public class Test {
    public static void main(String[] args) {
        int [] arr = {12,49,56,87,32,6,78,99,451,100};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        maoPaoSortUp(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        maoPaoSortDown(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }
    /*
  (1)冒泡排序的原理：
    每一趟只能确定将一个数归位。即第一趟只能确定将末位上的数归位，第二趟只能将倒数第 2 位上的数归位，
    依次类推下去。如果有 n 个数进行排序，只需将 n-1 个数归位，也就是要进行 n-1 趟操作。

    而 “每一趟 ” 都需要从第一位开始进行相邻的两个数的比较，将较大的数放后面，比较完毕之后向后挪一位
    继续比较下面两个相邻的两个数大小关系，重复此步骤，直到最后一个还没归位的数。
*/
    //升序
    public static void maoPaoSortUp(int [] arr){
        int temp;
        boolean flag=true;
        /*flag的作用提高了排序的效率，减少了没必要的比较；

        * */
        for (int i = 0; i < arr.length-1 && flag; i++) {
                flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
    }

    //降序
    public static void maoPaoSortDown(int [] arr){
        int temp;
        boolean flag=true;
        /*flag的作用提高了排序的效率，减少了没必要的比较；

         * */
        for (int i = 0; i < arr.length-1 && flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
    }
}
