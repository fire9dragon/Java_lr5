import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Train first = new Train();
        Train second = new Train(21, "second");
        Train third = new Train(69, "third", LocalDateTime.now());

        printTrain(first);
        printTrain(second);
        printTrain(third);
    }

    private static void printTrain(Train train) {
        System.out.printf("номер поезда - %d\t", train.getNumber());
        train.receiveTrain("рейс1");
    }
}