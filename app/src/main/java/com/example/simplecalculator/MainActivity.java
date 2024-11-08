package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
    private ScriptEngine engine;

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

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

    }


    public void zeroOnClick(View view) {
    }

    public void dotOnClick(View view) {
    }

    public void delOnClick(View view) {
    }

    public void equalsOnClick(View view) {
    }

    public void addOnClick(View view) {
    }

    public void threeOnClick(View view) {
    }

    public void twoOnClick(View view) {
    }

    public void oneOnClick(View view) {
    }

    public void fourOnClick(View view) {
    }

    public void fiveOnClick(View view) {
    }

    public void sixOnClick(View view) {
    }

    public void subtractOnClick(View view) {
    }

    public void sevenOnClick(View view) {
    }

    public void eightOnClick(View view) {
    }

    public void nineOnClick(View view) {
    }

    public void multiplyOnClick(View view) {
    }

    public void divideOnClick(View view) {
    }

    public void squareRootOnClick(View view) {
    }

    public void openBracketOnClick(View view) {
    }

    public void closedBracketOnClick(View view) {
    }

    public void allClearOnClick(View view) {
    }
}