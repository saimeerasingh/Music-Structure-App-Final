package android.example.com;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);


        // Create an arrayList

        ArrayList<String> playList = new ArrayList<String>();
        playList.add("Gym");
        playList.add("Running");
        playList.add("Relax");
        playList.add("Love");
        playList.add("Retro");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, playList);

        ListView listView = (ListView) findViewById(R.id.playList_rootView);
        listView.setAdapter(itemsAdapter);


    }
}