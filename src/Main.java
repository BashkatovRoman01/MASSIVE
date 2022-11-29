public class Main {
    public static void main(String[] args) {
     //Задание 1
        System.out.println("Задание 1");
        int[] arr1= {1,2,3};
        double[] arr2= {1.57, 7.654, 9.986};
        int[] arr3= {1,2,3,4,5,6,7,8};
        for (int i = arr1.length-1; i >= 0; i--) {
            System.out.println(arr1[i]);
            if (i!=0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = arr2.length-1; i >= 0; i--) {
            System.out.println(arr2[i]);
            if (i!=0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i =arr3.length-1; i >= 0; i--) {
            System.out.println(arr3[i]);
            if (i!=0) {
                System.out.println(", ");
            }
        }
        System.out.println();

    }
    }
