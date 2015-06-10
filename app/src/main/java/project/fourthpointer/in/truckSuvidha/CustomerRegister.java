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
public class CustomerRegister extends Fragment implements View.OnClickListener {
    android.support.v4.app.FragmentTransaction ft;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.customer_registration, container, false);
        Button company = (Button) rootView.findViewById(R.id.companyLogin);
        Button individual = (Button) rootView.findViewById(R.id.individualLogin);
        company.setOnClickListener(this);
        individual.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Fragment frag = null;
        switch (v.getId()) {
            case R.id.individualLogin:
                frag = new IndividualRegister();
                break;
            case R.id.companyLogin:
                frag = new CompanyRegister();
                break;
        }
        ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left,
                android.R.anim.slide_out_right);
        ft.replace(R.id.content_frame, frag, "sign in tag")
                .addToBackStack(null).commit();
    }
}

