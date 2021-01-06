/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graph_drawing;

import java.util.Scanner;

/**
 *
 * @author Ahmed Hisham
 */
public class eadges extends graph {

    public int weight, eadges_num, firstnode, secondnode;
    
   
    public eadges(int node_num, int eadges_num) {
        super(node_num, eadges_num);
        this.eadges_num = eadges_num;
    }
    
    public void input(int eadges_num) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < eadges_num; i++) {
            System.out.println("enter the first node, second node and weight ");

            firstnode = input.nextInt();

            secondnode = input.nextInt();
            weight = input.nextInt();
            adj_graph[firstnode - 1][secondnode - 1] = weight;
        }
    }

    public void add_edge() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first node, second node and weight ");
        firstnode = input.nextInt();
        secondnode = input.nextInt();
        weight = input.nextInt();
        adj_graph[firstnode - 1][secondnode - 1] = weight;
    }
    
    public void Delete_Edge() 
    { 
        System.out.println("enter the first node, second node  ");
        Scanner input = new Scanner(System.in);
        firstnode=input.nextInt();
        secondnode = input.nextInt();
        firstnode--;
        secondnode--;
        adj_graph [firstnode][secondnode]=-1;
    }
    
    public void popnode() 
    { 
        Scanner input = new Scanner(System.in);
        int deletednode;
        deletednode=input.nextInt();
        deletednode--;        
        for(int i=0;i<nodenumber;i++)
        {
           adj_graph [i][deletednode]=-1;
           adj_graph [deletednode][i]=-1;
        }
        
    }
    
}
