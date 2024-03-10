package date;

import java.util.Scanner;

public class DateController {
    DateServiceImpl dateS;

    public DateController() {
        this.dateS =  DateServiceImpl.getInstance();
    }

    public String DateSelect(Scanner sc) {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        int date = sc.nextInt();
        if (date > 31){
            System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            InputView1.main(sc);
        }
        if (date <0){
            System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            InputView1.main(sc);
        }
        return dateS.dateSelect(date);
    }


    public String selectMenu(Scanner sc) {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. " +
                "(e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        return dateS.selectMenu(sc.next());
    }

    public String menuBill() {
        System.out.println("<주문 메뉴>");
        return dateS.menuBill();
    }

    public String menuBill2() {
        System.out.println("<할인 전 총주문 금액>");
        return dateS.menuBill2();
    }

    public String Benefit() {
        System.out.println("<증정 메뉴>");
        return dateS.Benefit();
    }

    public String BeneTotal() {
        System.out.println("<혜택 내역>");
        return dateS.BeneTotal();
    }

    public String BeneTotal2() {
        System.out.println("<총혜택 금액>");
        return dateS.BeneTotal2();
    }

    public String totalbill() {
        System.out.println("<할인 후 예상 결제 금액>");
        return dateS.totalbill();
    }

    public String event() {
        System.out.println("<12월 이벤트 배지>");
        return dateS.event();
    }
}
