package Mediator;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 11:32 PM
 * @Version 1.0
 */

//import Visitor.FacilityAdministrator;

import Visitor.Facility;

import java.util.Date;
import java.util.HashMap;

public class Monitor {
    public static HashMap<String, Integer> memo = new HashMap<>();

    public static void showQueueProcess(Admin admin, String facility) {
        System.out.println(new Date().toString() + " [" +
                admin.getName() + "] : " + facility + " 多了一位排队客户.");
        if (memo.containsKey(facility)) {
            memo.put(facility, memo.get(facility) + 1);
        }
        else {
            memo.put(facility, 1);
        }
        System.out.println(memo.get(facility));
    }
}
