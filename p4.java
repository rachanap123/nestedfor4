/* 1 2 3 4
   2 3 4
   3 4
   4
*/



class P4{
	public static void main(String[] args){
		int n=1;
		int row=4;
		for(int i=1;i<=row;i++){
			for(int j=4;j>=i;j--){
				System.out.print(n+" ");
				n++;
			}
			n=i+1;
			System.out.println();
		}
	}
}
