package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import project.fourthpointer.in.truckssuvidha.R;

/**
 * Created by Shobhit Agarwal on 10-06-2015.
 */
public class Register extends Fragment implements View.OnClickListener {
    View rootView;
    Fragment frag;
    String tag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.register, container, false);
        Button reg1 = (Button) rootView.findViewById(R.id.reg1);
        Button reg2 = (Button) rootView.findViewById(R.id.reg2);
        Button reg3 = (Button) rootView.findViewById(R.id.reg3);
        reg1.setOnClickListener(this);
        reg2.setOnClickListener(this);
        reg3.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.reg1:
                frag = new TransporterRegister();
                tag = "T";
                break;
            case R.id.reg2:
                frag = new CustomerRegister();
                tag = "C";
                break;
            case R.id.reg3:
                frag = new PackersAndMoversRegister();
                tag = "P";
                break;
        }
            android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(android.R.anim.slide_in_left,
                    android.R.anim.slide_out_right);
            ft.replace(R.id.content_frame, frag, "register tag")
                    .addToBackStack(null).commit();
    }

}
