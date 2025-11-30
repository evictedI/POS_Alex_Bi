public class fizzbuzz
{
    // instance variables - replace the example below with your own
    private int x;
    public fizzbuzz()
    {
        for(int i = 1000; i < 1200; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizzbuzz");
            }
            else if(i % 7 == 0 && i % 11 == 0)  {
                System.out.println("whizzbang");
            }
            else if(i % 7 == 0 && i % 11 == 0 && i % 5 == 0 && i % 3 == 0)  {
                System.out.println("fizzbuzzwhizzbang");
            }
            else if(i % 3 == 0)  {
                System.out.println("fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if(i % 7 == 0) {
                System.out.println("Whizz");
            }
            else if(i % 11 == 0) {
                System.out.println("Bang");
            }
            else System.out.println(i); 
        }
    }
}