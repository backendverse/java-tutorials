package java8.shorts;

public class Demo {
    int num = 1;

    {
        System.out.print(num + "-");
    }

    {
        num = 3;
        System.out.print("B-");
    }

    public Demo() {
        num += 2;
        System.out.print(7 + "-");
    }

    // A-1-B-7-5-
    static void main(String[] args) {
        System.out.print("A-");
        Demo d = new Demo();
        String str = "";
//        str.equals()
        System.out.print(d.num + "-");
    }
}
