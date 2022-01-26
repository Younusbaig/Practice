public class SortInteger {
    
    public static void sorted(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            for (int j = i; j < numArray.length; j++) {
                if (numArray[i] > numArray[j]) {
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println("final values after sort");
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i] + ",");
        }
    }
}
