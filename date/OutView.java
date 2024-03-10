package date;

import date.DateController;

public class OutView {
    public static void main() {

        DateController ctrl = new DateController();
        System.out.println(ctrl.menuBill());
        System.out.println(ctrl.menuBill2());
        System.out.println(ctrl.Benefit());
        System.out.println(ctrl.BeneTotal());
        System.out.println(ctrl.BeneTotal2());
        System.out.println(ctrl.totalbill());
        System.out.println(ctrl.event());

    }
}
