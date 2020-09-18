package android.example.com;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcasts);

        // Create an arrayList

        ArrayList<String> podCasts = new ArrayList<String>();
        podCasts.add("Science");
        podCasts.add("History");
        podCasts.add("Travel");
        podCasts.add("Food");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, podCasts);

        ListView listView = (ListView) findViewById(R.id.podCasts_rootView);
        listView.setAdapter(itemsAdapter);

    }

}
