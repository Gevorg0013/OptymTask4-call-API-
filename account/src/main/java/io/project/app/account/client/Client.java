/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.account.client;

import io.project.app.account.dto.AlbumsDTO;
import io.project.app.account.dto.CommentDTO;
import io.project.app.account.dto.PhotosDTO;
import io.project.app.account.dto.PostDTO;
import io.project.app.account.dto.TodosDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vavr.control.Try;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author gevorga
 */
@Service
public class Client {

    @Autowired
    RestTemplate restTemplate;

    private static final String USERS_API_POSTS = "https://jsonplaceholder.typicode.com/posts";

    private static final String USERS_API_COMMENTS = "https://jsonplaceholder.typicode.com/comments";

    private static final String USERS_API_ALBUMS = "https://jsonplaceholder.typicode.com/albums";

    private static final String USERS_API_PHOTOS = "https://jsonplaceholder.typicode.com/photos";

    private static final String USERS_API_TODOS = "https://jsonplaceholder.typicode.com/todos";

    public List<PostDTO> getPosts() {

        final Try<PostDTO[]> response = Try.of(()
                -> this.restTemplate.getForObject(USERS_API_POSTS, PostDTO[].class));

        if (!response.isSuccess()) {
            System.out.print("Error to get quote tags: " + response.getCause().getLocalizedMessage());
            return null;
        }
        return Arrays.asList(response.get());
    }

    public List<CommentDTO> getComments() {

        final Try<CommentDTO[]> response = Try.of(()
                -> this.restTemplate.getForObject(USERS_API_COMMENTS, CommentDTO[].class));

        if (!response.isSuccess()) {
            System.out.print("Error to get quote tags: " + response.getCause().getLocalizedMessage());
            return null;
        }
        return Arrays.asList(response.get());
    }

    public List<AlbumsDTO> getAlbums() {

        final Try<AlbumsDTO[]> response = Try.of(()
                -> this.restTemplate.getForObject(USERS_API_ALBUMS, AlbumsDTO[].class));

        if (!response.isSuccess()) {
            System.out.print("Error to get quote tags: " + response.getCause().getLocalizedMessage());
            return null;
        }
        return Arrays.asList(response.get());
    }

    public List<PhotosDTO> getPhotos() {

        final Try<PhotosDTO[]> response = Try.of(()
                -> this.restTemplate.getForObject(USERS_API_PHOTOS, PhotosDTO[].class));

        if (!response.isSuccess()) {
            System.out.print("Error to get quote tags: " + response.getCause().getLocalizedMessage());
            return null;
        }
        return Arrays.asList(response.get());
    }

    public List<TodosDTO> getTodos() {

        final Try<TodosDTO[]> response = Try.of(()
                -> this.restTemplate.getForObject(USERS_API_TODOS, TodosDTO[].class));

        if (!response.isSuccess()) {
            System.out.print("Error to get quote tags: " + response.getCause().getLocalizedMessage());
            return null;
        }
        return Arrays.asList(response.get());
    }

}
