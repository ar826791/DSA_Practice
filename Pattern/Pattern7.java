public class Pattern7 {
    public static void main(String[] args) {
        class Solution {
            public static void pattern7(int n) {
                for(int i = 1; i <= n; i++) {
                    for(int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    for(int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
            public static void pattern8(int n) {
                for(int i=1;i<=n;i++){
                    for (int j=1;j<=i-1;j++){
                        System.out.print(" ");
                    }
                    for(int k=1;k<= (2*n)-(2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            public  static void pattern9(int n){
                Solution.pattern7(5);
                Solution.pattern8(5);
            }
            public static void pattern10(int n){
                for (int i=1;i<=2*n-1;i++){
                    int star=i;
                    if(i>n){star=2*n-i;}
                    for(int j=1;j<=star;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            public static void pattern11(int n){
                for(int i=1;i<=n;i++){
                    int num=1;
                    if(i%2==0){num=0;}
                    for(int j=1;j<=i;j++){
                        System.out.print(num + " ");
                        if(num==0){num=1;}
                        else{num=0;}
                    }
                    System.out.println();
                }
            }
            public static void pattern12(int n){
                for (int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(j);
                    }
                    for(int k=1;k<=(2*n-1)-(2*i-1);k++){
                        System.out.print(" ");
                    }
                    for(int l=i;l>0;l--){
                        System.out.print(l);
                    }
                    System.out.println();
                }
            }
        }

        Solution.pattern12(5);

    }
}