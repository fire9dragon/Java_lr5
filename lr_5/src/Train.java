import java.time.LocalDateTime;

public class Train {
    private int number;
    private String name;
    private LocalDateTime time;

    Train() {
        this.number = 0;
        this.name = "";
        this.time = LocalDateTime.of(1900, 1, 1, 0, 0);
    }

    Train(int number, String name) {
        this.number = number;
        this.name = name;
        this.time = LocalDateTime.of(1900, 1, 1, 0, 0);
    }

    Train(int number, String name, LocalDateTime time) {
        this(number, name);
        this.time = time;
    }

    public void receiveTrain(String name) {
        System.out.println("Поезд рейса " + name);
    }

    public int getNumber() {
        return number;
    }
}
