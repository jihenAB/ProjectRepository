package com.leoni.services;


import java.util.List;

import com.leoni.entities.User;

public interface UserService {
	public User save(User user);
    public List<User> listAllUsers();
    public User update(User user);
    public void remove(Integer id);
    public User getUser(Integer id);
}

