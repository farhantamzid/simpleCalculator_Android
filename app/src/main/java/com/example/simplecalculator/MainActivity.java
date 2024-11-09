package com.example.simplecalculator;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    ScriptEngine engine;
    EditText display;
    String textStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

         engine = new ScriptEngineManager().getEngineByName("rhino");
         display = (EditText) findViewById(R.id.calculatorDisplayEditText);
    }


    public void zeroOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("0");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "0" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void dotOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append(".");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0,cursorPos) + "." + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void delOnClick(View view) {
        int cursorPos = display.getSelectionStart();
        String string = display.getText().toString();


        if (!string.isEmpty() && cursorPos > 0) {
            String newText = string.substring(0, cursorPos - 1) + string.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos - 1);
        }
    }

    public void equalsOnClick(View view) {
        textStream = display.getText().toString();
        textStream = textStream.replaceAll("√","Math.sqrt");
        textStream = textStream.replaceAll("sin","Math.sin");
        textStream = textStream.replaceAll("cos","Math.cos");
        textStream = textStream.replaceAll("tan","Math.tan");
        Double result;
        try {
            result = (Double) engine.eval(textStream);
            if (result%1==0){
                double doubleValue = result;
                int intValue = (int) doubleValue;
                display.setText(String.valueOf(intValue));
                display.setSelection(display.length());
            } else{
                display.setText(String.valueOf(result));
                display.setSelection(display.length());
            }
        } catch (ScriptException e) {
            Snackbar.make(view, "Invalid expression. Please try again.", Snackbar.LENGTH_LONG).show();
        }
    }

    public void addOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("+");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "+" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void threeOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("3");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "3" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void twoOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("2");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "2" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void oneOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("1");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "1" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void fourOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("4");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "4" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void fiveOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("5");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "5" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void sixOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("6");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "6" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void subtractOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("-");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "-" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void sevenOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("7");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "7" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void eightOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("8");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "8" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void nineOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("9");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "9" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void multiplyOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("*");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "*" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void divideOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("/");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "/" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void squareRootOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("√(");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "√(" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 2);
        }
    }

    public void openBracketOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("(");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "(" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void closedBracketOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append(")");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + ")" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 1);
        }
    }

    public void allClearOnClick(View view) {
        display.setText("");
        textStream="";

    }

    public void sinOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("sin(");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "sin(" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 4);
        }
    }

    public void cosOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("cos(");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "cos(" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 4);
        }
    }

    public void tanOnClick(View view) {
        if (display.getSelectionStart() == display.length()) {
            display.append("tan(");
        } else {
            int cursorPos = display.getSelectionStart();
            String oldText = display.getText().toString();

            String newText = oldText.substring(0, cursorPos) + "tan(" + oldText.substring(cursorPos);
            display.setText(newText);
            display.setSelection(cursorPos + 4);
        }
    }

}