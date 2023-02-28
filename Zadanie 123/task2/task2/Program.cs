using System;

class Phone
{
    public string number;
    public string model;
    public string weight;



    public void receiveCall(string name)
    {
        Console.WriteLine("Звонит" + name);
    }

    public void getNumber(string number)
    {
        Console.Write(number);
    }

    public Phone(string number, string model, string weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Console.Write(number);
        Console.Write(weight);
        Console.Write(model);
    }

    public Phone(string number, string model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone()
    {

    }
    public void receiveCall(string name, string number)
    {
        Console.WriteLine(name + number);
    }
    public void sendMessege(string[] numbers)
    {
        for (int i = 0; i < numbers.Length; i++)
        {
            Console.Write(numbers[i] + " ");
        }
    }
}

