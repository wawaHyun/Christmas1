package date;

public enum DateEnum {
양송이수프("양송이수프",6000),
    타파스("타파스",5500),
    시저샐러드("시저샐러드",8000),
    ;
    private final String name;
    private final Integer pay;

    Appetizer(String name, Integer pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getAppName() {
        return name;
    }

    public Integer getAppPay() {
        return pay;
    }
public static String[] getAppNames(){
        return Arrays.stream(Appetizer.values())
                .map(Appetizer::getAppName)
                .toArray(String[]::new);
}
public static Integer[]getAppPays(){
        return Arrays.stream(Appetizer.values())
                .map(i->i.getAppPay())
                .toArray(Integer[]::new);
}
}
