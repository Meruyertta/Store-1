package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Switch;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void registration(View view){
        startActivity(new Intent(MainActivity.this,RegistrationActivity.class));
    }
    public void home(View view){
        startActivity(new Intent(MainActivity.this, HomeActivity.class));
    }
}