package sidespell.tech.solarsystem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        int imgdata[]={R.drawable.download,R.drawable.planeta,R.drawable.planetb,R.drawable.planetc,
                R.drawable.planetd,R.drawable.planete,R.drawable.planetf,R.drawable.venus,R.drawable.neptune};
        spinner.setOnItemSelectedListener(this);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onItemSelected(AdapterView<?> parent, View view,int pos, long id) {
        Toast.makeText(this, "The planet is " +
                parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


}
