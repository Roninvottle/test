package test;

public class Test {
    public static void main(String[] args) {
        int [] arr;
        int arre[];
        int []a = {1,2,3,4,5,6};
        arr = new int[6];
        arre = new int[6];
        int j=0;
        for (int temp: a){

            arr[j]=temp;
            j++;
        }
        arre = arr;
        for (int i = 0; i <= 5; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(arre[i]+"  ");
        }
        System.out.println();
        arre [0] = 5;
        arre [1] = 6;
        arr [5] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < arre.length; i++) {
            System.out.print(arre[i]+"  ");
        }

//        输出地址值
        System.out.println();
        System.out.println(a);
        System.out.println(arr);
        System.out.println(arre);

/*空指针异常
        a=null;
        System.out.println(a[0]);*/
    }
}
