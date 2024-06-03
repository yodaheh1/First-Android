package com.example.assigment_four;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        TextView txtInfo = findViewById(R.id.txtInfo);

        btnSubmit.setOnClickListener(e -> {
            txtInfo.setText("Yodahe Hunde\nInformation Systems\nScrolling on Tiktok");
        });
    }
}