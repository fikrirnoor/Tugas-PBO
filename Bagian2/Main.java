package Bagian2;

public class Main {
    public static void main(String[] args) {
        FightingGame Character1 = new FightingGame("Raiden", 10, 20);
        FightingGame Character2 = new FightingGame("Sub-Zero", 5, 25);

        Character1.kick(Character2);
        Character2.kick(Character1);

        for (int i = 0; i < 3; i++) {
            Character2.hit(Character1);
        }
        for (int i = 0; i < 4; i++) {
            Character1.hit(Character2);
        }

        System.out.println(Character1.getLifePoint());
        System.out.println(Character2.getLifePoint());

        Character1.compare(Character2);
    }
}
