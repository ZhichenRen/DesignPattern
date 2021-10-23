package Observer;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        //创建三个员工，他们都是观察者，能收到群发的消息
        //他们观察的subject都是相同的
        Worker one = new Worker(subject,"one");
        Worker two = new Worker(subject,"two");
        Worker three = new Worker(subject,"three");

        boolean goon = true;

        while (goon) {
            System.out.println("Edit a message:");
            Scanner input = new Scanner(System.in);
            String message = input.nextLine();

            subject.setMessage(message);

            System.out.println("Whether to send a group message？(y/n)");
            Scanner input2 = new Scanner(System.in);
            String ifgoon = input2.next();
            if(ifgoon.equals("y")){
                goon = true;
            }else {
                goon = false;
                System.out.println("Exit Successfully!");
            }
        }
    }
}
