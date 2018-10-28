package com.leoni.services;

import java.util.List;

import com.leoni.entities.Software;


public interface SoftwareService {
	public Software save(Software software);
    public List <Software> listAllSoftwares();
    public Software update(Software software);
    public void remove(Integer id);
    public Software getSoftware(Integer id);
}