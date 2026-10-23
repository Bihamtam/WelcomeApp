package com.example.proje;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.etName);
        Button btnWelcome = findViewById(R.id.btnWelcome);
        TextView tvResult = findViewById(R.id.tvResult);

        btnWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "لطفاً نام خود را وارد کنید", Toast.LENGTH_SHORT).show();
                    return;
                }

                String message = "سلام " + name + "، خوش آمدید!";
                tvResult.setText(message);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}