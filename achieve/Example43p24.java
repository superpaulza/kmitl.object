import java.util.*;
class Example43p24 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Total number of students: "); int n = sc.nextInt();
		int[][] score = new int[n+2][9];
		getData(score);
		sumData(score);
		printData(score);
	}

	public static void getData(int[][] score)
	{
		for (int i = 1; i < score.length-1 ; i++)
		{
			score[i][0] = i;
			System.out.println(" ======== Student [" + i + "] ======== ");
			for (int j = 1; j < score[i].length-1 ; j++)
			{
				if (j < 6) System.out.print("Quiz " + j + ": ");
				else if (j == 6) System.out.print("Midterm: ");
				else if (j == 7) System.out.print("Final: ");
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println(" ============================= ");
	}

	public static void printData(int[][] score)
	{
		System.out.println("No.\tQuiz1\tQuiz2\tQuiz3\tQuiz4\tQuiz5\tMidterm\tFinal\ttotal");
		for (int i = 1; i < score.length-1 ; i++)
		{
			for (int j = 0; j < score[i].length ; j++)
			{
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		Avg(score);
		System.out.println();
	}

	public static void sumData(int[][] score)
	{
		for (int i = 1; i < score.length-1 ; i++)
		{
			int max = score[i][1];
			for (int j = 1; j < 6 ; j++)
			{
				if (max < score[i][j]) max = score[i][j];
			}
			score[i][8] = max +  score[i][6] + score[i][7];
		}
	}

	public static void Avg(int[][] score)
	{
		double[] avg = new double[8];
		for (int i = 1; i < 9 ;i++ )
		{
			int sumcol = 0;
			for (int j = 1; j < score.length-1 ;j++ )
			{
				sumcol += score[j][i];
			}
			avg[i-1] = (double) sumcol/(score.length-2);
		}
		System.out.print("\naverage\t");
		for (int j = 0; j < avg.length ; j++)
		{
			System.out.print(avg[j]+"\t");
		}
	}
}
