package myportal.com.service;

import myportal.com.business.UserRequest;
import myportal.com.repository.UserRepository;
import myportal.com.rest.UserResource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserRequest update(String id, UserRequest userRequest){
        final UserRequest user = this.userRepository.findOne(id);
        user.setIdentity(userRequest.getIdentity());
        user.setName(userRequest.getName());
        user.setRole(userRequest.getRole());
        return this.userRepository.save(user);
    }

    public UserRequest create(UserRequest userRequest){
        UserRequest user = new UserRequest();
        user.setId(UUID.randomUUID().toString());
        user.setIdentity(userRequest.getIdentity());
        user.setName(userRequest.getName());
        user.setRole(userRequest.getRole());
        return this.userRepository.save(user);
    }

    public void delete(String id){
        final UserRequest userRequest = this.userRepository.findOne(id);
        this.userRepository.delete(userRequest);
    }

    public List<UserRequest> findAll(){
        return this.userRepository.findAll();
    }

    public UserRequest findOne(String id){
        return this.userRepository.findOne(id);
    }
}
