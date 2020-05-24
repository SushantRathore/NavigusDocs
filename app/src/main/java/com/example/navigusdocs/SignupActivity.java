package com.example.navigusdocs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {

    EditText name , email , password , phone;
    Button signUp;
    String username , userEmail , userPassword , userPhoneNumber;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_signup);

        name = findViewById(R.id.nameOfUser);
        email = findViewById(R.id.UserEmail);
        phone = findViewById(R.id.phoneNumber);
        password =findViewById(R.id.UserPassword);
        signUp = findViewById(R.id.signUP);

        //Save data on firebase on button click
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                //Get all the values
                username = name.getText().toString().trim();
                userPhoneNumber = phone.getText().toString().trim();
                userEmail = email.getText().toString().trim();
                userPassword = password.getText().toString().trim();


                UserHelperClass helperClass = new UserHelperClass(username,userPhoneNumber, userEmail , userPassword);
                reference.child(userPhoneNumber).setValue(helperClass);

            }
        });
    }

    public void BackButton(View view) {
        startActivity(new Intent(SignupActivity.this,MainActivity.class));
    }


}
