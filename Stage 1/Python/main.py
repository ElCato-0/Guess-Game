import random

def readint(message: str, error_message: str = "Invalid integer!") -> int:
    while True:
        try:
            num = int(input(message))
            return num
        except ValueError:
            print(error_message)

print("Welcome to the number Guessing Game")
print()
print("Guess the number between 1 and 10")
print()

rand_num = random.randint(1, 10)

while True:
    user_num = readint(">> ")
    
    if user_num > rand_num:
        print("Too high, try again.")
    elif user_num < rand_num:
        print("Too low, try again.")
    # in case user_num == rand_num
    else:
        print("You got it!")
        break