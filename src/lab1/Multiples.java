package lab1;

public class Multiples {
    public static void main(String[] args) {
        int c = multiples(1000,5,3);
        System.out.println(c);

    }
    public static int multiples (){
        return multiples(1000,3,5);
    }
    public static int multiples( int n,int a, int b) {
        int i = 1;
        int c = 0;
        while(i<n){
            if (i%a==0 || i%b==0){
                c++;
            }
            i++;
        }
        return c;
    }
}
