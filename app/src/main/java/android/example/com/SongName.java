package android.example.com;

public class SongName {

    private String mSongName;

    private String mArtistName;

    public SongName(String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }
    /**
     * get song name
     *
     */
    public String getSongName(){
        return mSongName;
    }
    /**
     * get Artist name
     */
    public String getArtistName(){
        return mArtistName;
    }


}
