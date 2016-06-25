package example.com.retrofit.model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by weihuajian on 16/6/22.
 */
public class TestModel implements Serializable {


    /**
     * count : 0
     * description : “这有一定的随机性，如果一只燕子刚好发现这里气温合适，通风比较好，食物充足，又没人打扰，就会让同伴都到这里来
     * fcount : 0
     * fromname : 中国青年网
     * fromurl : http://news.youth.cn/kj/201606/t20160622_8169789_4.htm
     * id : 11133
     * img : /top/default.jpg
     * keywords : 万只燕子齐聚电线
     * rcount : 0
     * time : 1466562669000
     * title : 万只燕子齐聚电线 保持相等间距似训练有素
     * topclass : 0
     */

    @SerializedName("count")
    private int count;
    @SerializedName("description")
    private String description;
    @SerializedName("fcount")
    private int fcount;
    @SerializedName("fromname")
    private String fromname;
    @SerializedName("fromurl")
    private String fromurl;
    @SerializedName("id")
    private int id;
    @SerializedName("img")
    private String img;
    @SerializedName("keywords")
    private String keywords;
    @SerializedName("rcount")
    private int rcount;
    @SerializedName("time")
    private long time;
    @SerializedName("title")
    private String title;
    @SerializedName("topclass")
    private int topclass;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFcount() {
        return fcount;
    }

    public void setFcount(int fcount) {
        this.fcount = fcount;
    }

    public String getFromname() {
        return fromname;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname;
    }

    public String getFromurl() {
        return fromurl;
    }

    public void setFromurl(String fromurl) {
        this.fromurl = fromurl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getRcount() {
        return rcount;
    }

    public void setRcount(int rcount) {
        this.rcount = rcount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTopclass() {
        return topclass;
    }

    public void setTopclass(int topclass) {
        this.topclass = topclass;
    }
}
