package android.example.com;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        // Create an arrayList

        ArrayList<SongName> songs = new ArrayList<SongName>();
        songs.add(new SongName("Cheap Thrills", "SIA"));
        songs.add(new SongName("Shape of You", "Ed Sheeran"));
        songs.add(new SongName("Thinking out Loud", "Ed Sheeran"));
        songs.add(new SongName("Hello from the", "Adele"));
        songs.add(new SongName("Closer", "ChainSmokers"));
        songs.add(new SongName("Love me like you do!", "Ellie Goulding"));
        songs.add(new SongName("You're Beautiful", "One Direction"));
        songs.add(new SongName("All of You", "John Legend"));
        songs.add(new SongName("Love Story", "Taylor Swift"));
        songs.add(new SongName("Something just like this",
                "ColdPlay ft ChainSmokers"));

       SongNameAdapter nameAdapter  = new SongNameAdapter(this,songs);

        ListView listView = (ListView) findViewById(R.id.music_rootView);
        listView.setAdapter(nameAdapter);



    }
}