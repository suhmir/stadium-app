package edu.spandit3.mysoccerstadiums;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.annotation.NonNull;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return TileFragment.newInstance();
        } else if (position == 2) {
            return CardFragment.newInstance();
        } else {
            return ListFragment.newInstance();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
