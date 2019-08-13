/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetic.tsp;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vp009
 */
public class Genes {
    private Integer[] myGenes;
    private int[] myGenes2;
    Random rnd = new Random();
    private int fitness = 0;
    private double[][] map = new double[10][10];
        
    public void Genes (int size){
        myGenes = new Integer[size];  
        myGenes2 = new int[size]; 
        
        for(int i = 0; i < 10; i++){
            myGenes[i] = i + 1;
            myGenes2[i] = i + 1;
        }
        List<Integer>lList1 = Arrays.asList(myGenes);
        Collections.shuffle(lList1);
    }
    public Genes crossover(Genes cross1){
        int random1 = rnd.nextInt(9)-1;
        return cross1;
    }
    public int calculateFitness(int xloc, int yloc){
        
        return fitness;
    }
    
 
}
