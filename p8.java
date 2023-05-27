/* 10
   I  H
   7  6  5
   D  C  B  A
*/


class P8{
	public static void main(String[] args){
		int n=10;
		char ch='J';
		int row=4;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
				System.out.print(ch+"\t");
				ch--;
				n--;
				}else{
					System.out.print(n+"\t");
					n--;
					ch--;
				}
			
			}
			System.out.println();
		}
	}
}
