package org.change.service;

import org.change.model.User;

public interface IUserService {
    public User selectUser(long userId);
}
