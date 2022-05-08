package com.example.bodorubenproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.lang.reflect.Array;

public class RegisterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String LOG_TAG = RegisterActivity.class.getName();
    private static final String PREF_KEY = RegisterActivity.class.getPackage().toString();
    private static final int SECRET_KEY = 99;

    private SharedPreferences preferences;
    private FirebaseAuth mAuth;

    EditText userNameET;
    EditText emailET;
    EditText password2ET;
    EditText passwordET;
    EditText phoneET;
    Spinner phoneSpinner;
    EditText adressET;
    RadioGroup accountTypeGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//        Bundle bundle = getIntent().getExtras();
//        bundle.get("SECRET_KEY");

        int secret_key = getIntent().getIntExtra("SECERET_KEY", 0);

        if (secret_key != 99){
            finish();
        }

        userNameET = findViewById(R.id.usernameEditText);
        emailET = findViewById(R.id.emailEditText);
        passwordET = findViewById(R.id.passwordEditText);
        password2ET = findViewById(R.id.password2EditText);
        phoneET = findViewById(R.id.phoneNumberEditText);
        phoneSpinner = findViewById(R.id.phoneSpinner);
        adressET = findViewById(R.id.adressEditText);
        accountTypeGroup = findViewById(R.id.accountTypeGroup);
        accountTypeGroup.check(R.id.buyerRadioButton);

        preferences = getSharedPreferences(PREF_KEY, MODE_PRIVATE);
        String userName = preferences.getString("userName", "");
        String password = preferences.getString("password", "");

        userNameET.setText(userName);
        passwordET.setText(password);
        password2ET.setText(password);

        phoneSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.phone_modes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        phoneSpinner.setAdapter(adapter);

        mAuth = FirebaseAuth.getInstance();

        Log.i(LOG_TAG, "onCreate");
    }

    public void register(View view) {
        String userNameStr = userNameET.getText().toString();
        String emailStr = emailET.getText().toString();
        String passwordStr = passwordET.getText().toString();
        String password2Str = password2ET.getText().toString();

        if (!passwordStr.equals(password2Str)) {
            Log.e(LOG_TAG, "Nem egyezik a két jelszó!");
            return;
        }

        String phoneNumber = phoneET.getText().toString();
        String phoneType = phoneSpinner.getSelectedItem().toString();
        String adress = adressET.getText().toString();

        int checkedId = accountTypeGroup.getCheckedRadioButtonId();
        RadioButton radioButton = accountTypeGroup.findViewById(checkedId);
        String accountType = radioButton.getText().toString();
        accountTypeGroup.indexOfChild(radioButton);

        Log.i(LOG_TAG, "Regisztrált: " + userNameStr + ", e-mail cím: " + emailStr);

        //startShopping();
        mAuth.createUserWithEmailAndPassword(emailStr, passwordStr).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Log.d(LOG_TAG, "Fiók sikeresen létrehozva.");
                    startShopping();
                } else{
                    Log.d(LOG_TAG, "Fiók létrehozása sikertelen.");
                    Toast.makeText(RegisterActivity.this, "Hiba" + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void cancel(View view) {
        finish();
    }

    private void startShopping() {
        Intent intent = new Intent(this, ShopListActivity.class);
        //intent.putExtra("SECRET_KEY", SECRET_KEY);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_TAG, "onRestart");
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        Log.i(LOG_TAG, selectedItem);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}