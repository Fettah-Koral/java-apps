package Uygulamalar4;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

    class PalindormSayi
{

static double digit(int x,int i){
    double num=10, remainder;
    num=Math.pow(num, i);
    remainder=x%num;
return remainder;
}
static int reverse(int x ,int y){
    int rvs=0,c=y;
    for (int i=1;i <=y; i++) {
        if (c==1){
            rvs+=(x%Math.pow(10, i)*Math.pow(10, y));
            continue;
        }
        rvs+=(x/Math.pow(10, i-1))*Math.pow(10,c-1);
        c--;
    }return rvs;
}

static boolean isPalindorm(int x ){
    boolean result=false;
    double sum=0;
    int y=0;
    int a =x;
    while(a>0) {
        a/=10;
        y++;
    }
    x=reverse(x, y);
    System.out.println("+--"+x);

    for (int i=1;i<=y;i++){
        if (i==1) {
            sum+=digit(x, i);
            continue;
        }
        sum+=digit(x,i)*Math.pow(10,i-1);
    }
    if (sum==x) result=true;
    return result;
}
 public static void main(String[] args) {
    
    Scanner inp =new Scanner(System.in);
    System.out.print("enter a number : ");
    int input=inp.nextInt();
    if (isPalindorm(input)) System.out.println("number is palindorm ");
    else System.out.println("number is not palindorm ");
 }
}