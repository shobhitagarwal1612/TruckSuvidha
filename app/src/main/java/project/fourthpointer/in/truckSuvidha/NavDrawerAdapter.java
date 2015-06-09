package project.fourthpointer.in.truckSuvidha;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import project.fourthpointer.in.truckssuvidha.R;

public class NavDrawerAdapter extends BaseAdapter {
    private ArrayList<NavDrawerItem> navDrawerItems;
    private Context context;
    public NavDrawerAdapter(Context context, ArrayList<NavDrawerItem>
            navDrawerItems) {
        this.context = context;
        this.navDrawerItems = navDrawerItems;
    }
    @Override
    public int getCount() {
        return navDrawerItems.size();
    }
    @Override
    public Object getItem(int arg0) {
        return navDrawerItems.get(arg0);
    }
    @Override
    public long getItemId(int arg0) {
        return arg0;
    }
    @Override
    public View getView(int arg0, View view, ViewGroup parent) {
        if (view == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = mInflater.inflate(R.layout.drawer_list_item, null);
        }

        TextView itemTxt = (TextView) view.findViewById(R.id.item);
        itemTxt.setText(navDrawerItems.get(arg0).getName());
        return view;
    }
}