package com.leoni.services;

import java.util.List;

import com.leoni.entities.Phone;


public interface PhoneService {
	public Phone save(Phone phone);
    public List <Phone> listAllPhones();
    public Phone update(Phone phone);
    public void remove(Integer id);
    public Phone getPhone(Integer id);
}
