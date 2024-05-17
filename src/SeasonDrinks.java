public class DrinkVendingMachine {
    private String name;
    private int value1;
    private int value2;
    private int value3;

    public DrinkVendingMachine(String name, int value1, int value2, int value3) {
        this.name = name;
        this.value1 = value1;
        this.value2 =value2;
        this.value3 = value3;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getValue1() {
        return value1;
    }
    public void setValue1(int value1) {
        this.value1 = value1;
    }
    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

//    @Override
//    public String toString() {
//        return "Вы выбрали:  " +
//                name + "\n" +
//                "Объём (мл) " +  + "\n";
//    }


}
