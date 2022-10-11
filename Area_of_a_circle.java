import java.util.Scanner;
class area{
    public static void main(String args[]){
        double n;
        Scanner s=new Scanner(System.in);
        double ar=0;
        n=s.nextFloat();
        ar=3.14*n*n;
        System.out.format("%.2f",ar);
    }
}