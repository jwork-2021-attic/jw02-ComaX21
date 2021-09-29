package homework.task3;

public class Matrix {
    public int row;
    public int col;
    public Position[][] positions;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.positions = new Position[row][col];
    }

    public void put(Monster monster, int i, int j) {
        if (this.positions[i][j] == null) {
            this.positions[i][j] = new Position(null);
        }
        this.positions[i][j].setMonster(monster);
    }


    
    @Override
    public String toString() {
        String matrixString = "";
        for(int i = 0; i < this.row; ++i)
        {
            String lineString = "\t";
            for (Position p : positions[i]) {
                lineString += p.monster.toString();
            }
            matrixString += lineString;
            matrixString += "\n";
        }
        return matrixString;
    }
}
