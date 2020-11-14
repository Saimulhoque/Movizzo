package com.forbit.movizo.ui.kids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.forbit.movizo.ui.livetv.LiveTvActivity;
import com.forbit.movizo.R;
import com.forbit.movizo.ui.upcoming.UpcomingActivity;
import com.forbit.movizo.ui.main.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class KidsActivity extends AppCompatActivity {

    KidsAdapter kidsAdapter;
    RecyclerView recyclerView;
    List<Kids> kidsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);

        kidsList = new ArrayList<>();
        for (int i=0;i<100;i++){
            kidsList.add(new Kids(R.drawable.cartoon1, "Cartoon "+String.valueOf(i+1)));
        }

        recyclerView = findViewById(R.id.recyclerView);
        kidsAdapter = new KidsAdapter(this,kidsList);
        recyclerView.setAdapter(kidsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));



        //initialize and assign variable//
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomnavigation);

        //Set home selected//
        bottomNavigationView.setSelectedItemId(R.id.kids);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.upcoming:
                        startActivity(new Intent(getApplicationContext(), UpcomingActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.livetv:
                        startActivity(new Intent(getApplicationContext(), LiveTvActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.kids:
                        return true;
                }
                return false;
            }
        });
    }

    public void onBackPressed() {
        this.startActivity(new Intent(this,MainActivity.class));

        return;
    }
}