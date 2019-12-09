package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem1260 {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while(k-- > 0) {
        	grid = shiftArray(grid);
        }
        // convert array to list
        return convertArrayToList(grid);
    }

	private int[][] shiftArray(int[][] grid) {
		int row = grid.length, column;
		int[][] temp = new int[row][grid[0].length];
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				column = grid[i].length;
				if(i == row - 1 && j == column - 1) {
					temp[0][0] = grid[i][j]; // done
				}else if(j < column - 1) {
					temp[i][j + 1] = grid[i][j];
				}else if(i < row - 1 && j == column - 1) {
					temp[i + 1][0] = grid[i][j];
				}
			}
		}
		return temp;
	}
	
	private List<List<Integer>> convertArrayToList(int[][] grid){
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < grid.length; ++i) {
		    int jLength = grid[0].length;
		    list.add(new ArrayList<>(jLength));
		    for (int j = 0; j < jLength; ++j) {
		      list.get(i).add(grid[i][j]);
		    }
		}
		return list;
	}
}
