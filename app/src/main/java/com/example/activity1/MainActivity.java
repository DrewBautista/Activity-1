package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_red,button_blue,button_yellow,button_gray,button_pink,button_green,button_gold,button_tan,button_orange,button_reset;
    View background_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_blue =(Button)findViewById(R.id.Btn_blue);
        button_red = (Button)findViewById(R.id.Btn_red);
        button_yellow = (Button)findViewById(R.id.Btn_yellow);
        button_gray = (Button)findViewById(R.id.Btn_gray);
        button_pink = (Button)findViewById(R.id.Btn_pink);
        button_green = (Button)findViewById(R.id.Btn_green);
        button_gold = (Button)findViewById(R.id.Btn_gold);
        button_tan = (Button)findViewById(R.id.Btn_tan);
        button_orange = (Button)findViewById(R.id.Btn_orange);
        button_reset = (Button)findViewById(R.id.Btn_reset);
        background_view = this.getWindow().getDecorView();

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_blue.getText().equals("BLUE"));
                {
                    background_view.setBackgroundResource(R.color.BLUE);
                    Toast.makeText(MainActivity.this, "you have successfully change the color blue", Toast.LENGTH_LONG).show();
                }

            }
        });

        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_red.getText().equals("RED"));
                {
                    background_view.setBackgroundResource(R.color.RED);
                    Toast.makeText(MainActivity.this, "you have successfully change the color red", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_yellow.getText().equals("YELLOW"));
                {
                    background_view.setBackgroundResource(R.color.YELLOW);
                    Toast.makeText(MainActivity.this, "you have successfully change the color yellow", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_gray.getText().equals("GRAY"));
                {
                    background_view.setBackgroundResource(R.color.GRAY);
                    Toast.makeText(MainActivity.this, "you have successfully change the color gray", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_pink.getText().equals("PINK"));
                {
                    background_view.setBackgroundResource(R.color.PINK);
                    Toast.makeText(MainActivity.this, "you have successfully change the color pink", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_green.getText().equals("GREEN"));
                {
                    background_view.setBackgroundResource(R.color.GREEN);
                    Toast.makeText(MainActivity.this, "you have successfully change the color green", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_gold.getText().equals("GOLD"));
                {
                    background_view.setBackgroundResource(R.color.GOLD);
                    Toast.makeText(MainActivity.this, "you have successfully change the color gold", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_tan.getText().equals("TAN"));
                {
                    background_view.setBackgroundResource(R.color.TAN);
                    Toast.makeText(MainActivity.this, "you have successfully change the color tan", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_orange.getText().equals("ORANGE"));
                {
                    background_view.setBackgroundResource(R.color.ORANGE);
                    Toast.makeText(MainActivity.this, "you have successfully change the color orange", Toast.LENGTH_LONG).show();
                }

            }
        });
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_reset.getText().equals("RESET"));
                {
                    background_view.setBackgroundResource(R.color.RESET);
                    Toast.makeText(MainActivity.this, "you have successfully change the color reset", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}