package project.fourthpointer.in.truckSuvidha;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;

import java.net.MalformedURLException;
import java.util.ArrayList;

import project.fourthpointer.in.truckssuvidha.R;

public class MainActivity extends ActionBarActivity {
    private ActionBar mActionBar;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerListView;
    private String[] mDrawerNames;
    private ArrayList<NavDrawerItem> navDrawerItems = new ArrayList<NavDrawerItem>();
    private FragmentManager fm;
    private FragmentTransaction ft;
    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private Resources mResources;
    private final static String TAG_EVENTS = "event tag";
    private Fragment frag;
    private String tag,previousTag, previousTitle;
    private boolean isDrawerOpen = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActionBar = getSupportActionBar();
        mResources = getResources();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerListView = (ListView) findViewById(R.id.drawer_list);
        mDrawerNames = mResources.getStringArray(R.array.listItems);
        mActionBar.setHomeButtonEnabled(true);
        mActionBar.setDisplayHomeAsUpEnabled(true);
        for (int i = 0; i < mDrawerNames.length; i = i + 1) {
            navDrawerItems.add(new NavDrawerItem(mDrawerNames[i]));
        }
        NavDrawerAdapter mDrawerAdapter = new NavDrawerAdapter(this, navDrawerItems);
        mDrawerListView.setAdapter(mDrawerAdapter);
        mDrawerListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d("MA", "onItemSelected");
                mDrawerLayout.closeDrawers();
                try {
                    itemSelected(position);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.hello_world, R.string.hello_world) {
            @Override
            public void onDrawerOpened(View view) {
                previousTitle = (String) getTitle();
                setTitle("AutoRikshawAutomation");
                Fragment frag = getSupportFragmentManager().findFragmentById(
                        R.id.content_frame);
                if (frag != null)
                    previousTag = frag.getTag();
                isDrawerOpen = true;
                super.onDrawerOpened(view);
            }

            @Override
            public void onDrawerClosed(View view) {
                String current_tag = "";
                current_tag = getSupportFragmentManager().findFragmentById(
                        R.id.content_frame).getTag();
                isDrawerOpen = false;
                if (current_tag.equals(previousTag)) {
                    setTitle(previousTitle);
                }
            }
        };
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
        //method to check connectivity
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.setCustomAnimations(android.R.anim.slide_in_left,
                android.R.anim.slide_out_right);
        ft.add(R.id.content_frame, new Home(), TAG_EVENTS)
                .addToBackStack(null).commit();
    }

    private void itemSelected(int pos) throws InterruptedException, MalformedURLException, JSONException {
        switch (pos) {
            case 0:
                frag = new Home();
                tag = "Home";
                break;
            default:
                frag = null;
                Toast.makeText(this, "Clicked On default", Toast.LENGTH_SHORT).show();
                break;
        }
        if (frag != null) {
            fm.findFragmentById(R.id.content_frame).getTag();
            {
                ft = fm.beginTransaction();
                ft.setCustomAnimations(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                ft.replace(R.id.content_frame, frag, tag).addToBackStack(null)
                        .commit();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mActionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (isDrawerOpen)
            mDrawerLayout.closeDrawers();
        }
   }
