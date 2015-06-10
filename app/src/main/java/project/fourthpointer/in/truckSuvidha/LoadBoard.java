package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import project.fourthpointer.in.truckSuvidha.adapter.LoadClassAdapter;
import project.fourthpointer.in.truckssuvidha.R;

/**
 * Created by Kartikay on 10-Jun-15.
 */
public class LoadBoard extends Fragment {
    ArrayList<LoadClassItem> listitem;
    LoadClassItem items;
    ListView loadboardlist;
    LoadClassAdapter madapter;
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("MA", "onItemSelected Loar");
        rootView = inflater.inflate(R.layout.loadboard, container, false);
        listitem = new ArrayList<LoadClassItem>();
        items = new LoadClassItem();
        loadboardlist = (ListView) rootView.findViewById(R.id.loadboardListView);
        for (int i = 0; i < 10; i++) {
            items.setDestinationCity("Destination");
            items.setDistance("Distance");
            items.setMaterial("Material");
            items.setPostedBy("PostedBy");
            items.setpostingId("PostingId");
            items.setRegister("Register");
            items.setTruckType("TruckType");
            items.setSourceCity("Source CIty");
            items.setDestinationCity("DestinationCity");
            items.setWeight("Weight");
            listitem.add(items);
        }
        madapter=new LoadClassAdapter(getActivity(),listitem);
        loadboardlist.setAdapter(madapter);
        Log.d("MA", "onItemSelected Loar");

        return rootView;
    }
}
