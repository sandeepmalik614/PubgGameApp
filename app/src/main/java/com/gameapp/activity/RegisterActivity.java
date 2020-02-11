package com.gameapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.gameapp.R;
import com.gameapp.utils.AppUtils;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {

    private EditText edtFirstName, edtLastName, edtMobile, edtEmail, edtPass, edtConPass;
    private TextView tvDob;
    private RadioButton rbMale, rbFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtFirstName = findViewById(R.id.editText2);
        edtLastName = findViewById(R.id.editText3);
        edtMobile = findViewById(R.id.editText4);
        edtEmail = findViewById(R.id.editText5);
        edtPass = findViewById(R.id.editText6);
        edtConPass = findViewById(R.id.editText7);
        tvDob = findViewById(R.id.textView5);
        rbMale = findViewById(R.id.radioButton);
        rbFemale = findViewById(R.id.radioButton1);

        tvDob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDateDialog();
            }
        });

    }

    public void goToLogin(View view) {
        finish();
    }

    public void validateRegister(View view) {
        if(edtFirstName.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your first name", Toast.LENGTH_SHORT).show();
        }else if(edtLastName.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your last name", Toast.LENGTH_SHORT).show();
        }else if(edtMobile.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your mobile number", Toast.LENGTH_SHORT).show();
        }else if(edtEmail.getText().toString().isEmpty()){
            Toast.makeText(this, "Pelase enter your email id", Toast.LENGTH_SHORT).show();
        }else if(tvDob.getText().toString().isEmpty()){
            Toast.makeText(this, "Please select your Date of birth", Toast.LENGTH_SHORT).show();
        }else if(!rbMale.isChecked() && !rbFemale.isChecked()){
            Toast.makeText(this, "Please select your gender", Toast.LENGTH_SHORT).show();
        }else if(edtPass.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show();
        }else if(edtConPass.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter confirm password", Toast.LENGTH_SHORT).show();
        }else if(!edtPass.getText().toString().equals(edtConPass.getText().toString())){
            Toast.makeText(this, "Password and confirm password should be same", Toast.LENGTH_SHORT).show();
        }else if(!AppUtils.isConnectionAvailable(this)){
            Toast.makeText(this, "Please check your internet connection", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "All Done", Toast.LENGTH_SHORT).show();
        }
    }

    private void openDateDialog() {
        final Calendar calendar = Calendar.getInstance();
        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePicker = new DatePickerDialog(this, R.style.TimePickerTheme, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                tvDob.setText("");
                String month = String.valueOf(monthOfYear + 1);
                String day = String.valueOf(dayOfMonth);
                if (month.length() == 1) {
                    month = "0" + month;
                }

                if (day.length() == 1) {
                    day = "0" + day;
                }

                String date = year + "-" + month + "-" + day;
                tvDob.setText(date);
            }
        }, 1990, 1, 1);
        datePicker.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePicker.show();
    }
}
