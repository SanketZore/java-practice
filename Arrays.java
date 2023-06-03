import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int  num[]={2,4,8,7,1};
//        System.out.println(num[1]);

//      marks[i]
//        for(int i=0 ; i<size ; i++){
//            System.out.print("Marks ["+i+"] = ");
//            marks[i]=sc.nextInt();
//        }
//        for(int i=0 ; i<size ; i++){
//            System.out.println("Marks ["+i+"] = "+marks[i]);
//        }


//        String[] names={"sanket" ,"Rohit", "Shubham"};
//        System.out.println(names.length);
//        int count=0;
//        for(int i=0 ; i<names.length ; i++){
//            System.out.println(names[i]);
//            count++;
//        }
//        System.out.println(count);


//        System.out.print("Enter No of Rows= ");
//        int row=sc.nextInt();
//        System.out.print("Enter No of Columns= ");
//        int col=sc.nextInt();

//        int[][] num = new int[row][col];
//        for(int i=0 ; i<row ; i++){
//            for(int j=0;j<col;j++){
//                num[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0 ; i<row ; i++){
//            System.out.print("| ");
//            for(int j=0;j<col;j++){
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println("| ");
//        }


// size of rows is fixed and column varies
//        int[][] num={
//                {2,4,5},
//                {7,6,7,9},
//                {4,2}
//        };
//        for(int i=0 ; i<3 ; i++){
//            for(int j=0;j<num[i].length;j++){
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println("");
//        }


//        int[][] num=new int[3][];
//        num[1]=new int[2];
//        num[2]=new int[3];
//        num[3]=new int[1];


//        Enhanced For Loop
//        int[] num={4,5,7,9,6};
//        for(int n:num){
//            System.out.println(n);
//        }

//        int[][] num={
//                {2,4,5},
//                {7,6,7,9},
//                {4,2}
//        };
//        for(int a[]:num){
//            for(int b:a){
//                System.out.print(b+" ");
//            }
//            System.out.println("");
//        }

//            int num=8;
//            int cal=num/2;
//            for(int i=0;i<num;i++){
//                for(int j=1;j<=cal;j++){
//                    int sum=cal-i;
//                    if(j==sum || j==cal){
//                        System.out.print("*");
//                    }
//                    if(i==cal){
//                        System.out.print("*");
//                        if(j==cal){
//                            for(int k=1;k<cal-1;k++){
//                                System.out.print("*");
//                            }
//                        }
//                    }else{
//                        System.out.print(" ");
//
//                    }
//                }
//                System.out.println("");
//            }

//        int num1=15;
//        int num;
//        if(num1%2==0){
//            num=num1;
//        }else{
//            num=num1-1;}
//        for(int i=0;i<num;i++){
//            for(int j=1;j<=num;j++){
//                int cal=num/2;
//                int sum=cal-i;
//                int sum2=cal+i;
//                int sum3=i-cal+1;
//                int sum4=2*cal-sum3;
//                if(j==sum || j==sum2 && i<cal ||( i>=cal && (j==sum3 || j==sum4))){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }


//        System.out.print("Enter Number = ");
//        int num=sc.nextInt();
//        for(int i=0;i<num;i++){
//            for(int j=1;j<=num;j++){
//                int sum=num-i;
//                int sum1;
//
//                if(num%2!=0){
//                    num+=1;
//                    sum1=(num/2)+1;
//                }else{
//                    sum1=(num/2);
//                }
//
//                int sum2=i-sum1;
//                if((i<=sum1 &&(j<=i ||j>sum )) || (i>sum1 && (j<=sum1-sum2 ||j>sum1+sum2))){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }


//        System.out.print("Enter Number = ");
//        int num=sc.nextInt();
//        int sum=num*3;
//        for(int i=0;i<sum;i++){
//            for(int j=1;j<=num;j++){
//                int sum1=sum-i;
//                if(j==num-i || (i>=num && i<=num*2 && j==i-num+1) || (i>=num*2 && j==sum1 )){
//                    System.out.print("****");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//                System.out.println("");
//        }


//        System.out.print("Enter Number = ");
//        int num=sc.nextInt();

//        int sum=7;
//        int num= 7;
//        for(int i=1;i<=sum;i++){
//            for(int j=1;j<=num;j++){
//                int sum1=sum/2;
//                int sum2=sum1*2;
//                if((i==1 && j>2) || (i>1 && i<=sum1 && j==1) || (i==sum1+1 && (j>1 && j<num-1)) ||(i<=sum2 && i>sum1+1 && j==num) || (i==sum && j<num) ){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//                System.out.println("");
//        }


        int[] array = {2,4,7,8};
        System.out.println(array[4);


    }}
