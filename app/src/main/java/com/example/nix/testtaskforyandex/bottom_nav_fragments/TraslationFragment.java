package com.example.nix.testtaskforyandex.bottom_nav_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.nix.testtaskforyandex.R;

/**
 * Created by Nix on 06.10.2017.
 */

public class TraslationFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.translator_fragment_layout, container, false);
        return v;
    }
}
