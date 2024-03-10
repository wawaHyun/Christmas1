package date;

import java.util.HashMap;
import java.util.Map;

public class DateServiceImpl implements DateService {
    public static DateServiceImpl instance =  new DateServiceImpl();

    Map<String,?> menuMap;
    public DateServiceImpl() {
        this.menuMap = new HashMap<>();
    }

    public static DateServiceImpl getInstance() {
        return instance;
    }

    public enum DateEnum {
        ;

        private final int value;

        DateEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static void main(String[] args) {
            for (int i = 1; i <= 31; i++) {
                System.out.println("ENUM_" + i + "(" + i + "),");
            }
        }
    }


    @Override
    public String dateSelect(int date) {
        String result = "날짜를 입력받았다! "+date;


        return result;
    }

    @Override
    public String selectMenu(String menu) {
        String result = "메뉴를 입력받았다! "+menu;

//        switch (menu){
//            case "" : menuMap.put(menu,)
//        }
        return result;
    }

    @Override
    public String menuBill() {
        String result = menuMap.toString();


        return result+"당신의 메뉴!";
    }

    @Override
    public String menuBill2() {
        String result = "할인전 총 주문 금액";
        return result;
    }

    @Override
    public String Benefit() {
        String result = "증정메뉴는 샴페인";

        return result;
    }

    @Override
    public String BeneTotal() {
        String result = "당신의 혜택받은 내역!";
        return result;
    }

    @Override
    public String BeneTotal2() {
        String result = "총 혜택 금액";
        return result;
    }

    @Override
    public String totalbill() {
        String result = "최종 결제액";
        return result;
    }

    @Override
    public String event() {
        String result = "산타배지!!";
        return result;
    }
}
