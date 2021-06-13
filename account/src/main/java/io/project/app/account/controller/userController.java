package io.project.app.account.controller;

import io.project.app.account.dto.CommentDTO;
import io.project.app.account.dto.PostDTO;
import io.project.app.account.client.Client;
import io.project.app.account.dto.AlbumsDTO;
import io.project.app.account.dto.PhotosDTO;
import io.project.app.account.dto.TodosDTO;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author gevorga
 */
@RequestMapping
@RestController
public class userController {

    static org.apache.commons.logging.Log log = LogFactory.getLog(userController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Client service;

    @GetMapping(path = "/posts")

    public ResponseEntity getPosts() {
        final List<PostDTO> users = this.service.getPosts();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Users not found!");
        }

        return ResponseEntity.ok(users);
    }

    @GetMapping(path = "/coments")

    public ResponseEntity getComents() {
        final List<CommentDTO> users = this.service.getComments();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Users not found!");
        }

        return ResponseEntity.ok(users);
    }

    @GetMapping(path = "/albums")

    public ResponseEntity getALbums() {
        final List<AlbumsDTO> users = this.service.getAlbums();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Users not found!");
        }

        return ResponseEntity.ok(users);
    }

    @GetMapping(path = "/photos")

    public ResponseEntity getPhotos() {
        final List<PhotosDTO> users = this.service.getPhotos();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Users not found!");
        }

        return ResponseEntity.ok(users);
    }

    @GetMapping(path = "/todos")

    public ResponseEntity getTodos() {
        final List<TodosDTO> users = this.service.getTodos();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Users not found!");
        }

        return ResponseEntity.ok(users);
    }

}
