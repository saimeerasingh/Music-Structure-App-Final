package android.example.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SongNameAdapter extends ArrayAdapter<SongName> {

    public SongNameAdapter(@NonNull Context context, @NonNull List<SongName> pNames) {
        super(context, 0, pNames);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view,parent,false);
        }
        SongName local_name = getItem(position);
        TextView songsTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songsTextView.setText(local_name.getSongName());
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(local_name.getArtistName());

        return listItemView;
    }
}
