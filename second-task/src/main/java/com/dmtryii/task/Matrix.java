package com.dmtryii.task;

import java.util.Arrays;

import static java.lang.Math.min;

public class Matrix {
    private final int INFINITY = 10001;
    // Adjacency matrix
    private final int[][] cost;

    /**
     * Constructor
     *
     * @param vertices      is the number of vertices in the graph
     */
    public Matrix(int vertices){
        cost = new int[vertices][vertices];
    }

    /**
     * Set the weight between the neighbors
     *
     * @param i      point and point j that create an edge
     * @param j      point and point i that create an edge
     * @param weight of the edges - non-negative number
     */
    public void setEdge(int i, int j, int weight){
        cost[i][j] = weight;
    }

    /**
     * Freight cost
     *
     * @param i      point and point j that create an edge
     * @param j      point and point i that create an edge
     * @return       0 if i and j are the same, infinity, if there is no connection between the edges of the edges
     */
    private int getCost(int i, int j){
        if(i == j){
            return 0;
        }
        if(cost[i][j] == 0){
            return INFINITY;
        }
        return cost[i][j];
    }

    /**
     * Select the closest untagged vertex
     *
     * @param result      assign 1st top label equal to "origin" since that vertex
     * @param visited     an array of visited cities
     * @return            the index of the smallest element of distances, ignoring those in visited
     */
    private int getUntaggedVertex(Integer[] result, boolean[] visited){
        int best = -1;
        for(int i = 0; i < cost.length; i++){ // Sort out the vertices
            if(!visited[i] && ((best < 0) || (result[i] < result[best]))){ // Select the closest untagged vertex
                best = i;
            }
        }
        return best;
    }

    /**
     * Returns The ways of minimum cost between pairs of cities
     *
     * @param startIndex      startIndex Initial vertex
     * @return                an array of distances between cities
     */
    public Integer[] minimumCostPathsBetweenCities(int startIndex){
        boolean[] visited = new boolean[cost.length]; // visit the cit
        Integer[] result = new Integer[cost.length];  // distance array
        Arrays.fill(result, INFINITY);                // set the distance to all vertices INFINITY
        result[startIndex] = startIndex;              // initial vertex

        for (int[] aCost: cost){
            int city = getUntaggedVertex(result, visited);
            visited[city] = true;
            for (int i = 0; i < cost.length; i++){
                result[i] = min(result[i], result[city] + getCost(city, i));
            }
        }
        return result;
    }
}
