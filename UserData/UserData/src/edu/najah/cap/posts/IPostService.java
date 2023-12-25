package edu.najah.cap.posts;

import edu.najah.cap.exceptions.BadRequestException;
import edu.najah.cap.exceptions.NotFoundException;
import edu.najah.cap.exceptions.SystemBusyException;

import java.util.List;

public interface IPostService {
    void addPost(Post post);

    List<Post> getPosts(String author) throws SystemBusyException, BadRequestException, NotFoundException;

    void deletePost(String author, String id) throws SystemBusyException, BadRequestException, NotFoundException;
}
