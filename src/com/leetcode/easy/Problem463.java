package com.leetcode.easy;
public class Problem463 {
	public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
        	for(int j = 0; j < grid[i].length; j++) {
        		if(grid[i][j] == 1) {
        			int per = 4;
        			//check the upper element
        			if(i > 0 && grid[i - 1][j] == 1) per--;
        			//check the lower element
        			if(i < grid.length - 1 && grid[i + 1][j] == 1) per--;
        			//check the left element
        			if(j > 0 && grid[i][j - 1] == 1) per--;
        			//check the right element
        			if(j < grid[i].length - 1 && grid[i][j + 1] == 1) per--;
        			//increment count by per
        			count += per;
        		}
        	}
        }
        return count;
    }
}
