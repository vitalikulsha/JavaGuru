package java.lecture01_Object;

/*
10 Объект - мыло
Состояние вес
Применение: вес уменьшается при каждом использовании.
 */
public class Task10_Soap {
    private int weight;

    public Task10_Soap(int weight) {
        this.weight = weight;
    }

    public void lather() {
        if (weight > 0) {
            System.out.println("Использовать мыло. Вес мыла уменьшился.");
            weight -= 10;//усеньшение веса мыла за одно испольщование
        } else {
            System.out.println("Мыло смылилось.");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Мыло весом " + weight;
    }
}
