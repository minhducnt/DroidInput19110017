package com.android.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkChocolate,checkSprinkles,checkCrushed,checkCherries,checkOrio;
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String concat ="Toppings: ";
                if(checkChocolate.isChecked())
                {
                    concat += checkChocolate.getText().toString()+" ";
                }
                if(checkSprinkles.isChecked())
                {
                    concat += checkSprinkles.getText().toString()+" ";

                }
                if(checkCrushed.isChecked())
                {
                    concat += checkCrushed.getText().toString()+" ";

                }
                if(checkCherries.isChecked())
                {
                    concat += checkCherries.getText().toString()+" ";

                }
                if(checkOrio.isChecked())
                {
                    concat += checkOrio.getText().toString()+" ";

                }
                Toast.makeText(MainActivity.this,concat,Toast.LENGTH_LONG).show();

            }
        });
    }
    void anhXa()
    {
        btnClick = (Button) findViewById(R.id.buttonClick);
        checkChocolate = (CheckBox) findViewById(R.id.checkBoxChocolate);
        checkSprinkles = (CheckBox) findViewById(R.id.checkBoxSprinkles);
        checkCrushed = (CheckBox) findViewById(R.id.checkBoxCrushed);
        checkCherries = (CheckBox) findViewById(R.id.checkBoxCherries);
        checkOrio = (CheckBox) findViewById(R.id.checkBoxOrio);

    }
}