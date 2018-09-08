package com.training.pos.dao;

import java.util.ArrayList;

public class PosDaoImpl implements PosDao {

	@Override
	public String createXYZ() {
		@Override
		public List<Employee> addEmployee(Employee emp) throws Exception {
			try{
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(emp);
				session.getTransaction().commit();
				return getAllEmployees();
			}catch (Exception e) {
				throw new EmployeeException(e.getMessage());
			}
	}

	@Override
	public int deleteXYZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateXYZ() {
		// TODO Auto-generated method stub
		return false;
	}

	/*@Override
	public BeanObject findByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BeanObject> findAll() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
