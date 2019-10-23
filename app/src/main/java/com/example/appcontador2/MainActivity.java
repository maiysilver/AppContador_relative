package com.example.appcontador2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mCount=0;
    private TextView show_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View view) {
        show_count = findViewById(R.id.show_count);
        mCount++;
        show_count.setText(Integer.toString(mCount));
    }


    public void toastear(View v){
        Toast toast1 =
                Toast.makeText(getApplicationContext(), Integer.toString(mCount), Toast.LENGTH_SHORT);

        toast1.show();
    }











}
