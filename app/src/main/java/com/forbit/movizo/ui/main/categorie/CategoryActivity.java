package com.forbit.movizo.ui.main.categorie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.forbit.movizo.R;
import com.forbit.movizo.ui.main.popularVideos.PopularVideosFragment;
import com.forbit.movizo.utils.Constant;

public class CategoryActivity extends AppCompatActivity {

    private String title;
    PopularVideosFragment action,romantic,horror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        title = getIntent().getStringExtra(Constant.CATEGORY);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);

        action = (PopularVideosFragment) getSupportFragmentManager().findFragmentById(R.id.action_movies);
        romantic = (PopularVideosFragment) getSupportFragmentManager().findFragmentById(R.id.romantic_movies);
        horror = (PopularVideosFragment) getSupportFragmentManager().findFragmentById(R.id.horror_movies);

        action.setTitle("Action Movies");
        romantic.setTitle("Romantic Movies");
        horror.setTitle("Horror Movies");

    }
}
