package java.lecture01_Object;

/*
1 Объект - зубная щётка
Состояние: количество ворсинок; жёсткость ворсинок;
Поведение: чистить(при использовании этого действия уменьшается жёсткость ворсинок и их количество)
 */
public class Task01_Toothbrush {
    private int numberFibers;
    private int villusStiffness;

    public Task01_Toothbrush(int numberFibers, int villusStiffness) {
        this.numberFibers = numberFibers;//количество ворсинок
        this.villusStiffness = villusStiffness;//показатель жесткости
    }

    //если показатель жесткости меньше 30 и количество волокон меньше 50 - щеткой нельзя пользоваться
    public void brushTeeth() {
        if (villusStiffness > 30 && numberFibers > 50) {
            System.out.println("Чистить зубы.");
            this.numberFibers -= 2; //уменьшение количество ворсинок на 2 при каждом вызове метода
            this.villusStiffness -= 1;//уменьшение показателя жесткости на 1 при каждом вызове метода
        } else {
            System.out.println("Зубная щетка непригодна для использования. " +
                    "Используйте другую зубную щетку.");
        }
    }

    public int getNumberFibers() {
        return numberFibers;
    }

    public void setNumberFibers(int numberFibers) {
        this.numberFibers = numberFibers;
    }

    public int getVillusStiffness() {
        return villusStiffness;
    }

    public void setVillusStiffness(int villusStiffness) {
        this.villusStiffness = villusStiffness;
    }

    @Override
    public String toString() {
        return "Зубная щетка: " +
                "количество ворсинок - " + numberFibers +
                ", жесткость - " + villusStiffness;
    }
}
