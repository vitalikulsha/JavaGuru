package java.lecture01_Object;

/*
9 Объект - дезедорант
Состояние: объём
Применение: при распылении объём аэрозоли уменьшается.
 */
public class Task09_Deodorant {
    private int volume;

    public Task09_Deodorant(int volume) {
        this.volume = volume;
    }

    public void sprayAerosol() {
        if (this.volume > 0) {
            System.out.println("Распылить аэрозоль. Объем дезодоранта уменьшился.");
            this.volume -= 50;//уменьшение объема дезодоранта на один "пшик"
        } else {
            System.out.println("Дезодорант пустой.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Дезодорант с объемом аэрозоля " + volume;
    }
}
