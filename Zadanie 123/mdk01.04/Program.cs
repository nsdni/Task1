using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;

class Person
{
    string fullName;
    int age;

    public void move()
    {
        Console.WriteLine("Такой-то Person двигается");
    }

    public void talk()
    {
        Console.WriteLine("Такой-то Person говорит");
    }
    public Person()
    {
        fullName = "any";
        age = 0;
    }
    public Person(int i, string n)
    {
        fullName = n;
        age = i;
    }

    static void Main(string[] args)
    {
        Person obj = new Person();
        obj.talk();

        obj = new Person();
        obj.move();
    }
}



public class Sesons
{
    private String[] seasons = new String[] { "Зима", "Весна", "Лето", "Осень" };
    public String favoriteSeason = "переходный сезон, когда заметно уменьшение светового дня, и постепенно понижается температура окружающей среды.";



    public static void Seas(string[] args)
    {
        Console.WriteLine("Зима - 1\n Весна - 2\n Лето - 3\n Осень - 4");
        Console.Write("month = ");
        string month = Console.ReadLine();
        switch (month)
        {
            case "1":
                Console.WriteLine("Я люблю зиму");
                break;
            case "2":
                Console.WriteLine("Я люблю весну");
                break;
            case "3":
                Console.WriteLine("Я люблю лето");
                break;
            case "4":
                Console.WriteLine("Я люблю осень");
                break;
        }
    }
}