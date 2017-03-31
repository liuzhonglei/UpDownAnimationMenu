package com.zhh.updownanimationmenu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zhh.updownanimationmenu.R;


public class FourFragment extends Fragment {
    public static FourFragment newInstance() {
        return new FourFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout layout=new LinearLayout(getActivity());
        layout.setBackgroundResource(R.color.orange);
        return layout;
    }
}
