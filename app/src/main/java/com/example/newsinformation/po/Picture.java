package com.example.newsinformation.po;

import android.os.Parcel;
import android.os.Parcelable;

public class Picture implements Parcelable{
    private String _id,author,createdAt,likeCounts,publishedAt,title,url,views;

    @Override
    public String toString() {
        return "Picture{" +
                "id='" + _id + '\'' +
                ", author='" + author + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", likeCounts='" + likeCounts + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", views='" + views + '\'' +
                '}';
    }

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(String likeCounts) {
        this.likeCounts = likeCounts;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(_id);
        parcel.writeString(author);
        parcel.writeString(createdAt);
        parcel.writeString(likeCounts);
        parcel.writeString(publishedAt);
        parcel.writeString(title);
        parcel.writeString(url);
        parcel.writeString(views);
    }

    public static final Parcelable.Creator<Picture> CREATOR = new Parcelable.Creator(){

        @Override
        public Picture createFromParcel(Parcel source) {
            // TODO Auto-generated method stub
            // 必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
            Picture p = new Picture();
            p.setId(source.readString());
            p.setAuthor(source.readString());
            p.setCreatedAt(source.readString());
            p.setLikeCounts(source.readString());
            p.setPublishedAt(source.readString());
            p.setTitle(source.readString());
            p.setUrl(source.readString());
            p.setViews(source.readString());
            return p;
        }

        @Override
        public Picture[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Picture[size];
        }
    };
}
