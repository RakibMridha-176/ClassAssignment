package ClassAssignment;

import java.util.*;
//code by Rakib Mridha
public class TransposeMatrix {
    public static void main(String args[]){
        int matrix[][]={{1,3,4},{2,4,3},{3,4,5}};

        System.out.println("Main Matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
