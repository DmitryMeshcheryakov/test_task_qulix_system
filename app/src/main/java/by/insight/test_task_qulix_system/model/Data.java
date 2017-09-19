
package by.insight.test_task_qulix_system.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data implements Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bitly_gif_url")
    @Expose
    private String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    private String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_tld")
    @Expose
    private String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("import_datetime")
    @Expose
    private String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    private String trendingDatetime;
    @SerializedName("images")
    @Expose
    private Images images;
    public final static Creator<Data> CREATOR = new Creator<Data>() {



        public Data createFromParcel(Parcel in) {
            Data instance = new Data();
            instance.type = ((String) in.readValue((String.class.getClassLoader())));
            instance.id = ((String) in.readValue((String.class.getClassLoader())));
            instance.slug = ((String) in.readValue((String.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.bitlyGifUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.bitlyUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.embedUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.username = ((String) in.readValue((String.class.getClassLoader())));
            instance.source = ((String) in.readValue((String.class.getClassLoader())));
            instance.rating = ((String) in.readValue((String.class.getClassLoader())));
            instance.caption = ((String) in.readValue((String.class.getClassLoader())));
            instance.contentUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.sourceTld = ((String) in.readValue((String.class.getClassLoader())));
            instance.sourcePostUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.importDatetime = ((String) in.readValue((String.class.getClassLoader())));
            instance.trendingDatetime = ((String) in.readValue((String.class.getClassLoader())));
            instance.images = ((Images) in.readValue((Images.class.getClassLoader())));
            return instance;
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    }
    ;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

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
     *     The bitlyGifUrl
     */
    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    /**
     * 
     * @param bitlyGifUrl
     *     The bitly_gif_url
     */
    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    /**
     * 
     * @return
     *     The bitlyUrl
     */
    public String getBitlyUrl() {
        return bitlyUrl;
    }

    /**
     * 
     * @param bitlyUrl
     *     The bitly_url
     */
    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    /**
     * 
     * @return
     *     The embedUrl
     */
    public String getEmbedUrl() {
        return embedUrl;
    }

    /**
     * 
     * @param embedUrl
     *     The embed_url
     */
    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * 
     * @param contentUrl
     *     The content_url
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * 
     * @return
     *     The sourceTld
     */
    public String getSourceTld() {
        return sourceTld;
    }

    /**
     * 
     * @param sourceTld
     *     The source_tld
     */
    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
    }

    /**
     * 
     * @return
     *     The sourcePostUrl
     */
    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    /**
     * 
     * @param sourcePostUrl
     *     The source_post_url
     */
    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }

    /**
     * 
     * @return
     *     The importDatetime
     */
    public String getImportDatetime() {
        return importDatetime;
    }

    /**
     * 
     * @param importDatetime
     *     The import_datetime
     */
    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    /**
     * 
     * @return
     *     The trendingDatetime
     */
    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    /**
     * 
     * @param trendingDatetime
     *     The trending_datetime
     */
    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Images images) {
        this.images = images;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(id);
        dest.writeValue(slug);
        dest.writeValue(url);
        dest.writeValue(bitlyGifUrl);
        dest.writeValue(bitlyUrl);
        dest.writeValue(embedUrl);
        dest.writeValue(username);
        dest.writeValue(source);
        dest.writeValue(rating);
        dest.writeValue(caption);
        dest.writeValue(contentUrl);
        dest.writeValue(sourceTld);
        dest.writeValue(sourcePostUrl);
        dest.writeValue(importDatetime);
        dest.writeValue(trendingDatetime);
        dest.writeValue(images);
    }

    public int describeContents() {
        return  0;
    }

}
