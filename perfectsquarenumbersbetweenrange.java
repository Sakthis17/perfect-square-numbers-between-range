public class perfectsquarenumbersbetweenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter initial number");
		int a=sc.nextInt();
		System.out.println("Enter the last number");
		int b=sc.nextInt();
		
		for(int i=a;i<b;i++)
		{
		
			if(Math.sqrt(i)==(int)Math.sqrt(i))
			{   
				
				System.out.print(i+" ");
				
			}
		}
		

	}

}  

INPUT:
9
30

OUTPUT:
9 16 25