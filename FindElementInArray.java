package ClassAssignment;

import java.util.*;
//code by Rakib Mridha
public class FindElementInArray {
    public static void main(String[] args)
    {
        int num, z, flag = 0, i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements array:");
        num = sc.nextInt();

        System.out.println("Elements of Array:");
        int arr[] = new int[num];
        for(i = 0; i < num; i++)
        {
            arr[i] = sc.nextInt();
        }


        System.out.print("To find:");
        z = sc.nextInt();
        for(i = 0; i < num; i++)
        {
            if(arr[i] == z)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

