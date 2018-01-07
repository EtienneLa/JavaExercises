public class Exc18_6 {
    public static void main(String[] args) {
        int[] arr = {45, 87, 39, 32, 93, 86, 12, 44, 75, 50};
        //int slotadd = 0;

        System.out.print("before: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        for (int i = 0/*slotadd*/; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){

                if (arr[j] > arr[i]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                    //slotadd++;
                }
            }
        }
        System.out.println("after: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}