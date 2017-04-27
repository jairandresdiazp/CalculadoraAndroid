package com.example.jaira.calcjdiaz;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonClear,buttonAdd,buttonSubtract,buttonMultiply,buttonDivide,buttonEqual,buttonDot,buttonZero,buttonOne,buttonTwo,buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    EditText EditTextResult;
    TextView InfoTextView;
    double ValueOne=Double.NaN;
    double ValueTwo, Result;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonSubtract = (Button)findViewById(R.id.buttonSubtract);
        buttonMultiply = (Button)findViewById(R.id.buttonMultiply);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonEqual = (Button)findViewById(R.id.buttonEqual);
        buttonDot = (Button)findViewById(R.id.buttonDot);
        buttonZero = (Button)findViewById(R.id.buttonZero);
        buttonOne = (Button)findViewById(R.id.buttonOne);
        buttonTwo = (Button)findViewById(R.id.buttonTwo);
        buttonThree = (Button)findViewById(R.id.buttonThree);
        buttonFour = (Button)findViewById(R.id.buttonFour);
        buttonFive = (Button)findViewById(R.id.buttonFive);
        buttonSix = (Button)findViewById(R.id.buttonSix);
        buttonSeven = (Button)findViewById(R.id.buttonSeven);
        buttonEight = (Button)findViewById(R.id.buttonEight);
        buttonNine = (Button)findViewById(R.id.buttonNine);
        EditTextResult = (EditText)findViewById(R.id.EditTextResult);
        InfoTextView = (TextView)findViewById(R.id.InfoTextView);

        InfoTextView.setText("Jair Andres Diaz Puentes");

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "0");
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "1");
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "2");
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "3");
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "4");
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "5");
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "6");
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "7");
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "8");
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + "9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                EditTextResult.setText(EditTextResult.getText().toString() + ".");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Operador = "+";
                    EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                    ValueOne = Double.parseDouble(EditTextResult.getText().toString());
                    EditTextResult.setText("");
                }
                catch  (Exception e){
                }
            }
        });
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Operador = "-";
                    EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                    ValueOne = Double.parseDouble(EditTextResult.getText().toString());
                    EditTextResult.setText("");
                }
                catch  (Exception e){
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Operador = "*";
                    EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                    ValueOne = Double.parseDouble(EditTextResult.getText().toString());
                    EditTextResult.setText("");
                }
                catch  (Exception e){
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Operador = "/";
                    EditTextResult = (EditText)findViewById(R.id.EditTextResult);
                    ValueOne = Double.parseDouble(EditTextResult.getText().toString());
                    EditTextResult.setText("");
                }
                catch  (Exception e){
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = 0;
                ValueTwo = 0;
                Operador = "";
                EditTextResult.setText("");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditTextResult = (EditText) findViewById(R.id.EditTextResult);
                    ValueTwo = Double.parseDouble(EditTextResult.getText().toString());
                    if (Operador.equals("+")) {
                        EditTextResult.setText("");
                        Result = ValueOne + ValueTwo;
                    }
                    if (Operador.equals("-")) {
                        EditTextResult.setText("");
                        Result = ValueOne - ValueTwo;
                    }
                    if (Operador.equals("*")) {
                        EditTextResult.setText("");
                        Result = ValueOne * ValueTwo;
                    }
                    if (Operador.equals("/")) {
                        EditTextResult.setText("");
                        if (ValueOne != 0) {
                            Result = ValueOne / ValueTwo;
                        } else {
                            EditTextResult.setText("MatError");
                        }
                    }
                    EditTextResult.setText(String.valueOf(Result));
                }
                catch  (Exception e){
                }
            }
        });

    }
}
