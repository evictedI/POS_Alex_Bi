
public class comparison
{
    public boolean equals(){
        return true;
    }

    public static void samee() {
        comparison one = new comparison();
        comparison two = new comparison();
        System.out.println(one == two);
        System.out.println(one.equals(two));
    }

    public static void Sameorequal() {
        String a = "Hi";
        String b = "Hi";
        boolean same = a == b;
        System.out.println("same?" + same);
        boolean equals = a.equals(b);
        System.out.println("equal?" + equals);
    }
}