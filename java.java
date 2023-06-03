import java.util.*;
public class java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array = ");
//        int n = sc.nextInt();


//        for(int i = 0 ; i <= (n-1) ;i++){
//            System.out.print((i+1)+") = ");
//            marks[i]=sc.nextInt();
//        }
//        for(int i = 0 ; i <= n ;i++){
//            System.out.println(marks[i]);
//        }
//        int []marks=new int[n];



//        System.out.print("Enter Number of Rows = ");
//        int n = sc.nextInt();
//        System.out.print("Enter Number of Columns = ");
//        int m = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if ((i > 1 && i < n && j > 1 && j < m)) {
//                    System.out.print("  ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println("");
//        }


//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if(j<=i){
//                System.out.print("* ");}
//                else if(j>i && j<(n-i+1)){
//                    System.out.print("  ");
//                }else{
//                    System.out.print("* ");
//                }
//            }
//        System.out.println("");
//        }


        System.out.print("Enter a Number= ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=2 && j<=(n/2)-i-1|| i==1 ){
                    System.out.print("*");}
                else if(i>1 && j<=(i+1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");}
            }
            System.out.println("");
        }

//        int n=9;
//        for(int i=0 ; i <n ; i++){
//            for(int j=0 ; j<n ; j++){
//                if (j==(n-1)-2 || i==1 && j==(n-1)-4 || i==2 && j==(n-1)-5 || i==3 && j==(n-1)-6 || i==4 && j==(n-1)-7 || i ==(n-1)/2 ){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }


//        System.out.println("     *");
//        System.out.println("    * *");
//        System.out.println("   *  *");
//        System.out.println("  *   *");
//        System.out.println(" **********");
//        System.out.println("      *");
//        System.out.println("      *");
//        System.out.println("      *");



    }
}




