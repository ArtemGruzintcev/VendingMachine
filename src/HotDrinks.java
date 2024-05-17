import java.util.ArrayList;

public class HotDrinks extends ArrayList {
    private int temperature;

    public HotDrinks(String name, int value1, int value2, int value3, int temperature) {
        super();
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
