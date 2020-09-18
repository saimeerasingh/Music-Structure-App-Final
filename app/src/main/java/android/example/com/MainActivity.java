package android.example.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the music category
        TextView music = (TextView) findViewById(R.id.music_view);

        // Set a click listener on that View
        music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the music category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MusicActivity}
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);

                // Start the new activity
                startActivity(musicIntent);
            }
        });
        // Find the View that shows the Play List category
        TextView playList = (TextView) findViewById(R.id.playList_view);

        // Set a click listener on that View
        playList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play List category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayListActivity}
                Intent playListIntent = new Intent(MainActivity.this, PlayListActivity.class);

                // Start the new activity
                startActivity(playListIntent);
            }
        });
        // Find the View that shows the Podcasts category
        TextView podCast = (TextView) findViewById(R.id.podCast_view);

        // Set a click listener on that View
        podCast.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcast category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PodcastsActivity}
                Intent podCastIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podCastIntent);
            }
        });
    }
}