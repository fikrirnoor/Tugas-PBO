package Bagian2;

public class FightingGame {
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

    public FightingGame(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getName() {
        return name;
    }

    public int getLifePoint() {
        return lifePoint;
    }
    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public void kick(FightingGame Character) {
        Character.setLifePoint(Character.getLifePoint()-this.attackKickPoint);
    }

    public void hit(FightingGame Character) {
        Character.setLifePoint(Character.getLifePoint()-this.attackHitPoint);
    }
    public void compare(FightingGame Character) {
        int result = Integer.compare(this.lifePoint, Character.getLifePoint());
        if (result > 0) {
            System.out.println(this.name + " Pemenangnya ");
        }else if (result < 0) {
            System.out.println(Character.getName() + " Pemenangnya ");
        }else{
            System.out.println(" Seimbang ");
        }
    }
}
