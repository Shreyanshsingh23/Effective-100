public class print_three_digit_armstong_numbers {
    public static void main(String[] args){

        System.out.println("Three digit armstrong numbers are :- ");
        armstrong_numbers();
    }

    static void armstrong_numbers() {
     
        int n = 100;   // because smalllest three digit number is 100
         
        while(n <  1000){   // and largest three digit number is 999
           int temp = n;
            int sum = 0;

            while(n != 0){
                 
                int digit = n%10;
                sum = sum + digit*digit*digit;
                n = n/10;


            }
        
            if(sum==temp){
                System.out.println(temp);
            }
            n = temp;
            n++;
        }

    }
}
