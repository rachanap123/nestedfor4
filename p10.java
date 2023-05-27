/*1
  8  9
  9  64  25
  64 25  216  49
*/


class P10{
	public static void main(String[] args){
		int n=1;
		int row=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(n%2==0){
				System.out.print(n*n*n+"\t");
				n++;
				}else{
					System.out.print(n*n+"\t");
					n++;
				}
			}
			n=i+1;
			System.out.println();
		}
	}
}
