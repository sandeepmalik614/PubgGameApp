package com.gameapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.gameapp.R;

import static com.gameapp.utils.AppUtils.isConnectionAvailable;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.editText);
        edtPassword = findViewById(R.id.editText1);
    }

    public void goToRegister(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    public void goToForgot(View view) {
    }

    public void validateLogin(View view) {
        if (edtUsername.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
        } else if (edtPassword.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
        }else{
            if(isConnectionAvailable(this)){
                Toast.makeText(this, "All Done", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
