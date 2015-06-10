package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import project.fourthpointer.in.truckssuvidha.R;

/**
 * Created by Shobhit Agarwal on 10-06-2015.
 */
public class TransporterRegister extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.transporter_registration, container, false);
        return rootView;
    }
}
