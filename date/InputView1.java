package date;

import date.DateController;

import java.util.Scanner;

public class InputView1 {
    public static void main(Scanner sc) {

        DateController ctrl = new DateController();
        System.out.println(ctrl.DateSelect(sc));
        System.out.println(ctrl.selectMenu(sc));
        OutView.main();

    }

}
