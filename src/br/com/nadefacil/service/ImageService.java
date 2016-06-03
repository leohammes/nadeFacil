package br.com.nadefacil.service;

import java.util.List;

import br.com.nadefacil.bean.Image;

public interface ImageService {
	
	public Image getImage(int id);
	
	public List<Image> getAllImages();
	
	public boolean createImage(Image image);
	
	public boolean updateImage(Image image);
	
	public boolean deleteImage(int imageId);
}