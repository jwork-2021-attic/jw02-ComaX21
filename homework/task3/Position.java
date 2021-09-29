package homework.task3;

public class Position {
    public Monster monster;

    Position(Monster monster) {
        this.monster = monster;
    }
    public void setMonster(Monster monster) {
        this.monster = monster;
        monster.setPosition(this);
    }
}

