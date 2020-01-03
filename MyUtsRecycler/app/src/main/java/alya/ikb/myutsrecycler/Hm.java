package alya.ikb.myutsrecycler;

import android.os.Parcel;
import android.os.Parcelable;

public class Hm implements Parcelable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String description;
    private String photo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(photo);
    }

    Hm(){

    }

    private Hm(Parcel in) {
        name = in.readString();
        description = in.readString();
        photo = in.readString();
    }

    public static final Parcelable.Creator<Hm> CREATOR = new Parcelable.Creator<Hm>() {
        @Override
        public Hm createFromParcel(Parcel source) {
            return new Hm(source);
        }

        @Override
        public Hm[] newArray(int size) {
            return new Hm[size];
        }
    };
}
