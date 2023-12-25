package edu.spandit3.mysoccerstadiums;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import edu.spandit3.mysoccerstadiums.databinding.ActivityDetailBinding;

import java.util.List;
import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";
    private final List<Location> locations = DataInitializer.getData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = binding.collapsingToolbar;

        int position = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Location location = locations.get(position);

        ImageView imageView = binding.detailImage;
        imageView.setImageResource(location.getImageID());

        collapsingToolbarLayout.setTitle(location.getName());
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);

        TextView description = binding.detailDescription;
        description.setText(location.getDescription());

        TextView detailLocation = binding.detailLocation;
        detailLocation.setText(location.getLocation());






    }
}
