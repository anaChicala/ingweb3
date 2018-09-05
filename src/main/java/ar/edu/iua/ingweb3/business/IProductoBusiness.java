package ar.edu.iua.ingweb3.business;

import java.util.List;

import ar.edu.iua.ingweb3.model.Producto;
import ar.edu.iua.ingweb3.model.exception.NotFoundException;

public interface IProductoBusiness {
	
	public List<Producto> getAll() throws BusinessException;
	public Producto getOne(int id) throws BusinessException, NotFoundException;
	public Producto add(Producto p) throws BusinessException;
	public Producto update(Producto p) throws BusinessException, NotFoundException;
	public void delete(Producto p) throws BusinessException, NotFoundException;
	public List<Producto> search(String part) throws BusinessException;


	

}
