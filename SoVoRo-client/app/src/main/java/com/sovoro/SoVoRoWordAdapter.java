package com.sovoro;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SoVoRoWordAdapter extends FragmentStateAdapter {
    public int mCount;
    public SoVoRoWordAdapter(@NonNull FragmentActivity fragmentActivity, int _mCount) {
        super(fragmentActivity);
        mCount=_mCount;
    }
//    public SoVoRoWordAdapter(@NonNull Fragment fragment) {
//        super(fragment);
//    }
//
//    public SoVoRoWordAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
//        super(fragmentManager, lifecycle);
//    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);
        switch (index) {
            case 0:
                return SoVoRoWordFragment1.newInstance("1","a");
            case 1:
                return SoVoRoWordFragment2.newInstance("2","b");
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2000;
    }
    public int getRealPosition(int position) { return position % mCount; }
}
