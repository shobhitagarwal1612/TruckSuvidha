package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import project.fourthpointer.in.truckssuvidha.R;

/**
 * Created by Kartikay on 09-Jun-15.
 */
public class Home extends Fragment implements View.OnClickListener {
    View rootView;
    android.support.v4.app.FragmentTransaction ft;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.home, container, false);
        Button login = (Button) rootView.findViewById(R.id.btnSingIn);
        Button register = (Button) rootView.findViewById(R.id.btnRegister);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSingIn:
                ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setCustomAnimations(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                ft.replace(R.id.content_frame, new SignIn(), "sign in tag")
                        .addToBackStack(null).commit();
                break;
            case R.id.btnRegister:
                ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setCustomAnimations(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                ft.replace(R.id.content_frame, new Register(), "sign in tag")
                        .addToBackStack(null).commit();

        }

    }
}

