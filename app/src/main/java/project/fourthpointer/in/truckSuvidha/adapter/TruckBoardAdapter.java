package project.fourthpointer.in.truckSuvidha.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import project.fourthpointer.in.truckSuvidha.TruckBoardItem;
import project.fourthpointer.in.truckssuvidha.R;


public class TruckBoardAdapter extends BaseAdapter {

    private ArrayList<TruckBoardItem> mSearchItems;
    private Context ctxt;
    public TruckBoardAdapter(Context context, ArrayList<TruckBoardItem> items) {
        this.mSearchItems = items;
        this.ctxt = context;
    }
    @Override
    public int getCount() {
        return mSearchItems.size();
    }
    @Override
    public Object getItem(int position) {
        return mSearchItems.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) ctxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.customadaptertruckboard, parent, false);
        }
        TruckBoardItem currentItem  = (TruckBoardItem) getItem(position);
        TextView posting = (TextView) convertView.findViewById(R.id.truckboardpostingId);
        TextView source = (TextView) convertView.findViewById(R.id.truckboardsourceCity);
        TextView destination = (TextView) convertView.findViewById(R.id.truckboarddestinationCity);
        TextView weight = (TextView) convertView.findViewById(R.id.truckboardweight);
        TextView scheduledate = (TextView) convertView.findViewById(R.id.truckboardscheduleDate);
        TextView trucktype = (TextView) convertView.findViewById(R.id.truckboardtruckType);
        TextView postedby = (TextView) convertView.findViewById(R.id.truckboardpostedBy);

        source.setText(currentItem.getSourceCity());
        destination.setText(currentItem.getDestinationCity());
        postedby.setText(currentItem.getPostedBy());
        posting.setText(currentItem.getPostingId());
        trucktype.setText(currentItem.getTruckType());
        weight.setText(currentItem.getWeight());
        scheduledate.setText(currentItem.getScheduleDate());
        return convertView;
    }
}

