class Solution {
    public int orangesRotting(int[][] grid) {
       
        int freshOrange=0;
        Queue<int[]> que= new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2){
                    que.add(new int[]{i,j});
                   
                }
                if(grid[i][j]==1){
                    freshOrange++;
                }
            }
        }
        int direction [][] = {{1,0},{0,1},{-1,0},{0,-1}};
        int time =0;
        while(!que.isEmpty() && freshOrange>0){
            time++;
            int size= que.size();
            while(size--> 0){
            int xy [] = que.poll();
                for(int [] d :direction ){
                    int x = xy[0]+d[0];
                    int y = xy[1]+d[1];
                    if(x<0 ||y<0 || x>=grid.length || y>=grid[0].length ||                           grid[x][y]==2 ||grid[x][y] == 0){
                        continue;
                    }
                    que.add(new int[]{x,y});
                    grid[x][y]=2;
                    freshOrange--;
                }
            }
        }
        
        return freshOrange ==0 ? time : -1;
       
    
    }
}
