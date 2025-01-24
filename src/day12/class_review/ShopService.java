package day12.class_review;

public class ShopService {

    private static ShopService shopService = new ShopService();

    private ShopService() {

    }

    public static ShopService getInstance() {
        return shopService;
    }

    public static void main(String[] args) {
        ShopService ob1 = ShopService.getInstance();
        ShopService ob2 = ShopService.getInstance();

        if (ob1 == ob2) {
            System.out.println("같은 ShopService 객체 입니다.");
        } else {
            System.out.println("다른 ShopService 객체 입니다.");
        }
    }
}
