package com.inspire.DijKartasAlgo;

public class ShortestDistance {
    static int[][] shortestDistance=new int[6][6];
    static int INFINITE_DISTANCE=Integer.MAX_VALUE;


    public static void main (String[] args){
        //distance from A
        //A-0, B-1, C-2, D-3, E-4,F-5
        shortestDistance[0][0]=0;
        shortestDistance[0][1]=2;
        shortestDistance[0][2]=4;
        shortestDistance[0][3]=INFINITE_DISTANCE;
        shortestDistance[0][4]=INFINITE_DISTANCE;
        shortestDistance[0][5]=INFINITE_DISTANCE;
        //B
        shortestDistance[1][0]=2;
        shortestDistance[1][1]=0;
        shortestDistance[1][2]=6;
        shortestDistance[1][3]=3;
        shortestDistance[1][4]=7;
        shortestDistance[1][5]=INFINITE_DISTANCE;
        //C
        shortestDistance[2][0]=4;
        shortestDistance[2][1]=6;
        shortestDistance[2][2]=0;
        shortestDistance[2][3]=INFINITE_DISTANCE;
        shortestDistance[2][4]=9;
        shortestDistance[2][5]=INFINITE_DISTANCE;
        //D
        shortestDistance[3][0]=INFINITE_DISTANCE;
        shortestDistance[3][1]=3;
        shortestDistance[3][2]=INFINITE_DISTANCE;
        shortestDistance[3][3]=0;
        shortestDistance[3][4]=9;
        shortestDistance[3][5]=2;
        //E
        shortestDistance[4][0]=INFINITE_DISTANCE;
        shortestDistance[4][1]=7;
        shortestDistance[4][2]=9;
        shortestDistance[4][3]=4;
        shortestDistance[4][4]=0;
        shortestDistance[4][5]=8;
        //F
        shortestDistance[5][0]=INFINITE_DISTANCE;
        shortestDistance[5][1]=INFINITE_DISTANCE;
        shortestDistance[5][2]=INFINITE_DISTANCE;
        shortestDistance[5][3]=2;
        shortestDistance[5][4]=8;
        shortestDistance[5][5]=0;
        findshortest(shortestDistance);
        



    }

    public static void findshortest(int[][] metrix){
        boolean[] verticesTraversed={true,false,false,false,false,false};
        int[] min_distance={metrix[0][0],metrix[0][1],metrix[0][2],metrix[0][3],metrix[0][4],metrix[0][5]};
        for (int i=1;i<metrix.length;i++){
            for(int j=0;j<metrix[i].length;j++){
                if(metrix[i][j]<=min_distance[i] && metrix[i][j]!=INFINITE_DISTANCE){
                    min_distance[j]=metrix[i][j];
                }else {
                    if(min_distance[j]!=INFINITE_DISTANCE && metrix[i][j]!=INFINITE_DISTANCE){
                        min_distance[j]=min_distance[i]+metrix[i][j];
                    }
                }

            }
            verticesTraversed[i]=true;
        }
        for (int i=0;i<min_distance.length;i++){
            System.out.println(min_distance[i]);
        }
    }

    int findmindistancevertices(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
