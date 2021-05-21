package model;

import android.os.Parcel;
import android.os.Parcelable;

public class Destination implements Parcelable {

    String maintext, location, description;
    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Destination(int image, String maintext, String location, String description) {
        this.image = image;
        this.maintext = maintext;
        this.location = location;
        this.description = description;
    }

    protected Destination(Parcel in) {
        image = Integer.parseInt(in.readString());
        maintext = in.readString();
        location = in.readString();
        description = in.readString();
    }

    public static final Creator<Destination> CREATOR = new Creator<Destination>() {
        @Override
        public Destination createFromParcel(Parcel in) {
            return new Destination(in);
        }

        @Override
        public Destination[] newArray(int size) {
            return new Destination[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(String.valueOf(image));
        dest.writeString(maintext);
        dest.writeString(location);
        dest.writeString(description);
    }
}
