Console.WriteLine("Welcome to the number Guessing Game");
Console.WriteLine();
Console.WriteLine("Guess the number between 1 and 10");
Console.WriteLine();

Random random = new Random();
int randNum = random.Next(1, 11);

while (true)
{
    int userNum = ReadInt(">> ");

    if (userNum > randNum)
    {
        Console.WriteLine("Too high, try again.");
    }
    else if (userNum < randNum)
    {
        Console.WriteLine("Too low, try again.");
    }
    else
    {
        Console.WriteLine("You got it!");
        break;
    }
}

static int ReadInt(string message, string errorMessage = "Invalid integer!")
{
    while (true)
    {
        try
        {
            Console.Write(message);
            int num = int.Parse(Console.ReadLine()!);
            return num;
        }
        catch (FormatException)
        {
            Console.WriteLine(errorMessage);
        }
    }
}