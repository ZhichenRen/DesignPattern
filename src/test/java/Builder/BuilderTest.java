package Builder;
import Factory.src.*;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void builderTest() {
        System.out.println("--------------------Builder Pattern Test Start--------------------");
        BaseRestaurantManager restaurantManager = new RestaurantManager();
        restaurantManager.addWaiter(new RestaurantWaiter());
//        System.out.println("一名顾客在餐厅购买了一份套餐，包括一份汉堡，一份薯条与一杯可乐。");
//        restaurant.prepareMeal("汉堡", "薯条", "可乐");
        MainFoodFactory mainFoodFactory=new MainFoodFactory();
        SnackFactory snackFactory=new SnackFactory();
        DrinkDishFactory drinkDishFactory=new DrinkDishFactory();
        //新建订单
        DishOrderService order=new DishOrderService();
        String mainFoodName=order.getMain();
        String snackName=order.getSnack();
        String drinkName=order.getDrink();
        //生产食品
        MainDish mainDish = mainFoodFactory.produceDish(mainFoodName, 60);
        SnackDish snackDish = snackFactory.produceDish(snackName, 40);
        DrinkDish drinkDish = drinkDishFactory.produceDish(drinkName, 20);
        restaurantManager.prepareMeal(mainDish, snackDish, drinkDish);
        System.out.println("顾客收到了餐品。");
        System.out.println("--------------------Builder Pattern Test End--------------------");
    }
}
