import java.util.Scanner;

public class Matrix_multiplication {
    public static void main(String[] args) {
        int m,n,p,q,i,j,k;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimention of both matrix");
        m = sc.nextInt();
        n = sc.nextInt();
        p = sc.nextInt();
        q = sc.nextInt();

        if(n!=p)
        System.out.println("Multiplication not possible");
        else{

        int mat1[][] = new int [m][n];
        System.out.println("enter the value in the matrix 1");
        for (i=0;i<m;i++){
            for (j=0;j<n;j++){
                mat1[i][j]= sc.nextInt();
            }
        }

        int mat2[][] = new int [p][q];
        System.out.println("enter the value in the matrix 2");
        for (i=0;i<p;i++){
            for (j=0;j<q;j++){
                mat2[i][j]= sc.nextInt();
            }
        }

            //System.out.println();
            int mat3[][] = new int[m][q];
            for (i=0;i<m;i++){
                for (j=0;j<q;j++){
                    for(k=0;k<n;k++)
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
            for (i=0;i<m;i++){
                for (j=0;j<q;j++){
                    System.out.print(mat3[i][j]+" ");
            }   
            System.out.println();
        }
            
        }
    }
}

