package com.bignerdranch.android.draganddraw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sai pranesh on 06-Sep-16.
 */
public class DragAndDrawFragment extends Fragment {

    public static Fragment newInstance(){
        return new DragAndDrawFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_drag_and_draw,container,false);
        return view;
    }
}
