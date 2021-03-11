using System;

public class Program
{
	public static void Main()
	{
		string phrase = "Hey vs";

		Console.WriteLine("Length of the sentence is " + phrase.Length);
		Console.WriteLine(phrase.ToUpper());
		Console.WriteLine(phrase.Substring(0, 5));
	}
}