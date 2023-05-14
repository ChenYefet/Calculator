package com.example.calculator;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

/**
 * An object of the CalculatorActivity class is a simple model of
 * a single screen with the user interface of a calculator.
 * It has an attribute representing the display
 * and local variables representing the buttons
 * which are declared within methods called
 * oneButton(), twoButton(), multiplyButton(), etc.
 * Each of these methods sets up its associated button's click listener
 * and are called within the onCreate() method.
 *
 * calculationJustHappened is a Boolean class variable
 * that keeps track of when a calculation just happened.
 *
 * updateDisplayText() is a helper method that is used in most of the 'button' methods
 * to update the text of the display.
 *
 * @author Chen Yefet
 */
public class CalculatorActivity extends AppCompatActivity
{
    private static boolean calculationJustHappened = false;
    private EditText display;

    /**
     * This is the method that gets called when the activity is created.
     * It sets up the initial state of the activity, including
     * the layout of the activity using the setContentView() method,
     * the display using the findViewById() method,
     * and the click listeners for all of the buttons on the calculator,
     * which it does by calling the appropriate 'button' methods defined below.
     *
     * savedInstanceState is a formal argument of type Bundle.
     * It either contains the activity's previously saved state
     * or is null if the activity has never existed before.
     * It could include the contents of user interface widgets,
     * the scroll position of a RecyclerView,
     * the values of instance variables,
     * or any other relevant data that the user would need
     * the next time the activity is created,
     * for example after a user rotates the device from portrait to landscape mode
     * (in which case the Activity object would be destroyed and recreated).
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Passes savedInstanceState to AppCompatActivity.
        // This is called before the rest of the onCreate() method
        // to ensure proper setup and initialization of the activity,
        // e.g. toolbar, theme, backward compatibility via the AndroidX library.

        this.setContentView(R.layout.activity_calculator);
        // Sets up the layout of the activity

        this.display = this.findViewById(R.id.display_EditText);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        // Calling setShowSoftInputOnFocus requires Android API level 21 or more
        // i.e. the version of Android called Lollipop.
        // The minimum API level that this application is set to support is 16.

        {
            this.display.setShowSoftInputOnFocus(false);
            // Prevents the keyboard from popping up when the display EditText object is clicked

        }

        // The following methods set up each button's click listener
        this.zeroButton();
        this.oneButton();
        this.twoButton();
        this.threeButton();
        this.fourButton();
        this.fiveButton();
        this.sixButton();
        this.sevenButton();
        this.eightButton();
        this.nineButton();
        this.decimalPointButton();
        this.plusButton();
        this.minusButton();
        this.multiplyButton();
        this.divideButton();
        this.indexButton();
        this.bracketsButton();
        this.plusMinusButton();
        this.equalsButton();
        this.clearButton();
        this.backspaceButton();

    }

    /**
     * Helper method for some of the 'button' methods.
     * Updates the text of the display
     * by adding the inputted string to the display at the position of the cursor,
     * and then updating the position of the cursor
     * so that it remains to the right of the inputted string.
     */
    private void updateDisplayText(String inputString)
    {
        String previousString = this.display.getText().toString();
        int cursorPosition = this.display.getSelectionStart();

        String stringToTheLeftOfTheCursorPosition = previousString.substring(0, cursorPosition);
        String stringToTheRightOfTheCursorPosition = previousString.substring(cursorPosition);

        this.display.setText(String.format("%s%s%s", stringToTheLeftOfTheCursorPosition, inputString, stringToTheRightOfTheCursorPosition));
        // %s%s%s is used to concatenate three string values (the following three arguments)
        // and return the result as a formatted string

        this.display.setSelection(cursorPosition + 1);
        // Updates the cursor position so that it doesn't remain to the left of the input string

    }

