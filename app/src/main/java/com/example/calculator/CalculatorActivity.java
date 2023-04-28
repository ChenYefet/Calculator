package com.example.calculator;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.Expression;

public class CalculatorActivity extends AppCompatActivity
{
    private static boolean calculationJustHappened = false;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_calculator);

        this.display = this.findViewById(R.id.display_EditText);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        // Calling setShowSoftInputOnFocus requires API level 21 (current min is 16)

        {
            this.display.setShowSoftInputOnFocus(false);
            // Prevents the keyboard from popping up when the display EditText object is clicked

        }

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

        // Updates the cursor position so that it doesn't remain to the left of the input

    }
    public void zeroButton()
    {
        Button zeroButton = this.findViewById(R.id.zero_Button);
        zeroButton.setOnClickListener(v ->
                this.updateDisplayText("0"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void oneButton()
    {
        Button oneButton = this.findViewById(R.id.one_Button);
        oneButton.setOnClickListener(v ->
                this.updateDisplayText("1"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void twoButton()
    {
        Button twoButton = this.findViewById(R.id.two_Button);
        twoButton.setOnClickListener(v ->
                this.updateDisplayText("2"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void threeButton()
    {
        Button threeButton = this.findViewById(R.id.three_Button);
        threeButton.setOnClickListener(v ->
                this.updateDisplayText("3"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void fourButton()
    {
        Button fourButton = this.findViewById(R.id.four_Button);
        fourButton.setOnClickListener(v ->
                this.updateDisplayText("4"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void fiveButton()
    {
        Button fiveButton = this.findViewById(R.id.five_Button);
        fiveButton.setOnClickListener(v ->
                this.updateDisplayText("5"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void sixButton()
    {
        Button sixButton = this.findViewById(R.id.six_Button);
        sixButton.setOnClickListener(v ->
                this.updateDisplayText("6"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void sevenButton()
    {
        Button sevenButton = this.findViewById(R.id.seven_Button);
        sevenButton.setOnClickListener(v ->
                this.updateDisplayText("7"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void eightButton()
    {
        Button eightButton = this.findViewById(R.id.eight_Button);
        eightButton.setOnClickListener(v ->
                this.updateDisplayText("8"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void nineButton()
    {
        Button nineButton = this.findViewById(R.id.nine_Button);
        nineButton.setOnClickListener(v ->
                this.updateDisplayText("9"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void decimalPointButton()
    {
        Button decimalPointButton = this.findViewById(R.id.decimal_point_Button);
        decimalPointButton.setOnClickListener(v ->
                this.updateDisplayText("."));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void plusButton()
    {
        Button plusButton = this.findViewById(R.id.plus_Button);
        plusButton.setOnClickListener(v ->
                this.updateDisplayText("+"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void minusButton()
    {
        Button minusButton = this.findViewById(R.id.minus_Button);
        minusButton.setOnClickListener(v ->
                this.updateDisplayText("-"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void multiplyButton()
    {
        Button multiplyButton = this.findViewById(R.id.multiply_Button);
        multiplyButton.setOnClickListener(v ->
                this.updateDisplayText("×"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void divideButton()
    {
        Button divideButton = this.findViewById(R.id.divide_Button);
        divideButton.setOnClickListener(v ->
                this.updateDisplayText("÷"));

        CalculatorActivity.calculationJustHappened = false;

    }
    public void indexButton()
    {
        Button indexButton = this.findViewById(R.id.index_Button);
        indexButton.setOnClickListener(v ->
                this.updateDisplayText("^"));

        CalculatorActivity.calculationJustHappened = false;

    }
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
    public void equalsButton()
    {
        Button equalsButton = this.findViewById(R.id.equals_Button);
        equalsButton.setOnClickListener(v ->
        {
            String displayString = this.display.getText().toString();
            Expression expression = new Expression(displayString);

            String resultString = String.valueOf(expression.calculate());

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
    public void clearButton()
    {
        Button clearButton = this.findViewById(R.id.clear_Button);
        clearButton.setOnClickListener(v ->
                this.display.setText(""));

        CalculatorActivity.calculationJustHappened = false;

    }
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
                // the existing symbols in the display.
                // Without this setSelection method, the cursor would be further to the right
                // of the rightmost symbol in the display after the backspaceButton method
                // is executed, so further calls of the backspaceButton method would do nothing
                // until the cursor is right beside a symbol again.

                CalculatorActivity.calculationJustHappened = false;

            }
        });
    }
}