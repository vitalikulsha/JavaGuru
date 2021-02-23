package java.lecture01_Object;

/*
7 Объект - куртка
Состояние: застегнуть/расстегнуть;
Поведение: в состоянии застегнуть человеку становиться теплее, в состоянии расстегнуть - холоднее;
 */
public class Task07_Jacket {
    private boolean isButtoned;

    public Task07_Jacket(boolean isButtoned) {
        this.isButtoned = isButtoned;
    }

    public void buttonUp() {
        if (this.isButtoned) {
            System.out.println("Тепло.");
        } else {
            System.out.println("Холодно.");
        }
    }

    public boolean isButtoned() {
        return isButtoned;
    }

    public void setButtoned(boolean buttoned) {
        isButtoned = buttoned;
    }

    @Override
    public String toString() {
        return "Куртка " + (isButtoned ? "застегнута." : "растегнута.");
    }
}