    /**
     * Sets up the zero button's click listener
     * which updates the display by entering '0' at the cursor position
     */
    public void zeroButton()
    {
        Button zeroButton = this.findViewById(R.id.zero_Button);
        zeroButton.setOnClickListener(v ->
                this.updateDisplayText("0"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the one button's click listener
     * which updates the display by entering '1' at the cursor position
     */
    public void oneButton()
    {
        Button oneButton = this.findViewById(R.id.one_Button);
        oneButton.setOnClickListener(v ->
                this.updateDisplayText("1"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the two button's click listener
     * which updates the display by entering '2' at the cursor position
     */
    public void twoButton()
    {
        Button twoButton = this.findViewById(R.id.two_Button);
        twoButton.setOnClickListener(v ->
                this.updateDisplayText("2"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the three button's click listener
     * which updates the display by entering '3' at the cursor position
     */
    public void threeButton()
    {
        Button threeButton = this.findViewById(R.id.three_Button);
        threeButton.setOnClickListener(v ->
                this.updateDisplayText("3"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the four button's click listener
     * which updates the display by entering '4' at the cursor position
     */
    public void fourButton()
    {
        Button fourButton = this.findViewById(R.id.four_Button);
        fourButton.setOnClickListener(v ->
                this.updateDisplayText("4"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the five button's click listener
     * which updates the display by entering '5' at the cursor position
     */
    public void fiveButton()
    {
        Button fiveButton = this.findViewById(R.id.five_Button);
        fiveButton.setOnClickListener(v ->
                this.updateDisplayText("5"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the six button's click listener
     * which updates the display by entering '6' at the cursor position
     */
    public void sixButton()
    {
        Button sixButton = this.findViewById(R.id.six_Button);
        sixButton.setOnClickListener(v ->
                this.updateDisplayText("6"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the seven button's click listener
     * which updates the display by entering '7' at the cursor position
     */
    public void sevenButton()
    {
        Button sevenButton = this.findViewById(R.id.seven_Button);
        sevenButton.setOnClickListener(v ->
                this.updateDisplayText("7"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the eight button's click listener
     * which updates the display by entering '8' at the cursor position
     */
    public void eightButton()
    {
        Button eightButton = this.findViewById(R.id.eight_Button);
        eightButton.setOnClickListener(v ->
                this.updateDisplayText("8"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the nine button's click listener
     * which updates the display by entering '9' at the cursor position
     */
    public void nineButton()
    {
        Button nineButton = this.findViewById(R.id.nine_Button);
        nineButton.setOnClickListener(v ->
                this.updateDisplayText("9"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the decimal point button's click listener
     * which updates the display by entering '.' at the cursor position
     */
    public void decimalPointButton()
    {
        Button decimalPointButton = this.findViewById(R.id.decimal_point_Button);
        decimalPointButton.setOnClickListener(v ->
                this.updateDisplayText("."));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the plus button's click listener
     * which updates the display by entering '+' at the cursor position
     */
    public void plusButton()
    {
        Button plusButton = this.findViewById(R.id.plus_Button);
        plusButton.setOnClickListener(v ->
                this.updateDisplayText("+"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the minus button's click listener
     * which updates the display by entering '-' at the cursor position
     */
    public void minusButton()
    {
        Button minusButton = this.findViewById(R.id.minus_Button);
        minusButton.setOnClickListener(v ->
                this.updateDisplayText("-"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the multiply button's click listener
     * which updates the display by entering '×' at the cursor position
     */
    public void multiplyButton()
    {
        Button multiplyButton = this.findViewById(R.id.multiply_Button);
        multiplyButton.setOnClickListener(v ->
                this.updateDisplayText("×"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the divide button's click listener
     * which updates the display by entering '÷' at the cursor position
     */
    public void divideButton()
    {
        Button divideButton = this.findViewById(R.id.divide_Button);
        divideButton.setOnClickListener(v ->
                this.updateDisplayText("÷"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the index button's click listener
     * which updates the display by entering '^' at the cursor position
     */
    public void indexButton()
    {
        Button indexButton = this.findViewById(R.id.index_Button);
        indexButton.setOnClickListener(v ->
                this.updateDisplayText("^"));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the brackets button's click listener
     * which updates the display by entering either '(' or ')' at the cursor position,
     * depending on which is more appropriate:
     * It enters '(' at the cursor position
     * when there are an equal amount of open and closed brackets to the left of the cursor position
     * or when the symbol to the left of the cursor position is '(',
     * but enters ')' at the cursor position
     * when there are less closed brackets than open brackets to the left of the cursor position
     * given that the symbol to the left of the cursor position is not '('.
     */
    public void bracketsButton()
    {
        Button bracketsButton = this.findViewById(R.id.brackets_Button);
        bracketsButton.setOnClickListener(v ->
        {
            String displayString = this.display.getText().toString();
            int displayLength = this.display.getText().length();
            String lastSymbol = "";
            if (displayLength > 0)
            {
                lastSymbol = displayString.substring(displayLength - 1, displayLength);
            }

            int cursorPosition = this.display.getSelectionStart();

            int countOfOpenBracketsToTheLeftOfCursorPosition = 0;
            int countOfClosedBracketsToTheLeftOfCursorPosition = 0;

            // Counts all the open and closed brackets that are to the left of the cursor position
            for (int currentSymbolPosition = 0; currentSymbolPosition < cursorPosition; currentSymbolPosition++)
            {
                String currentSymbol = displayString.substring(currentSymbolPosition, currentSymbolPosition + 1);

                if (currentSymbol.equals("("))
                {
                    countOfOpenBracketsToTheLeftOfCursorPosition++;
                }
                if (currentSymbol.equals(")"))
                {
                    countOfClosedBracketsToTheLeftOfCursorPosition++;
                }
            }

            // Updates the display by entering the appropriate bracket at the cursor position
            if (countOfOpenBracketsToTheLeftOfCursorPosition == countOfClosedBracketsToTheLeftOfCursorPosition || lastSymbol.equals("("))
            {
                this.updateDisplayText("(");
            }
            else if (countOfClosedBracketsToTheLeftOfCursorPosition < countOfOpenBracketsToTheLeftOfCursorPosition)
            {
                this.updateDisplayText(")");
            }

            this.display.setSelection(cursorPosition + 1);
            // Updates the cursor position so that it doesn't remain to the left of the input

            CalculatorActivity.calculationJustHappened = false;

        });
    }

    /**
     * Sets up the plus-minus button's click listener
     * which sets the display to the product of the expression that it contains and -1.
     * It evaluates the expression by calling the calculate() method on an Expression object,
     * both of which are from the mXparser library.
     */
    public void plusMinusButton()
    {
        Button plusMinusButton = this.findViewById(R.id.plus_minus_Button);
        plusMinusButton.setOnClickListener(v ->
        {
            if (!CalculatorActivity.calculationJustHappened)
            {
                this.equalsButton();
            }

            String displayString = this.display.getText().toString();
            Expression expression = new Expression(displayString);

            String resultString = String.valueOf(expression.calculate());

            if (!resultString.equals("NaN")) // NaN stands for Not a Number
            {
                double resultDouble = Double.parseDouble(resultString);
                resultDouble = resultDouble * -1;

                resultString = resultDouble + "";

                if (resultString.endsWith(".0"))
                {
                    resultString = resultString.substring(0, resultString.length() -2);
                }

            }

            this.display.setText(resultString);

            this.display.setSelection(resultString.length());
            // Updates the cursor position so that it is to the right of resultString

            CalculatorActivity.calculationJustHappened = true;

        });
    }

    /**
     * Sets up the equals button's click listener
     * which sets the display to the evaluation of the expression that it contains.
     * It evaluates the expression by calling the calculate() method on an Expression object,
     * both of which are from the mXparser library.
     */
    public void equalsButton()
    {
        Button equalsButton = this.findViewById(R.id.equals_Button);
        equalsButton.setOnClickListener(v ->
        {
            String displayString = this.display.getText().toString();
            Expression expression = new Expression(displayString);

            String resultString = String.valueOf(expression.calculate());

            // Removes the '.0' after an integer
            if (resultString.endsWith(".0"))
            {
                resultString = resultString.substring(0, resultString.length() -2);
            }

            this.display.setText(resultString);

            this.display.setSelection(resultString.length());
            // Updates the cursor position so that it is to the right of resultString

            CalculatorActivity.calculationJustHappened = true;

        });
    }

    /**
     * Sets up the clear button's click listener
     * which clears the display
     */
    public void clearButton()
    {
        Button clearButton = this.findViewById(R.id.clear_Button);
        clearButton.setOnClickListener(v ->
                this.display.setText(""));

        CalculatorActivity.calculationJustHappened = false;

    }

    /**
     * Sets up the backspace button's click listener
     * which deletes the character to the left of the cursor position
     */
    public void backspaceButton()
    {
        ImageButton backspaceButton = this.findViewById(R.id.backspace_ImageButton);
        backspaceButton.setOnClickListener(v ->
        {
            int cursorPosition = this.display.getSelectionStart();

            if (this.display.getText().length() != 0 && cursorPosition != 0)
            {
                SpannableStringBuilder displayStringBuilder = (SpannableStringBuilder) this.display.getText();
                displayStringBuilder.replace(cursorPosition - 1, cursorPosition, "");
                this.display.setText(displayStringBuilder);

                this.display.setSelection(cursorPosition - 1);
                // Updates the cursor position so that it remains to the right of
                // the symbol that was to the left of the deleted symbol.
                // Without this setSelection method,
                // the cursor would be further to the right of that symbol,
                // and further to the right of the rightmost symbol if the rightmost symbol was deleted,
                // in which case further calls of the backspaceButton method would do nothing
                // until the cursor is to the right of a symbol again.

                CalculatorActivity.calculationJustHappened = false;

            }
        });
    }
}