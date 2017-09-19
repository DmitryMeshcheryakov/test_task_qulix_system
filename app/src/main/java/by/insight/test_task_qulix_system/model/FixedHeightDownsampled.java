
package by.insight.test_task_qulix_system.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class FixedHeightDownsampled implements Parcelable
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
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("webp")
    @Expose
    private String webp;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;
    public final static Creator<FixedHeightDownsampled> CREATOR = new Creator<FixedHeightDownsampled>() {



        public FixedHeightDownsampled createFromParcel(Parcel in) {
            FixedHeightDownsampled instance = new FixedHeightDownsampled();
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.width = ((String) in.readValue((String.class.getClassLoader())));
            instance.height = ((String) in.readValue((String.class.getClassLoader())));
            instance.size = ((String) in.readValue((String.class.getClassLoader())));
            instance.webp = ((String) in.readValue((String.class.getClassLoader())));
            instance.webpSize = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public FixedHeightDownsampled[] newArray(int size) {
            return (new FixedHeightDownsampled[size]);
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

    /**
     * 
     * @return
     *     The size
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The webp
     */
    public String getWebp() {
        return webp;
    }

    /**
     * 
     * @param webp
     *     The webp
     */
    public void setWebp(String webp) {
        this.webp = webp;
    }

    /**
     * 
     * @return
     *     The webpSize
     */
    public String getWebpSize() {
        return webpSize;
    }

    /**
     * 
     * @param webpSize
     *     The webp_size
     */
    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(size);
        dest.writeValue(webp);
        dest.writeValue(webpSize);
    }

    public int describeContents() {
        return  0;
    }

}
