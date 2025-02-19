package kt.module.base_module.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.DecimalFormat;
import java.util.List;

public class ChildEntity implements Parcelable {

    /**
     * id : 124
     * title : 巫帕迪
     * uname : 巫帕迪
     * avatar : http://rscdn.17mingxiang.com/Now/teacher/20190111163248-5c3854b0a36bb.jpg
     * type_description : now专业认证
     * url : http：//www.baidu.com11
     * status : 1
     * bgavatar : http://rscdn.17mingxiang.com/Now/banner/20190306181518-5c7f9db6552d4.jpg
     * tcount : 2
     * count : 5597
     * scount : 33
     * type : course
     * subtitle :
     * subtitle_new : 意大利静心冥想代表导师
     * title_img_new : http://rs.17mingxiang.com/Now/picture/new/wupadi.png
     * type_new : free
     * thumb_img :
     * ppp : 9262
     * splay_count : 20
     * play_count : 9282
     * small_num : 4
     */

    private int id;
    private String title;
    private String uname;
    private Object avatar;
    private List<String> avatars;
    private String type_description;
    private String url;
    private String img;
    private int status;
    private String bgavatar;
    private int tcount;
    private String count;
    private String scount;
    private String type;
    private String subtitle;
    private String subtitle_new;
    private String title_img_new;
    private String type_new;
    private String thumb_img;
    private int ppp;
    private int splay_count;
    private int play_count;
    private int small_num;

    private String content;
    private String start_time;
    private String end_time;
    private String bm_start_time;
    private String bm_end_time;
    private int num;
    private int day_num;
    private String created_at;
    private String updated_at;
    private int ka_num;
    private String can_created_at;
    private int buy_count;
    private int course_num;
    private String listen_users_count;
    private String img_new;
    private String tex;
    private int sequence;
    private int baoming;

    private String type_course;
    private String body_img_new;

    public String getBody_img_new() {
        return body_img_new;
    }

    public void setBody_img_new(String body_img_new) {
        this.body_img_new = body_img_new;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<String> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<String> avatars) {
        this.avatars = avatars;
    }

    public String getType_description() {
        return type_description;
    }

