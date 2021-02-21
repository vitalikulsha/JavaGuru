package Lecture01_Object;

/*
8 Объект - машина
Состояние: завести/заглушить ехать назад/вперед
Поведение: в заведённом состоянии может ехать назад или вперёд.
 */
public class Task08_Car {
    private boolean isWork;
    private boolean isForward;

    public Task08_Car(boolean isWork, boolean isForward) {
        this.isWork = isWork;
        this.isForward = isForward;
    }

    public void drive() {
        if (isWork) {
            System.out.print("Машина заведена. ");
            if (isForward) {
                System.out.println("Едет вперед.");
            } else {
                System.out.println("Едет назад.");
            }
        } else {
            System.out.println("Машина заглушена.");
        }
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }

    @Override
    public String toString() {
        return "Машина " + (isWork ? "заведена" : "заглушена") +
                (isForward ? ", включена передача вперед." : ", включена передача назад.");
    }
}
