
package by.insight.test_task_qulix_system.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Images implements Parcelable
{

    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;

    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;

    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;

    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;

    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;

    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;

    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;

    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;

    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;

    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;

    @SerializedName("downsized")
    @Expose
    private Downsized downsized;

    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;

    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;

    @SerializedName("original")
    @Expose
    private Original original;

    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;

    public final static Creator<Images> CREATOR = new Creator<Images>() {



        public Images createFromParcel(Parcel in) {
            Images instance = new Images();
            instance.fixedHeight = ((FixedHeight) in.readValue((FixedHeight.class.getClassLoader())));
            instance.fixedHeightStill = ((FixedHeightStill) in.readValue((FixedHeightStill.class.getClassLoader())));
            instance.fixedHeightDownsampled = ((FixedHeightDownsampled) in.readValue((FixedHeightDownsampled.class.getClassLoader())));
            instance.fixedWidth = ((FixedWidth) in.readValue((FixedWidth.class.getClassLoader())));
            instance.fixedWidthStill = ((FixedWidthStill) in.readValue((FixedWidthStill.class.getClassLoader())));
            instance.fixedWidthDownsampled = ((FixedWidthDownsampled) in.readValue((FixedWidthDownsampled.class.getClassLoader())));
            instance.fixedHeightSmall = ((FixedHeightSmall) in.readValue((FixedHeightSmall.class.getClassLoader())));
            instance.fixedHeightSmallStill = ((FixedHeightSmallStill) in.readValue((FixedHeightSmallStill.class.getClassLoader())));
            instance.fixedWidthSmall = ((FixedWidthSmall) in.readValue((FixedWidthSmall.class.getClassLoader())));
            instance.fixedWidthSmallStill = ((FixedWidthSmallStill) in.readValue((FixedWidthSmallStill.class.getClassLoader())));
            instance.downsized = ((Downsized) in.readValue((Downsized.class.getClassLoader())));
            instance.downsizedStill = ((DownsizedStill) in.readValue((DownsizedStill.class.getClassLoader())));
            instance.downsizedLarge = ((DownsizedLarge) in.readValue((DownsizedLarge.class.getClassLoader())));
            instance.original = ((Original) in.readValue((Original.class.getClassLoader())));
            instance.originalStill = ((OriginalStill) in.readValue((OriginalStill.class.getClassLoader())));
            return instance;
        }

        public Images[] newArray(int size) {
            return (new Images[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The fixedHeight
     */
    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    /**
     * 
     * @param fixedHeight
     *     The fixed_height
     */
    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    /**
     * 
     * @return
     *     The fixedHeightStill
     */
    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    /**
     * 
     * @param fixedHeightStill
     *     The fixed_height_still
     */
    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    /**
     * 
     * @return
     *     The fixedHeightDownsampled
     */
    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    /**
     * 
     * @param fixedHeightDownsampled
     *     The fixed_height_downsampled
     */
    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    /**
     * 
     * @return
     *     The fixedWidth
     */
    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    /**
     * 
     * @param fixedWidth
     *     The fixed_width
     */
    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    /**
     * 
     * @return
     *     The fixedWidthStill
     */
    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    /**
     * 
     * @param fixedWidthStill
     *     The fixed_width_still
     */
    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    /**
     * 
     * @return
     *     The fixedWidthDownsampled
     */
    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    /**
     * 
     * @param fixedWidthDownsampled
     *     The fixed_width_downsampled
     */
    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    /**
     * 
     * @return
     *     The fixedHeightSmall
     */
    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    /**
     * 
     * @param fixedHeightSmall
     *     The fixed_height_small
     */
    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    /**
     * 
     * @return
     *     The fixedHeightSmallStill
     */
    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    /**
     * 
     * @param fixedHeightSmallStill
     *     The fixed_height_small_still
     */
    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    /**
     * 
     * @return
     *     The fixedWidthSmall
     */
    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    /**
     * 
     * @param fixedWidthSmall
     *     The fixed_width_small
     */
    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    /**
     * 
     * @return
     *     The fixedWidthSmallStill
     */
    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    /**
     * 
     * @param fixedWidthSmallStill
     *     The fixed_width_small_still
     */
    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    /**
     * 
     * @return
     *     The downsized
     */
    public Downsized getDownsized() {
        return downsized;
    }

    /**
     * 
     * @param downsized
     *     The downsized
     */
    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    /**
     * 
     * @return
     *     The downsizedStill
     */
    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    /**
     * 
     * @param downsizedStill
     *     The downsized_still
     */
    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    /**
     * 
     * @return
     *     The downsizedLarge
     */
    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    /**
     * 
     * @param downsizedLarge
     *     The downsized_large
     */
    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    /**
     * 
     * @return
     *     The original
     */
    public Original getOriginal() {
        return original;
    }

    /**
     * 
     * @param original
     *     The original
     */
    public void setOriginal(Original original) {
        this.original = original;
    }

    /**
     * 
     * @return
     *     The originalStill
     */
    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    /**
     * 
     * @param originalStill
     *     The original_still
     */
    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(fixedHeight);
        dest.writeValue(fixedHeightStill);
        dest.writeValue(fixedHeightDownsampled);
        dest.writeValue(fixedWidth);
        dest.writeValue(fixedWidthStill);
        dest.writeValue(fixedWidthDownsampled);
        dest.writeValue(fixedHeightSmall);
        dest.writeValue(fixedHeightSmallStill);
        dest.writeValue(fixedWidthSmall);
        dest.writeValue(fixedWidthSmallStill);
        dest.writeValue(downsized);
        dest.writeValue(downsizedStill);
        dest.writeValue(downsizedLarge);
        dest.writeValue(original);
        dest.writeValue(originalStill);
    }

    public int describeContents() {
        return  0;
    }

}