    public void setType_description(String type_description) {
        this.type_description = type_description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBgavatar() {
        return bgavatar;
    }

    public void setBgavatar(String bgavatar) {
        this.bgavatar = bgavatar;
    }

    public int getTcount() {
        return tcount;
    }

    public void setTcount(int tcount) {
        this.tcount = tcount;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getScount() {
        return scount;
    }

    public void setScount(String scount) {
        this.scount = scount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitle_new() {
        return subtitle_new;
    }

    public void setSubtitle_new(String subtitle_new) {
        this.subtitle_new = subtitle_new;
    }

    public String getTitle_img_new() {
        return title_img_new;
    }

    public void setTitle_img_new(String title_img_new) {
        this.title_img_new = title_img_new;
    }

    public String getType_new() {
        return type_new;
    }

    public void setType_new(String type_new) {
        this.type_new = type_new;
    }

    public String getThumb_img() {
        return thumb_img;
    }

    public void setThumb_img(String thumb_img) {
        this.thumb_img = thumb_img;
    }

    public int getPpp() {
        return ppp;
    }

    public void setPpp(int ppp) {
        this.ppp = ppp;
    }

    public int getSplay_count() {
        return splay_count;
    }

    public void setSplay_count(int splay_count) {
        this.splay_count = splay_count;
    }

    public int getPlay_count() {
        return play_count;
    }

    public void setPlay_count(int play_count) {
        this.play_count = play_count;
    }

    public int getSmall_num() {
        return small_num;
    }

    public void setSmall_num(int small_num) {
        this.small_num = small_num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    @Override
    public String toString() {
        return "ChildEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", uname='" + uname + '\'' +
                ", avatar=" + avatar +
                ", avatars=" + avatars +
                ", type_description='" + type_description + '\'' +
                ", url='" + url + '\'' +
                ", img='" + img + '\'' +
                ", status=" + status +
                ", bgavatar='" + bgavatar + '\'' +
                ", tcount=" + tcount +
                ", count='" + count + '\'' +
                ", scount='" + scount + '\'' +
                ", type='" + type + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", subtitle_new='" + subtitle_new + '\'' +
                ", title_img_new='" + title_img_new + '\'' +
                ", type_new='" + type_new + '\'' +
                ", thumb_img='" + thumb_img + '\'' +
                ", ppp=" + ppp +
                ", splay_count=" + splay_count +
                ", play_count=" + play_count +
                ", small_num=" + small_num +
                ", content='" + content + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", bm_start_time='" + bm_start_time + '\'' +
                ", bm_end_time='" + bm_end_time + '\'' +
                ", num=" + num +
                ", day_num=" + day_num +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", ka_num=" + ka_num +
                ", can_created_at='" + can_created_at + '\'' +
                ", buy_count=" + buy_count +
                ", course_num=" + course_num +
                ", listen_users_count='" + listen_users_count + '\'' +
                ", img_new='" + img_new + '\'' +
                ", tex='" + tex + '\'' +
                ", sequence=" + sequence +
                ", baoming=" + baoming +
                ", type_course='" + type_course + '\'' +
                '}';
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getBm_start_time() {
        return bm_start_time;
    }

    public void setBm_start_time(String bm_start_time) {
        this.bm_start_time = bm_start_time;
    }

    public String getBm_end_time() {
        return bm_end_time;
    }

    public void setBm_end_time(String bm_end_time) {
        this.bm_end_time = bm_end_time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDay_num() {
        return day_num;
    }

    public void setDay_num(int day_num) {
        this.day_num = day_num;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getKa_num() {
        return ka_num;
    }

    public void setKa_num(int ka_num) {
        this.ka_num = ka_num;
    }

    public String getCan_created_at() {
        return can_created_at;
    }

    public void setCan_created_at(String can_created_at) {
        this.can_created_at = can_created_at;
    }

    public String getImg_new() {
        return img_new;
    }

    public void setImg_new(String img_new) {
        this.img_new = img_new;
    }

    public String getTex() {
        return tex;
    }

    public void setTex(String tex) {
        this.tex = tex;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getBaoming() {
        return baoming;
    }

    public void setBaoming(int baoming) {
        this.baoming = baoming;
    }

    public String getType_course() {
        return type_course;
    }

    public void setType_course(String type_course) {
        this.type_course = type_course;
    }

    public static Creator<ChildEntity> getCREATOR() {
        return CREATOR;
    }

    protected ChildEntity(Parcel in) {
        id = in.readInt();
        title = in.readString();
        uname = in.readString();
        avatar = in.readString();
        avatars = in.createStringArrayList();
        type_description = in.readString();
        url = in.readString();
        img = in.readString();
        status = in.readInt();
        bgavatar = in.readString();
        tcount = in.readInt();
        count = in.readString();
        scount = in.readString();
        type = in.readString();
        subtitle = in.readString();
        subtitle_new = in.readString();
        title_img_new = in.readString();
        type_new = in.readString();
        thumb_img = in.readString();
        ppp = in.readInt();
        splay_count = in.readInt();
        play_count = in.readInt();
        small_num = in.readInt();
        content = in.readString();
        start_time = in.readString();
        end_time = in.readString();
        bm_start_time = in.readString();
        bm_end_time = in.readString();
        num = in.readInt();
        day_num = in.readInt();
        created_at = in.readString();
        updated_at = in.readString();
        ka_num = in.readInt();
        can_created_at = in.readString();
        buy_count = in.readInt();
        course_num = in.readInt();
        listen_users_count = in.readString();
        img_new = in.readString();
        tex = in.readString();
        sequence = in.readInt();
        baoming = in.readInt();
        type_course = in.readString();
    }

    public static final Creator<ChildEntity> CREATOR = new Creator<ChildEntity>() {
        @Override
        public ChildEntity createFromParcel(Parcel in) {
            return new ChildEntity(in);
        }

        @Override
        public ChildEntity[] newArray(int size) {
            return new ChildEntity[size];
        }
    };

    public int getCourse_num() {
        return course_num;
    }

    public void setCourse_num(int course_num) {
        this.course_num = course_num;
    }

    public String getListen_users_count() {
        return listen_users_count;
    }

    public void setListen_users_count(String listen_users_count) {
        this.listen_users_count = listen_users_count;
    }

    public String getListerCount(){
        String countStr;
        if (play_count>=10000){
            double countF=(play_count/10000.0);
            DecimalFormat decimalFormat=new DecimalFormat(".0");//构造方法的字符格式这里如果小数不足2位,会以0补足.
            countStr=decimalFormat.format(countF)+"万";
        }else {
            countStr=play_count+"";
        }
        return countStr;
    }


    public int getBuy_count() {
        return buy_count;
    }
    public String getBuyCountFormat(){
        String countStr;
        if (buy_count>=10000){
            double countF=(buy_count/10000.0);
            DecimalFormat decimalFormat=new DecimalFormat(".0");//构造方法的字符格式这里如果小数不足2位,会以0补足.
            countStr=decimalFormat.format(countF)+"万";
        }else {
            countStr=buy_count+"";
        }
        return countStr;
    }

    public void setBuy_count(int buy_count) {
        this.buy_count = buy_count;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

//    public String getListerCount(){
//        String countStr;
//        if (Integer.valueOf(count) >= 10000){
//            double countF = (Integer.valueOf(count)/10000.0);
//            DecimalFormat decimalFormat=new DecimalFormat(".00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
//            countStr=decimalFormat.format(countF)+"万";
//        }else {
//            countStr=count+"";
//        }
//        return countStr;
//    }


}
