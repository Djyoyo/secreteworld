package com.credosys.solutions.secrect.world.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import  android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.credosys.solutions.secrect.world.R;

/**
 * Created by win7 on 23-Dec-17.
 */

public class MyDiaryFragment extends Fragment {
    public static Fragment newInstance() {
        return new MyDiaryFragment();
    }
    public MyDiaryFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mydiary,null,false);
        return v;
    }
}
