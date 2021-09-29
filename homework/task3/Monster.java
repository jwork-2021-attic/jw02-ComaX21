package homework.task3;

public class Monster {
    
    private Position position;
    private int r;
    private int g;
    private int b;


    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setMonster(another);
        p.setMonster(this);
    }


    public void setColor(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getKey()
    {
        return this.g;
    }


    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.g + "  \033[0m";
    }

    
}
