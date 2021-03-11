using System;
using System.Collections.Generic;


namespace LearningApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            // printing hello world
            // use ReadLine() to keep the window open
            string words = "I am Ritwik, I guess.";
            char grade = 'a';
            int year = 97;
            double cgpa = 8.97;

            Console.WriteLine("Hello"+words);
            Console.WriteLine("My grade is " + grade);
            Console.WriteLine("My year is " + year);
            Console.WriteLine("And the cgpa is" + cgpa);
            Console.ReadLine();
        }
    }
}
