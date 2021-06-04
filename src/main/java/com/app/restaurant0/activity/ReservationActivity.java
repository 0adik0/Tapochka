package com.app.restaurant0.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.restaurant0.R;
import com.app.restaurant0.model.InfoRes;
import com.app.restaurant0.model.InfoUser;
import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ReservationActivity extends AppCompatActivity {

    DatabaseReference reference;
    FirebaseUser user;
    ImageView imgReser;
    TextView nameReser, phoneReser, streetReser, priceReser, descriptionReser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        getSupportActionBar().hide();

    }
}