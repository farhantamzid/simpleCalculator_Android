package com.example.simplecalculator;

import android.os.Bundle;
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
        display.append("0");

    }

    public void dotOnClick(View view) {
        display.append(".");
    }

    public void delOnClick(View view) {
        String string = display.getText().toString();
        if (!string.isEmpty()){
            display.setText(string.substring(0, string.length() - 1));
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
            } else{
                display.setText(String.valueOf(result));
            }
        } catch (ScriptException e) {
            Snackbar.make(view, "Invalid expression. Please try again.", Snackbar.LENGTH_LONG).show();
        }
    }

    public void addOnClick(View view) {
        display.append("+");
    }

    public void threeOnClick(View view) {
        display.append("3");
    }

    public void twoOnClick(View view) {
        display.append("2");
    }

    public void oneOnClick(View view) {
        display.append("1");
    }

    public void fourOnClick(View view) {
        display.append("4");
    }

    public void fiveOnClick(View view) {
        display.append("5");
    }

    public void sixOnClick(View view) {
        display.append("6");
    }

    public void subtractOnClick(View view) {
        display.append("-");
    }

    public void sevenOnClick(View view) {
        display.append("7");
    }

    public void eightOnClick(View view) {
        display.append("8");
    }

    public void nineOnClick(View view) {
        display.append("9");
    }

    public void multiplyOnClick(View view) {
        display.append("*");
    }

    public void divideOnClick(View view) {
        display.append("/");
    }

    public void squareRootOnClick(View view) {
        display.append("√(");
    }

    public void openBracketOnClick(View view) {
        display.append("(");
    }

    public void closedBracketOnClick(View view) {
        display.append(")");
    }

    public void allClearOnClick(View view) {
        display.setText("");
        textStream="";

    }

    public void sinOnClick(View view) {
        display.append("sin(");
    }

    public void cosOnClick(View view) {
        display.append("cos(");
    }

    public void tanOnClick(View view) {
        display.append("tan(");
    }

}