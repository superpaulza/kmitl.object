import java.util.*;
class  Example42p24
{
	public static void main(String[] args) 
	{
		//lottery.length = 24 (24 rows)
		//lottery[n].length = element of row n 
		int[][] lottery = {{0,0,0,0,0,0,0},{44,25,88,12,47,30,40},{44,25,88,12,47,30,40}};
		System.out.println(findMode(lottery));
	}

	public static void getData(int[][] lottery)
	{
		//System.out.print();
	}

	public static int findMode(int[][] lottery)
	{
		int maxCount = 0;
		int count = 0;
		int mode = 0;
		for (int i = 1 ; i < lottery.length ;i++) //row
		{
			count = 0;
			for (int j = 0 ; j < lottery[i].length ;j++) //col
			{
				for (int k = 0 ; k < lottery[i].length ;k++ ) //cur.col
				{
					//for check
					//System.out.println("i: " + i + " " + "j: " + j + " " + "k: " + k + " " + "l1: " + lottery[i][j] + " " + "l2: " + lottery[i][k]);
					if (lottery[i][j] == lottery[i][k]) count++;
						else {
							if (count > maxCount) {
							mode = lottery[i][j];
							maxCount = count;
							}
						}
				}
			}
		}
		if (maxCount == 1) return 0;
		return mode;
	}
	

	public static void noDouble(int[][] lottery)
	{
		//System.out.print();
	}
}
