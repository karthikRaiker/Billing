package com.example.bill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9;
    CheckBox[] c = new CheckBox[9];
    Button b1;
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final StringBuilder s = new StringBuilder();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        c9 = findViewById(R.id.c9);

        if (c1.isChecked()) {
            sum += 300;


        }

        if (c2.isChecked()) {
            sum += 100;

        }
        if (c3.isChecked()) {
            sum += 100;
        }
        if (c4.isChecked()) {
            sum += 300;
        }
        if (c5.isChecked()) {
            sum += 100;
        }
        if (c6.isChecked()) {
            sum += 300;
        }
        if (c7.isChecked()) {
            sum += 400;
        }
        if (c8.isChecked()) {
            sum += 100;
        }
        if (c9.isChecked()) {
            sum += 100;
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1.isChecked()) {
                    s.append("Vehicle speed exceeding the maximum speed fixed = 300" + "\n");
                    sum += 300;

                }
                if (c2.isChecked()) {

                    s.append("No Parking   = 100" + "\n");
                    sum += 100;

                }
                if (c3.isChecked()) {
                    s.append("Defective Silencer   = 100" + "\n");
                    sum += 100;

                }

                if (c4.isChecked()) {
                    s.append("Emitting Black Somke    = 300" + "\n");
                    sum += 300;


                }
                if (c5.isChecked()) {
                    s.append("Shrill Horn    = 100" + "\n");
                    sum += 100;

                }
                if (c6.isChecked()) {
                    s.append("Without Driving License Two Wheeler   = 300" + "\n");
                    sum += 300;


                }
                if (c7.isChecked()) {
                    s.append("Without Driving License Non-Transport Vehicle   = 400" + "\n");
                    sum += 400;

                }
                if (c8.isChecked()) {
                    s.append("Jumping Traffic Signal   = 100" + "\n");
                    sum += 100;

                }
                if (c9.isChecked()) {
                    s.append("Wrong Parking    = 100" + "\n");
                    sum += 100;

                } else {

                }

                Intent i = new Intent(MainActivity.this, displaybill.class);
                String m = s.toString();
                i.putExtra("bill", m);
                String su = Integer.toString(sum);
                i.putExtra("total", su);
                startActivity(i);
            }
        });


    }
}
