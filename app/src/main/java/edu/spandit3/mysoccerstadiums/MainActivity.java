package edu.spandit3.mysoccerstadiums;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

import edu.spandit3.mysoccerstadiums.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    List<String> titles = Arrays.asList("List", "Tile", "Card");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(binding.toolbar);

        ViewPager2 viewPager = binding.viewPager;
        ViewPagerAdapter adapter = createCardAdapter();
        viewPager.setAdapter(adapter);

        TabLayout tabs = binding.tabs;
        new TabLayoutMediator(tabs, viewPager, (tab, position) -> tab.setText(titles.get(position))).attach();

        binding.fab.setOnClickListener(view -> {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        });
    }

    private ViewPagerAdapter createCardAdapter() {
        return new ViewPagerAdapter(this);
    }
}
