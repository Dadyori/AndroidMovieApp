package kr.teamcadi.movieapp;

public class ReviewItem {
    String id;
    String time;
    String review;
    String like;

    public ReviewItem(String id, String time, String review, String like) {
        this.id = id;
        this.time = time;
        this.review = review;
        this.like = like;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "ReviewItem{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", review='" + review + '\'' +
                ", like='" + like + '\'' +
                '}';
    }
}
