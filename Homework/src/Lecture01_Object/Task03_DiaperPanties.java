package Lecture01_Object;

/*
3 Объект - подгузники-трусики
Состояние: мокрый/сухой ;
Поведение: удерживает влагу, при попадании влаги срабатывает индикатор синего цвета ;
 */
public class Task03_DiaperPanties {
    private boolean isDry;

    public Task03_DiaperPanties(boolean isDry) {
        this.isDry = isDry;
    }

    //удерживает влагу, при попадании влаги срабатывает индикатор синего цвета
    //принимает - количество влаги
    public String retainMoisture(int moisture) {
        if (moisture <= 0) {
            if (isDry) {
                System.out.println("Подгузник-трусики сухие.");
                return null;
            } else {
                System.out.println("Подгузник-трусики уже мокрые. Влаги не добавилось.");
                return "blue";
            }
        } else {
            this.isDry = false;
            System.out.println("Подгузник-трусики мокрые. Влага осталась внутри подгузника.");
            return "blue";
        }
    }

    public boolean isDry() {
        return isDry;
    }

    public void setDry(boolean dry) {
        isDry = dry;
    }

    @Override
    public String toString() {
        return isDry ? "Подгузник-трусики сухие." : "Подгузник-трусики мокрые.";
    }
}
