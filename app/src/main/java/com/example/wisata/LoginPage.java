package com.example.wisata;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

import model.ArrayUser;
import model.User;

public class LoginPage extends AppCompatActivity implements TextWatcher{

    Button signin_login;
    EditText email_login, password_login;
    TextView create;
    boolean validateEmail, validatePass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        getSupportActionBar().hide();

        email_login = findViewById(R.id.email_login);
        password_login = findViewById(R.id.password_login);
        signin_login = findViewById(R.id.signin_login);
        create = findViewById(R.id.create);
        validateEmail = false;
        validatePass = false;

        email_login.addTextChangedListener(this);
        password_login.addTextChangedListener(this);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), RegisterPage.class);
                startActivity(intent);
            }
        });

        signin_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_user = email_login.getText().toString().trim();
                String password_user = password_login.getText().toString().trim();

                if (validateEmail && validatePass) {
                    Boolean login = false;
                    for (int i = 0; i < ArrayUser.saveuserlist.size(); i++) {
                        User tempUser = ArrayUser.saveuserlist.get(i);
                        if ((tempUser.getEmail_user().equalsIgnoreCase(email_user)) && tempUser.getPassword_user().equalsIgnoreCase(password_user)) {
                            Intent intent = new Intent(getBaseContext(), MainMenu.class);
                            intent.putExtra("IDuser", tempUser);
                            finish();
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(), "Login Successful!", Toast.LENGTH_SHORT).show();
                            login = true;
                        }
                    }
                    if (!login) {
                        Toast.makeText(getApplicationContext(), "Unable to Login, Wrong Email/Password!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    email_login.setError("Please Correct Your Email!");
                    password_login.setError("Please Correct Your Password!");
                }
            }
        });
        email_login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String email_user = email_login.getText().toString().trim();

                Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("[a-zA-Z0-9+._%-+]{1,256}" + "@"
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" + "(" + "."
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" + ")+");

                if (email_user.isEmpty()) {
                    email_login.setError("Please Fill the Email Column!");
                    validateEmail = false;
                } else {
                    if (!EMAIL_ADDRESS_PATTERN.matcher(email_user).matches()) {
                        email_login.setError("Wrong Email Format!");
                        validateEmail = false;
                    } else {
                        email_login.setError("");
                        validateEmail = true;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        password_login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password_user = password_login.getText().toString().trim();

                Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9\\!\\@\\#\\$]{0,20}");

                if (password_user.isEmpty()) {
                    password_login.setError("Please Fill the Password Column!");
                    validatePass = false;
                } else {
                    if (password_user.length() < 8 || password_user.length() > 20) {
                        password_login.setError("Password must be 8 to 20 characters");
                        validatePass = false;
                    } else if (!PASSWORD_PATTERN.matcher(password_user).matches()) {
                        password_login.setError("Must contain a - z, A - Z, !, @, #, $");
                        validatePass = false;
                    } else {
                        password_login.setError("");
                        validatePass = true;
                    }

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String email_user = email_login.getText().toString().trim();
            String password_user = password_login.getText().toString().trim();
            if(!email_user.isEmpty() && !password_user.isEmpty()){
                signin_login.setEnabled(true);
            } else {
                signin_login.setEnabled(false);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }