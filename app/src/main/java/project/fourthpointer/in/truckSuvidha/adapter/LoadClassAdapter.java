package project.fourthpointer.in.truckSuvidha.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import project.fourthpointer.in.truckSuvidha.LoadClassItem;
import project.fourthpointer.in.truckssuvidha.R;


public class LoadClassAdapter extends BaseAdapter {

    private ArrayList<LoadClassItem> mSearchItems;
    private Context ctxt;
    public LoadClassAdapter(Context context, ArrayList<LoadClassItem> items) {
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
            convertView = inflater.inflate(R.layout.customadapter, parent, false);
        }
        LoadClassItem currentItem  = (LoadClassItem) getItem(position);
        TextView posting = (TextView) convertView.findViewById(R.id.postingId);
        TextView source = (TextView) convertView.findViewById(R.id.sourceCity);
        TextView destination = (TextView) convertView.findViewById(R.id.destinationCity);
        TextView distance = (TextView) convertView.findViewById(R.id.distance);
        TextView weight = (TextView) convertView.findViewById(R.id.weight);
        TextView scheduledate = (TextView) convertView.findViewById(R.id.scheduleDate);
        TextView material = (TextView) convertView.findViewById(R.id.material);
        TextView trucktype = (TextView) convertView.findViewById(R.id.truckType);
        TextView postedby = (TextView) convertView.findViewById(R.id.postedBy);
        TextView register = (TextView) convertView.findViewById(R.id.register);

        source.setText(currentItem.getSourceCity());
        destination.setText(currentItem.getDestinationCity());
        postedby.setText(currentItem.getPostedBy());
        posting.setText(currentItem.getPostingId());
        material.setText(currentItem.getMaterial());
        trucktype.setText(currentItem.getTruckType());
        register.setText(currentItem.getRegister());
        weight.setText(currentItem.getWeight());
        scheduledate.setText(currentItem.getScheduleDate());
        distance.setText(currentItem.getDistance());

        return convertView;
    }
}

