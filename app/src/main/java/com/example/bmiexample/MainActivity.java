package com.example.bmiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtWeight, edtHightFt, edtHightIn;
    Button btnCalculate;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWeight = findViewById(R.id.edtWeight);
        edtHightFt = findViewById(R.id.edtHightFt);
        edtHightIn = findViewById(R.id.edtHightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHightFt.getText().toString());
                int in = Integer.parseInt(edtHightIn.getText().toString());

                int totalIn = ft * 12 + in;
                double totalCm = totalIn * 2.53;
                double totalM = totalCm / 100;

                double BMI = wt / (totalM * totalM);

                if(BMI>25){
                    txtResult.setText("You are OverWeight");
                } else if (BMI<18) {
                    txtResult.setText("You are UnderWeight");
                }
                else {
                    txtResult.setText("You are Healthy");
                }


            }
        });



    }
}