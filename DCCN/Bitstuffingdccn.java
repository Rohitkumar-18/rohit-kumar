import java.util.Scanner;
public class Stuffingdccn
{
	public static string bitStuffing(String data)
{
		StringBuilder StuffedData=new StringBuilder();
		int count=0
      for(int i=0;i<data.length();i++);
	{
		char bit=data.charAt(i);
		stuffedDAta.append(bit);
		if(bit=='1')
		{
			count ++;
			if(count==5)
			{
				stuffedData.append('0');
				count=0;
			}
		}
		else
		{
			count=0;
		}
	}
	return stuffedData.string();
}
public static String charStuffing(String.data,charflag,char,escape)
	{
	StringBuilder stuffedData=new stringBuilder();
	stuffedData.append(flag);
	for(int i-0;i<data.length();i++)
		{
		char ch=data.charAt(i);
		if(ch==flag||ch==escape)
			{
			stuffedData.append(escape);
			}
			stuffedData.append(ch);
		}
		stuffedData.append(flag);
		return stuffeData.toString();
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter binary data for Bit stuffing");
		String binaryData=scanner.nextLine();
		string bitstuffedData=bit stuffing(binary data);
		System.out.println("Bit stuffed Data:"+bitstuffedData);
		System.out.println
