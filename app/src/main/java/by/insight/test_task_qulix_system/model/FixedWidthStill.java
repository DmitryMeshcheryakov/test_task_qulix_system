
package by.insight.test_task_qulix_system.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class FixedWidthStill implements Parcelable
{

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    public final static Creator<FixedWidthStill> CREATOR = new Creator<FixedWidthStill>() {



        public FixedWidthStill createFromParcel(Parcel in) {
            FixedWidthStill instance = new FixedWidthStill();
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.width = ((String) in.readValue((String.class.getClassLoader())));
            instance.height = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public FixedWidthStill[] newArray(int size) {
            return (new FixedWidthStill[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The width
     */
    public String getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    public String getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(width);
        dest.writeValue(height);
    }

    public int describeContents() {
        return  0;
    }

}
