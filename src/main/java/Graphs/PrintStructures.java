package Graphs;

import java.util.Arrays;

/**
 * Created by jan on 2017-08-20.
 */
public class PrintStructures {

    public static void printA (boolean[][] matrixA){
        for (int i=0; i< matrixA.length; i ++){

            System.out.println(Arrays.toString(matrixA[i]));
        }
    }
        public static void print(Edge[] e){
        for(Edge item: e){
            System.out.println(item);
        }
        }
}
