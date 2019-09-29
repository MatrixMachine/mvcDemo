package org.change.dao;

import org.change.model.User;

public interface IUserDao {
    User selectUser(long id);
}
