package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class SnackFactory implements DishFactory {

    //小吃工厂生产对应小吃的函数
    @Override
    public SnackDish produceDish(String snackName, Integer price) {
        System.out.println("一份"+snackName+"已经制作完成");
        return new SnackDish(snackName, price);
    }
}
