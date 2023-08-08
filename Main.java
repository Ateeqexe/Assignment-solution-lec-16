

class solution {
    //Q1 Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array
    void PrintPositiveValues() {
        int arr[] = {2, 6, -5, -1, 0, 4, -9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.println(arr[i]);
            }
        }
    }

    //Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all strings stored on odd indices of the array.
    void PrintOddIndicesElementAfterConvertingAllStringsInArray() {
        String[] arr1 = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr1[i]);
            }
        }
    }

    //Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
    void TraversingThroughForeachloopToPrintEvenElements() {
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int elements : arr2) {
            if (elements % 2 == 0) {
                System.out.println(elements);
            }
        }
    }

    //Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method  for calculating the minimum element.
    void CalMinElementInArrayUsingStdLibMethod() {
        int arr3[] = {2, -3,5, 8, 1, 0, -4};
        int min = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            min = Math.min(arr3[i], min);
        }
        System.out.println("The minimum element is " + min);
    }
    //Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3,5,7,0}
    //Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
    //
    //Leftmost and rightmost element cannot be a peak element.
    void FindingFirstPeakElementInArray(){
        int arr4[]={1,1,3,4,2,3,5,7,0};
        for(int i=1;i<arr4.length-1;i++){//leftmost and rightmost elements cant be peak so not considering them otherwise -1 and 1+length index will occur and give a compilation error.
            if(arr4[i]>arr4[i-1] && arr4[i]>arr4[i+1]){
                System.out.println(arr4[i]+" is the first peak element.");
                break;
            }
        }
    }
}
     public class Main {
         public static void main(String[] args) {
             solution obj = new solution();
             obj.PrintPositiveValues();
             obj.PrintOddIndicesElementAfterConvertingAllStringsInArray();
             obj.TraversingThroughForeachloopToPrintEvenElements();
             obj.CalMinElementInArrayUsingStdLibMethod();
             obj.FindingFirstPeakElementInArray();
         }
     }
