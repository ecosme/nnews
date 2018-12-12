package myportal.com.rest;

import myportal.com.business.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @GetMapping(value="/{id}")
    public ResponseEntity<UserRequest> findOne(@PathVariable("id") String id){
        return ResponseEntity.ok(new UserRequest());
    }

    @GetMapping
    public ResponseEntity<List<UserRequest>> findAll(){
        return ResponseEntity.ok(Arrays.asList(new UserRequest(), new UserRequest()));
    }


    @PostMapping("/{id}")
    public ResponseEntity<UserRequest> updateUser(@PathVariable("id") String id, UserRequest userRequest){
        return new ResponseEntity<>(new UserRequest(), HttpStatus.OK);
    }

    @DeleteMapping("/{id]")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeUser(@PathVariable("id") String id){}
}
