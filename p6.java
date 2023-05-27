/* 1
   2  3
   3  4  5
   4  5  6  7
*/


class P6{
	public static void main(String[] args){
		int n=1;
		int row=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n+" ");
				n++;
			}
			n=i+1;
			System.out.println();
		}
	}
}
