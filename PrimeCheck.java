public class PrimeCheck {
    public static void main(String[] args) {
        int num = 13, flag = 0;
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) flag = 1;
        }
        if(flag == 0) System.out.println(num + " is Prime");
        else System.out.println(num + " is Not Prime");
    }
}
