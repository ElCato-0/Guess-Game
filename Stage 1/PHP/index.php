
<?php

echo "Welcome to the number Guessing Game\n";
echo "\n";
echo "Guess the number between 1 and 10\n";
echo "\n";

$randNum = rand(1, 10);

while (true) {
    $userNum = readInt(">> ");
    if ($userNum > $randNum) {
        echo "Too high, try again.\n";
    } else if ($userNum < $randNum) {
        echo "Too low, try again.\n";
    } else {
        echo "You got it!\n";
        break;
    }
}

function readInt($message, $errorMessage = "Invalid integer!") {
    while (true) {
        $num = readline($message);
        if (is_numeric($num)) {
            return (int) $num;
        } else {
            echo $errorMessage . PHP_EOL;
        }
    }
}