package com.dmtryii.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int NUMBER_OF_CITIES = 10000;

    // The code refers to the implementation of reading input data from the document
    public static void main(String[] args) throws IOException {
        File path = new File("second-task/src/main/resources/data-for-the-second-task.txt");
        BufferedReader br = new BufferedReader(new FileReader(path.getAbsolutePath()));
        String line = br.readLine();
        int source = Integer.parseInt(line);

        for(int testIdx = 0; testIdx < source; testIdx++){
            String[] citiesIdx = new String[NUMBER_OF_CITIES];
            line = br.readLine();
            int countCities = Integer.parseInt(line);
            int matrixSize = countCities + 1;
            Matrix matrix = new Matrix(matrixSize);

            for(int cityIdx = 0; cityIdx < countCities; cityIdx++){
                line = br.readLine();
                String cityName = line;
                citiesIdx[cityIdx] = cityName;
                line = br.readLine();
                int p = Integer.parseInt(line);

                for(int neighborIdx = 0; neighborIdx < p; neighborIdx++){
                    line = br.readLine();
                    String[] brokenLine = line.split(" ");
                    int cityToConnect = Integer.parseInt(brokenLine[0]);
                    int weightOfConnection = Integer.parseInt(brokenLine[1]);
                    matrix.setEdge(cityIdx, cityToConnect, weightOfConnection);
                }
            }
            line = br.readLine();
            int routesToFind = Integer.parseInt(line);
            for(int routesIdx = 0; routesIdx < routesToFind; routesIdx++){
                line = br.readLine();
                String[] cityNames = line.split(" ");
                String start = cityNames[0];
                String  destination = cityNames[1];
                List<String> list = new ArrayList<>();

                for(String str: citiesIdx){
                    if(str != null) list.add(str);
                }

                citiesIdx = list.toArray(new String[0]);
                int startIdx = 0;
                int destinationIdx = 0;
                // find the index of the initial city
                for(int i = 0; i < citiesIdx.length; i++){
                    if(start.equals(citiesIdx[i])){
                        startIdx = i;
                        break;
                    }
                }
                // find the index of the end of the city
                for(int i = 0; i < citiesIdx.length; i++){
                    if(destination.equals(citiesIdx[i])){
                        destinationIdx = i;
                        break;
                    }
                }
                Integer[] distancesFromSource = matrix.minimumCostPathsBetweenCities(startIdx);
                int destinationDistance = distancesFromSource[destinationIdx];
                System.out.println(destinationDistance);
            }
        }
        br.close();
    }
}
