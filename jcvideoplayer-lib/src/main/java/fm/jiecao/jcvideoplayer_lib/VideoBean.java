package fm.jiecao.jcvideoplayer_lib;

/**
 *
 * 作者：陈东
 * Github.com/chendongde310
 * 日期：2017/3/9 - 下午4:03
 *
 */

public class VideoBean {

    String videoUrl;//视频地址
    String imgUrl;// 图片地址
    String title;// 标题
    String describe;// 描述


    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


    public VideoBean(String videoUrl, String imgUrl, String title) {
        this.videoUrl = videoUrl;
        this.imgUrl = imgUrl;
        this.title = title;
    }

    public VideoBean() {

    }

    @Override
    public String toString() {
        return "VideoBean{" +
                "videoUrl='" + videoUrl + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", title='" + title + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
