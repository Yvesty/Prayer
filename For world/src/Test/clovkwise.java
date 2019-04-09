package Test;

public class clovkwise {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		print(arr,4);
	}
	
	static void print(int[][] arr,int n) {
		//先输出最右一列
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i][n-1] + " ");
		}
		//输出最下面一行
		for(int i=n-2;i>=0;i--) {
			System.out.println(arr[n-1][i] + " ");
		}
		//输出最左一列
		for(int i=n-2;i>=0;i--) {
			System.out.println(arr[i][0] + " ");
		}
		//输出第一行
		for(int i=1;i<n-1;i++) {
			System.out.println(arr[0][i] + " ");
		}
		//关键,向左上平移剩余的元素,以[0][0]为起点
		for(int i=0;i<n-2;i++) {
			for(int j=0;j<n-2;j++) {
				arr[i][j]=arr[i+1][j+1];
			}
		}
		//递归调用
		if(n>1)
			print(arr,n-2);
	}
}
