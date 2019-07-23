package models;
public class User{
    private Integer followers;
    private Integer following;
    private Integer id;

    public User(){}

    public User(Integer followers, Integer following,Integer id) {
        this.followers = followers;
        this.following = following;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "followers=" + followers +
                ", following=" + following +
                ", id=" + id +
                '}';
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}