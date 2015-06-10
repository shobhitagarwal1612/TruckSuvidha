package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import project.fourthpointer.in.truckssuvidha.R;

public class DistanceCalculator extends Fragment {
    double lat, lng;
    Button rideNow, rideLater, searchdestination, searchboarding;
    String editedText = "";
    View rootView;
    SupportMapFragment fragment;
    android.support.v4.app.FragmentTransaction fragTransaction;
    private GoogleMap map;
    private LatLng loc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.distance_calculator, container, false);
        getActivity().setTitle("Home");
        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        android.support.v4.app.FragmentManager fManager = getChildFragmentManager();
        fragment = (SupportMapFragment) fManager.findFragmentById(R.id.map);
        if (fragment == null) {
            fragment = SupportMapFragment.newInstance();
            fManager.beginTransaction().replace(R.id.map, fragment).commit();
        }
    }

    private void initializeMap() {
        if (map == null)
            map = ((SupportMapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
        CameraPosition camPos = new CameraPosition.Builder()

                .target(new LatLng(28.6139, 77.2090))

                .zoom(12.8f)

                .build();

        CameraUpdate camUpdate = CameraUpdateFactory.newCameraPosition(camPos);

        map.moveCamera(camUpdate);
        map.clear();
        map.setMyLocationEnabled(true);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        if (map == null) {
            map = fragment.getMap();
            map.addMarker(new MarkerOptions().position(new LatLng(0, 0)));
        }
        initializeMap();
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }
}
