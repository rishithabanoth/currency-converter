# currency-converter
Certainly! Let's delve into more detail about the operations used in the Currency Converter Java program:

1. **User Input and Interface:**
 - The program begins by welcoming the user and presenting a menu of currency codes.
 - The user is prompted to enter a numeric code corresponding to the desired currency or choose '0' to exit the program.

2. **Switch-Case Structure:**
 - The core of the program utilizes a switch-case structure to handle different currency conversion scenarios based on the user's input.

3. **Rupees to Other Currencies (Case 1):**
 - If the user selects '1' for Rupees, the program prompts the user to input an amount in Rupees.
 - The entered Rupee amount is then converted into Dollar, Pound, Euro, and Kuwaiti Dinar using predefined conversion rates.
 - The results are formatted using Decimal Format to display up to three decimal places.

4. **Dollar to Other Currencies (Case 2):**
 - If the user selects '2' for Dollars, a similar process occurs. The user inputs a Dollar amount, and the program converts it into Rupees, Pound, Euro, and Kuwaiti Dinar.

5. **Other Currency Cases (Cases 3-5):**
 - Similar conversion operations are implemented for Pound, Euro, and Kuwaiti Dinar. Each case prompts the user for an input amount in the selected currency and converts it to Rupees, Dollars, and the remaining two currencies.

6. **Invalid Code Handling:**
 - If the user enters an invalid code, the program informs them of the error.

7. **Exit Option:**
 - If the user chooses '0', the program exits with a friendly farewell message.

8. **Decimal Formatting:**
 - The Decimal Format class is utilized to format the converted currency values to a visually appealing and consistent format.

9. **Looping Structure:**
 - The entire process is enclosed in a do-while loop, ensuring that the program continues to execute until the user explicitly chooses to exit by entering '0'.

10. **Resource Closure:**
 - The program closes the Scanner resource at the end to prevent resource leaks.

Overall, this Currency Converter Project in Java provides a practical and interactive tool for users to perform currency conversions with ease. The modular design and clear user prompts make it accessible for both novice and experienced developers
