package homework.task2;

public class Line {
    
    public Position[] positions;

    public Line(int length) {
        this.positions = new Position[length];
    }

    public void put(Monster monster, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setMonster(monster);
    }


    
    @Override
    public String toString() {
        String lineString = "\t";
        for (Position p : positions) {
            lineString += p.monster.toString();
        }
        return lineString;
    }
}
