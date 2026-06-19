# Taking Input in Java

When building Java programs, we often need to get information from the user. Java provides multiple ways to take input, and each method is useful in different situations.
<br><br>
I have listed 3 ways to take input in java:

## 1. Scanner Class

Scanner is the most commonly used input method in Java. It is easy to learn and can read different types of data such as integers, decimals, and strings.

### Why I Use It
- Simple syntax
- Beginner-friendly
- Supports multiple data types

## 2. Command Line Arguments

Command Line Arguments allow input to be passed when the program starts running. Instead of asking the user for input during execution, the values are provided through the command line.

### Why I Use It
- No interactive input required
- Useful for automation
- Easy to pass startup values

## 3. BufferedReader

BufferedReader is another way to take input in Java. It is faster than Scanner because it reads larger chunks of data at once.

### Why I Use It
- Better performance
- Efficient for large inputs
- Common in competitive programming

## Quick Comparison

| Method | Easy to Learn | Speed | Common Use |
|----------|-------------|--------|------------|
| Scanner | Yes | Moderate | General input |
| Command Line Arguments | Yes | Fast | Startup parameters |
| BufferedReader | Moderate | Fast | Large inputs |

## Conclusion

Each input method has its own purpose. Scanner is great for beginners, Command Line Arguments are useful for passing values when starting a program, BufferedReader offers better performance for large inputs.

Learning all three methods provides a solid understanding of input handling in Java.
