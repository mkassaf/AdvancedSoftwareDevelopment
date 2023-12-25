package edu.najah.cap.posts;

import edu.najah.cap.exceptions.BadRequestException;
import edu.najah.cap.exceptions.NotFoundException;
import edu.najah.cap.exceptions.SystemBusyException;
import edu.najah.cap.exceptions.Util;

import java.util.*;

public class PostService implements IPostService {
    private static final Map<String, List<Post>> posts = new HashMap<>();

    @Override
    public void addPost(Post post) {
        posts.computeIfAbsent(post.getAuthor(), key -> new ArrayList<>()).add(post);
    }

    @Override
    public List<Post> getPosts(String author) throws SystemBusyException, BadRequestException, NotFoundException {
        Util.validateUserName(author);
        if (!posts.containsKey(author)) {
            throw new NotFoundException("User does not exist");
        }
        return posts.get(author);
    }

    @Override
    public void deletePost(String author, String id) throws SystemBusyException, BadRequestException, NotFoundException {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Util.validateUserName(author);
        if (!posts.containsKey(author)) {
            throw new NotFoundException("User does not exist");
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
