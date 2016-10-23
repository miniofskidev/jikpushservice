package jik.android.jikpushservices.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tosantechnolocal on 10/23/2016.
 */
public class SampleModel {

    @SerializedName("userID")
    private int userID;

    @SerializedName("id")
    private int ID;

    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    public SampleModel(int userID, int ID, String title, String body) {
        this.userID = userID;
        this.ID = ID;
        this.title = title;
        this.body = body;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
