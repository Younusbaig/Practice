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
        }
    }
