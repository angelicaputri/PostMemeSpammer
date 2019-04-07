package com.example.user.postmemespammer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private sharedpreferenceconfig preferenceconfig;
    private EditText Username, UserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        preferenceconfig = new sharedpreferenceconfig(getApplicationContext());
        Username = findViewById(R.id.user_name);
        UserPassword = findViewById(R.id.user_password);

        if (preferenceconfig.readLoginStatus()){
            startActivity(new Intent(this,Main3Activity.class));
            finish();
        }
    }

    public void loginUser(View view) {

        String username = Username.getText().toString();
        String userpassword = UserPassword.getText().toString();

        if(username.equals(getResources().getString(R.string.user_name))&&userpassword.equals(getResources().getString(R.string.user_password))){
            Intent a = new Intent(getApplicationContext(),Main3Activity.class);
            a.putExtra("username", username);
            a.putExtra("password", userpassword);
            startActivity(a);
            preferenceconfig.writeLoginStatus(true);
            finish();
        }
        else{
            Toast.makeText(this, "login Gagal", Toast.LENGTH_SHORT).show();
            UserPassword.setText("");
            Username.setText("");
        }

    }

}
