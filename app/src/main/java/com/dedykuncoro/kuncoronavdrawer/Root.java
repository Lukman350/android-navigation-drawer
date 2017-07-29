package com.dedykuncoro.kuncoronavdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kuncoro on 22/03/2016.
 */
public class Root extends Fragment {

    public Root(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.root, container, false);

        getActivity().setTitle("Kuncoro Nav Drawer");
        Log.e("Root", "Kuncoro Nav Drawer");

        return rootView;
    }
}
