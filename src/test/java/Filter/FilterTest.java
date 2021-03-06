package Filter;

/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/31 3:00 PM
 * @Version 1.0
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Filter.CriteriaDemo.printTickets;

public class FilterTest {

    @Test
    /*
    * 过滤器测试函数
    * 场景为出票时过滤各种门票。
    * */
    public void TestFilter() throws InterruptedException {
        System.out.println("大家好，欢迎来到过滤器模式展示～");
        System.out.println("过滤器模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。");
        System.out.println("接下来我们通过票务筛选的业务来感受过滤器的使用");
        System.out.println("我们知道，很多时候需要对老人、小孩、学生票等特殊票种进行筛选，而手动判断票种是否满足某一规则会使得代码耦合度增加。因此引入一个过滤器的接口可以大大降低耦合性。");
        System.out.println("----------------------Filter Pattern Test Start--------------------");
        Thread.sleep(2000);
        List<Ticket> tickets = new ArrayList<Ticket>();
        System.out.println("汤姆刚刚购买了票价为380的成人票。");
        tickets.add(new Ticket("Tom", 380, new Date(), "adult"));
        Thread.sleep(500);
        tickets.add(new Ticket("Jerry", 180, new Date(), "Kid"));
        System.out.println("杰瑞刚刚购买了票价为180的儿童票。");
        Thread.sleep(500);
        tickets.add(new Ticket("Yili", 180, new Date(), "Student"));
        System.out.println("益立刚刚购买了票价为180的学生票。");
        Thread.sleep(500);
        tickets.add(new Ticket("Tiger", 380, new Date(), "adult"));
        System.out.println("泰格刚刚购买了票价为380的成人票。");
        Thread.sleep(500);
        tickets.add(new Ticket("Bert", 0, new Date(), "Old"));
        System.out.println("波特刚刚购买了票价为0的老人票。");
        Thread.sleep(500);

        System.out.println("现在我们开始对票务进行过滤:");
        Thread.sleep(500);

        Criteria old = new CriteriaOlder();
        Criteria student = new CriteriaStudent();
        Criteria kid = new CriteriaKid();
        Criteria adult = new CriteriaAdult();
        Criteria or = new OrCriteria(old, student);
        System.out.println("使用老人过滤器过滤老人票务信息:");
        Thread.sleep(2000);
        printTickets(old.meetCriteria(tickets));

        System.out.println("使用学生过滤器过滤学生票务信息:");
        Thread.sleep(2000);
        printTickets(student.meetCriteria(tickets));

        System.out.println("使用儿童过滤器过滤儿童票务信息:");
        Thread.sleep(2000);
        printTickets(kid.meetCriteria(tickets));

        System.out.println("使用成人过滤器过滤成人票务信息:");
        Thread.sleep(2000);
        printTickets(adult.meetCriteria(tickets));

        System.out.println("使用或过滤器过滤老人或者学生票务信息:");
        Thread.sleep(2000);
        printTickets(or.meetCriteria(tickets));
        System.out.println("----------------------Filter Pattern Test End--------------------");

    }
}
