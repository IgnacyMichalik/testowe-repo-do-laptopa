import java.util.Scanner;
class InOut {
    static public void main(String[] args) {
     /*    Scanner input = new Scanner(System.in);
        String abc = input.nextLine();
        StringBuffer sbf = new StringBuffer(abc);
        System.out.println("String buffer = " + sbf);


        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
        */

    Scanner input = new Scanner(System.in);
        String abc = input.nextLine();
        StringBuffer sbf = new StringBuffer(abc);

        System.out.println(sbf);
         sbf.reverse();
        System.out.println(abc.contains(sbf));
        System.out.println(sbf);

    }
}