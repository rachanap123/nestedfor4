/* A B C D
   B C D
   C D
   D
*/


class P5{
	public static void main(String[] args){
		char ch='A';
		int row=4;
		for(int i=1;i<=row;i++){
			char ch1=ch;
			for(int j=row;j>=i;j--){
				System.out.print(ch1+" ");
				ch1++;
			}
			ch++;
			
			System.out.println();
		}
	}
}
