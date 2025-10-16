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
/*
for(int i = 1; i<= 100; i++) {
String printme = " ";
if(i % 3 == 0) printme = "Fizz";
if (i % 5 == 0) printme + printme = "whizz";
if (i % 7 == 0) printme = printme + "buzz";
if (i % 11 == 0) printme = printme + "bang";
if(printme.isEmpty()) System.out.println(i)
else System.out.println(printme);
if (printme.equals("Fizzbuzzwhizzbang")) break;
}
 */