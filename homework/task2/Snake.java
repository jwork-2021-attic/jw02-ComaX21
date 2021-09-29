package homework.task2;

public class Snake {

    Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line) {

        String log = new String();

        int[] ranks = new int[line.positions.length];

        for (int i = 0; i < line.positions.length; i++) {
            ranks[i] = line.positions[i].monster.getKey();
        }
        
        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            String[] couple = step.split("<->");
            
            line.positions[Integer.parseInt(couple[0])].monster.swapPosition(line.positions[Integer.parseInt(couple[1])].monster);
            System.out.println(line.toString());
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

}
