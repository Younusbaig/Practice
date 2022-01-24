import java.util.Scanner;

public class SortInteger {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer values");
        int input  = sc.nextInt();
        int[] numArray = new int[input];

        for (int i=0; i<input; i++){
            System.out.println("enter values");
            numArray[i] = sc.nextInt();
        }
        System.out.println("you have entered");
        for (int i = 0; i< numArray.length; i++){
            System.out.println(numArray[i] + ",");
        }

        for (int i=0; i< numArray.length; i++){
            for(int j=i; j<numArray.length; j++){
                if (numArray[i] > numArray[j]){
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println("final values after sort");
        for (int i=0; i< numArray.length; i++){
            System.out.println(numArray[i] + ",");
        }

    }

}
