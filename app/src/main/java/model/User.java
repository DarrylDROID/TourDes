package model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    String email_user, password_user;

    public User() {
        this.email_user = "";
        this.password_user = "";
    }

    public User(String email_user, String password_user) {
        this.email_user = email_user;
        this.password_user = password_user;
    }

    protected User(Parcel in) {
        email_user = in.readString();
        password_user = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {

        this.email_user = email_user;
    }

    public String getPassword_user() {

        return password_user;
    }

    public void setPassword_user(String password_user) {

        this.password_user = password_user;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email_user);
        dest.writeString(password_user);
    }
}
