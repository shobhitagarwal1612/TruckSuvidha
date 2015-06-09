package project.fourthpointer.in.truckSuvidha;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import project.fourthpointer.in.truckssuvidha.R;

public class CustomerRegistration extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration);
        TabHost tabHost = getTabHost(); // Tab for Photos
        TabHost.TabSpec individual = tabHost.newTabSpec("Individual");
        Intent photosIntent = new Intent(this, IndividualRegister.class);
        individual.setContent(photosIntent);
        TabHost.TabSpec company = tabHost.newTabSpec("Company");
        Intent songsIntent = new Intent(this, CompanyRegister.class);
        company.setContent(songsIntent);
        tabHost.addTab(individual);
        tabHost.addTab(company);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_customer_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
