package com.dreamshops.service.user;

import com.dreamshops.model.User;
import com.dreamshops.request.CreateUserRequest;
import com.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUserById(Long userId);

}
