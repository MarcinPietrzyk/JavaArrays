
package Arrays;

public class Arrays {
    public static void main(String[] args) {

//      I. First way of copying Arrays

        int[] original = {1, 2, 3, 4};
        int[] copy = new int[original.length];

        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }

        System.out.println("Original, 3rd element is: " + original[2]);
        System.out.println("Copy, 3rd element is:  " + copy[2]);
        copy[2] = 20;
        System.out.println("Original, 3rd element is: " + original[2]);
        System.out.println("Original, 3rd element is: " + copy[2]);

//      II. Second way of copying Arrays with clone method.
        int[] original2 = {4, 3, 2, 1};
        int[] copy2 = (int[])original2.clone(); //casting int[]

        System.out.println("Original2, 1st element is: " + original2[0]);
        System.out.println("Copy2, 1st element is: " + copy2[0]);

    }


}
