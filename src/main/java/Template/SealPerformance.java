package Template;

public class SealPerformance extends BasePerformance {
    //海豹们的表演
    public SealPerformance() {
        name = "海豹";
    }
    @Override
    public void perform() {
        System.out.println("海豹饲养员与海豹们表演了顶球！");
    }
}
