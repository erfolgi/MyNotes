package erfolgi.com.mynotes.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ENGmodel implements Parcelable {
    private int id_eng;
    private String word_eng;
    private String mean_eng;

    protected ENGmodel(Parcel in) {
        id_eng = in.readInt();
        word_eng = in.readString();
        mean_eng = in.readString();
    }

    public static final Creator<ENGmodel> CREATOR = new Creator<ENGmodel>() {
        @Override
        public ENGmodel createFromParcel(Parcel in) {
            return new ENGmodel(in);
        }

        @Override
        public ENGmodel[] newArray(int size) {
            return new ENGmodel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id_eng);
        dest.writeString(word_eng);
        dest.writeString(mean_eng);
    }
}
