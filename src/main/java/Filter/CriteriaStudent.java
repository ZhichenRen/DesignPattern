package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:13 PM
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class CriteriaStudent implements Criteria{
    /**
     * @Desc: 学生票筛选器
     * @Param: Tickets列表
     * @Return: 符合学生标准的tickets列表
     */
    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> studentTickets = new ArrayList<Ticket>();
        for (Ticket ticket: tickets) {
            if (ticket.getType().equalsIgnoreCase("STUDENT")) {
                studentTickets.add(ticket);
            }
        }
        return studentTickets;
    }
}
