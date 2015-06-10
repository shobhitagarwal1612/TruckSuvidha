package project.fourthpointer.in.truckSuvidha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import project.fourthpointer.in.truckSuvidha.adapter.TruckBoardAdapter;
import project.fourthpointer.in.truckssuvidha.R;


/**
 * Created by Kartikay on 10-Jun-15.
 */
public class TruckBoard extends Fragment {
    ArrayList<TruckBoardItem> listitem;
    TruckBoardItem items;
    ListView loadboardlist;
    TruckBoardAdapter madapter;
    View rootView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("MA", "onItemSelected Loar");
        rootView = inflater.inflate(R.layout.truckboard, container, false);
        listitem = new ArrayList<TruckBoardItem>();
        items = new TruckBoardItem();
        loadboardlist = (ListView) rootView.findViewById(R.id.truckboardListView);
        for (int i = 0; i < 10; i++) {
            items.setDestinationCity("Destination");
            items.setPostedBy("PostedBy");
            items.setpostingId("PostingId");
            items.setTruckType("TruckType");
            items.setSourceCity("Source CIty");
            items.setWeight("Weight");
            items.setScheduleDate("ScheduleDate");
            listitem.add(items);
        }
        madapter=new TruckBoardAdapter(getActivity(),listitem);
        loadboardlist.setAdapter(madapter);
        Log.d("MA", "onItemSelected Loar");
        return rootView;
    }
}
