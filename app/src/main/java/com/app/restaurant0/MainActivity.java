package com.app.restaurant0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.restaurant0.databinding.ActivityMainBinding;
import com.app.restaurant0.fragments.HomeFragment;
import com.app.restaurant0.fragments.InfoFragment;
import com.app.restaurant0.fragments.ProfileFragment;
import com.app.restaurant0.fragments.RestFragment;
import com.app.restaurant0.fragments.SearchFragment;
import com.app.restaurant0.register.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
        homeTrans.replace(R.id.fragment_container, new HomeFragment());
        homeTrans.commit();


        binding.bottomBar.setOnItemSelectedListener(i -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            switch (i) {
                case 0:
                    transaction.replace(R.id.fragment_container, new HomeFragment());
                    break;
                case 1:
                    transaction.replace(R.id.fragment_container, new SearchFragment());
                    break;
                case 2:
                    transaction.replace(R.id.fragment_container, new ProfileFragment());
                    break;
                case 3:
                    transaction.replace(R.id.fragment_container, new RestFragment());
                    break;
                case 4:
                    transaction.replace(R.id.fragment_container, new InfoFragment());
                    break;
            }
            transaction.commit();
            return false;
        });
    }
}


//        logOut = findViewById(R.id.logOut);

//        logOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut();
//                startActivity(new Intent(MainActivity.this, LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
//                finish();
//                overridePendingTransition(R.anim.slidein, R.anim.slideout);
//            }
//        });