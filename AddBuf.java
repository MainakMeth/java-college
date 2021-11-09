public class AddBuf
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Enter first number");
	int x = Integer.parseInt(in.readLine());
               System.out.println("Enter second number");
	int y = Integer.parseInt(in.readLine());
	int z=x+y;
               System.out.println("Addition of two numbers is : "+z);
     }
}