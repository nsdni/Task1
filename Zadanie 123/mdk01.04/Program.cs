using System;

class Person
{
    string fullName;
    int age;

    public void move(string Person)
    {
        Console.WriteLine("Такой-то " + Person + " двигается");
    }

    public void talk(string Person)
    {
        Console.WriteLine("Такой-то " + Person + " говорит");
    }

    public Person()
    {
        
    }

    public Person(string fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;
    }

    static void Main(string[] args)
    {
        Person Vanyok = new Person("Ванёк", 17);
        Vanyok.talk("Ванёк");
        Vanyok.move("Ванёк");
        Person Miwa = new Person("Миша", 17);
        Miwa.talk("Миша");
        Miwa.move("Миша");
    }
}






