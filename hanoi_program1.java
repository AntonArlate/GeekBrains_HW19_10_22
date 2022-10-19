// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class hanoi_program1 {
    public static void main(String[] args) {
        int disk = 3;
        int from_pin = 1;
        int to_pin = 2;
        int buf_pin = 6 - from_pin - to_pin;

        hanoi(disk, from_pin, to_pin, buf_pin);

    }
    static void hanoi (int disk,int from_pin, int to_pin, int buf_pin) { 

        if ( disk > 0) {
            hanoi(disk-1, from_pin, buf_pin, to_pin); // спросить о именнованных параметрах java
            System.out.printf("Диск %d из пин %d на пин %d\n", disk, from_pin, to_pin);
            hanoi(disk-1, buf_pin, to_pin, from_pin);
        }
    }
}
