package edu.najah.cap.posts;

import java.util.*;

public class PostService implements IPostService {
    private static final Map<String, List<Post>> posts = new HashMap<>();

    @Override
    public void addPost(Post post) {
        posts.computeIfAbsent(post.getAuthor(), key -> new ArrayList<>()).add(post);
    }

    @Override
    public List<Post> getPosts(String author) {
        return posts.get(author);
    }

    @Override
    public void deletePost(String author, String id) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Post> authorPosts = posts.get(author);
        if (authorPosts != null) {
            Iterator<Post> iterator = authorPosts.iterator();
            while (iterator.hasNext()) {
                Post post = iterator.next();
                if (Objects.equals(post.getId(), id)) {
                    iterator.remove();
                }
            }
        }
    }
}
