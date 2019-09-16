package com.example.phonephotos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double smallPrice = 0.19;
    double mediumPrice = 0.49;
    double largePrice = 0.79;
    double qtyEntered;
    double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText prints = (EditText) findViewById(R.id.txtPrints);
        final RadioButton small = (RadioButton) findViewById(R.id.radSmall);
        final RadioButton medium = (RadioButton) findViewById(R.id.radMedium);
        final RadioButton large = (RadioButton) findViewById(R.id.radLarge);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button cost = (Button) findViewById(R.id.btnCost);

        cost.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                qtyEntered = Double.parseDouble(prints.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###,###.00");
                if (small.isChecked()) {
                    if (qtyEntered <= 50) {
                        total = smallPrice * qtyEntered;
                        result.setText("The order cost is " + currency.format(total));
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Quantity cannot exceed 50.",
                                Toast.LENGTH_LONG).show();
                    }
                }
                if (medium.isChecked()) {
                    if (qtyEntered <= 50) {
                        total = mediumPrice * qtyEntered;
                        result.setText("The order cost is " + currency.format(total));
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Quantity cannot exceed 50.",
                                Toast.LENGTH_LONG).show();
                    }
                }
                if (large.isChecked()) {
                    if (qtyEntered <= 50) {
                        total = largePrice * qtyEntered;
                        result.setText("The order cost is " + currency.format(total));
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Quantity cannot exceed 50.",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


    }
}
