package homework.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Scene {
   
    //生成一个有256个位置的队列
    //针对队列中的每个位置进行256次循环，每次循环生成一个妖怪，每个妖怪随机生成key值（可能重复），为每个妖怪设置颜色（r, g, b）
    //完成队列的初始化之后，对队列进行排队
    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix(8, 8);
        Random color = new Random();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; ++j){
                Monster monster = new Monster();
                monster.setColor(color.nextInt(256), color.nextInt(256), color.nextInt(256));
                matrix.put(monster, i, j);
            }
        }

        Snake snake = new Snake();

        //Sorter sorter = new BubbleSorter();
        Sorter sorter = new QuickSorter();

        snake.setSorter(sorter);

        String log = snake.lineUp(matrix);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();


    }



}
