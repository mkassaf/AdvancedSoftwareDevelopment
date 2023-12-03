package edu.najah.cap.posts;

import java.util.List;

public interface IPostService {
    void addPost(Post post);

    List<Post> getPosts(String author);

    void deletePost(String author, String id);
}
