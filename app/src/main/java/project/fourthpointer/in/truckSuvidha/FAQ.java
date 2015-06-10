package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import project.fourthpointer.in.truckssuvidha.R;

/**
 * Created by Shobhit Agarwal on 10-06-2015.
 */
public class FAQ extends android.support.v4.app.Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.directory, container, false);
        return rootView;
    }
}
