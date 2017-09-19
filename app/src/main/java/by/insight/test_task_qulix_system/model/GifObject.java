
package by.insight.test_task_qulix_system.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GifObject implements Parcelable
{

    @SerializedName("data")
    @Expose
    private List<Data> data;

    @SerializedName("meta")
    @Expose
    private Meta meta;
    public final static Creator<GifObject> CREATOR = new Creator<GifObject>() {



        public GifObject createFromParcel(Parcel in) {
            GifObject instance = new GifObject();
            instance.data = (List<Data>) in.readValue((Data.class.getClassLoader()));
            instance.meta = ((Meta) in.readValue((Meta.class.getClassLoader())));
            return instance;
        }

        public GifObject[] newArray(int size) {
            return (new GifObject[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The data
     */
    public List<Data> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(Data data) {
        this.data = (List<Data>) data;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(data);
        dest.writeValue(meta);
    }

    public int describeContents() {
        return  0;
    }

}
