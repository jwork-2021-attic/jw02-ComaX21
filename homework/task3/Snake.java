package homework.task3;

public class Snake {

    Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Matrix matrix) {

        String log = new String();
        int[][] mat = new int[matrix.row][matrix.col];

        for (int i = 0; i < matrix.row; ++i) {
            for(int j = 0; j < matrix.col; ++j){
                mat[i][j] = matrix.positions[i][j].monster.getKey();
                
            }
        }
        
        for(int i = 0; i < matrix.row; ++i){
            sorter.load(mat[i]);
            sorter.sort();
            String[] sortSteps = this.parsePlan(sorter.getPlan());
            
            for (String step : sortSteps) {
                String[] couple = step.split("<->");
                matrix.positions[i][Integer.parseInt(couple[0])].monster.swapPosition(matrix.positions[i][Integer.parseInt(couple[1])].monster);
                System.out.println(matrix.toString());
                log += matrix.toString();
                log += "\n[frame]\n";
            }
            sorter.cleanPlan();
        }
        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

}
