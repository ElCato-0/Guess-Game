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

lower = upper = 0

while True:
    lower = readint("Enter the lower limit >> ")
    upper = readint("Enter the upper limit >> ")
    if upper <= lower:
        print("The upper limit must be greater than the lower limit!")
    else:
        break

print(f"Guess the number between {lower} and {upper}")
print()

rand_num = random.randint(lower, upper)
score = 100

while True:
    if score <= 0:
        print("You ran out of score!")
        break
    
    user_num = readint(">> ")

    if user_num == rand_num:
        print(f"You got it! Your score is {score:.2f}")
        break
    else:
        score -= abs(user_num - rand_num) * 25 / (upper - lower)
    print(f"Too {'high' if user_num > rand_num else 'low'}, your score: {score:.0f}")
