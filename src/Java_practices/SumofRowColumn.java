package Java_practices;

public class SumofRowColumn {
	public static void main(String[] args){
		int rows,cols,sunRow,sumcol;
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},};
		rows = a.length;
		cols = a[0].length;
		for (int i=0; i<rows; i++) {
			sunRow = 0;
			for(int j=0; j<cols; j++) {
				sunRow = sunRow +a[i][j];
			}
			System.out.println("sum of"+(i+1)+"row:"+sunRow);
		}
		for(int i = 0; i < cols; i++) {
			sumcol = 0;
			for(int j=0; j<rows; j++) {
				sumcol = sumcol+a[j][i];
			}
			System.out.println("sumof"+(i+1)+"column:"+sumcol);
			
			}
		}
	}

