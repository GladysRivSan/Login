package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    String mail = "gladys@gmail.com";
    String password = "123456";
    EditText mailField, passwordField;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        User user = getIntent().getParcelableExtra("Deta");
        TextView hello = findViewById(R.id.hello);
        if (user != null) {
            String message = user.getName() + user.getAge();
            hello.setText(message);
        }

        Intent intent = new Intent(getApplicationContext(),
                HomeActivity.class);
        intent.putExtra("EXTRA", new User("name", 20));
        startActivity(intent);
        finish();
    }
}
