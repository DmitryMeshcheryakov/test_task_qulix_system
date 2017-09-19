
package by.insight.test_task_qulix_system.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Meta implements Parcelable
{

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("msg")
    @Expose
    private String msg;
    public final static Creator<Meta> CREATOR = new Creator<Meta>() {



        public Meta createFromParcel(Parcel in) {
            Meta instance = new Meta();
            instance.status = ((int) in.readValue((int.class.getClassLoader())));
            instance.msg = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Meta[] newArray(int size) {
            return (new Meta[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The status
     */
    public int getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(msg);
    }

    public int describeContents() {
        return  0;
    }

}
