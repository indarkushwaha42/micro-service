package com.example.UserService.model;

public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String remark;

    public Rating() {
    }

    public Rating(String userId, String hotelId, int rating, String remark) {
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.remark = remark;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
