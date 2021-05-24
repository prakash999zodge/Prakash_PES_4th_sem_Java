//Program to demonstrate whether the input is Vowel or Consonant
import java.util.*;
class isVowelOrisConsonant
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);
		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		{
			System.out.println(ch+" is Vowel & the complete list Vowels are 'a,e,i,o,u'");
		}
		else
		{
			System.out.println(ch+" is Consonant, which is other than Vowels");
		}
	}
}
//Conclusion there is not need to convert character to string
// we just have to put single quote instead of "
// double quote i.e. "" for checking String data
// single quote i.e. '' for checking single character
