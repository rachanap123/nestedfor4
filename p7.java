/* F
   E  1
   D  2  E
   C  3  D  4
   B  5  C  6  D
   A  7  B  8  C  9
*/


class P7{
	public static void main(String[] args){
		char ch='F';
		int n=1;
		int row=6;
		for(int i=1;i<=row;i++){
			char temp=ch;
			for(int j=1;j<=i;j++){
				if(j%2==0){
				System.out.print(n+" ");
				n++;
				}else{
					System.out.print(temp+" ");
					temp++;
				}
			
			
			}
			ch--;
			System.out.println();
		}
	}
}
