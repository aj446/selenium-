package mypack;

import javax.servlet.jsp.jstl.core.Config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class datainsertion {

	public static void main(String[] args) {
		new datainsertion().updateinfo1();

	}
public void insertinfo(){
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory SF=con.buildSessionFactory();
	Session session=SF.openSession();
	Dataprovider provider=new Dataprovider();
	provider.setUser_id(123);
	provider.setUser_name("Rama");
	provider.setUser_address("Bihar");
	Transaction TR=session.beginTransaction();
	System.out.println("Object saved successfully");
	session.save(provider);
	TR.commit();
	session.close();
	SF.close();
}
public void getinfo(){
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory SF=con.buildSessionFactory();
	Session session=SF.openSession();
	Object ob =session.load(Dataprovider.class, new Integer(122));
	Dataprovider DB=(Dataprovider)ob;
	System.out.println("Name is:"+DB.getUser_name());
	System.out.println("Address is:"+DB.getUser_address());
	
}
public void deleteinfo(){
	Configuration con =new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory SF=con.buildSessionFactory();
	Session session=SF.openSession();
	Transaction TR=session.beginTransaction();
	Object OB=session.load(Dataprovider.class, new Integer(122));
	session.delete(OB);
	System.out.println("Object deleted successfully");
	TR.commit();
	session.close();
	SF.close();
	
}
public void updaeinfo(){
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory SF= con.buildSessionFactory();
	Session session=SF.openSession();
	Transaction TR=session.beginTransaction();
	Object OB=session.load(Dataprovider.class, new Integer(122));
	Dataprovider DB=(Dataprovider) OB;
	DB.setUser_address("India");
	System.out.println("data is Updated");
	TR.commit();
	session.close();
	SF.close();
}
public void updateinfo1(){
	Configuration con=new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory SF=con.buildSessionFactory();
	Session session=SF.openSession();
	Transaction TR=session.beginTransaction();
	Dataprovider DB=new Dataprovider();
	DB.setUser_id(122);
	DB.setUser_name("Krishna");
	DB.setUser_address("Dubai");
	session.update(DB);
	System.out.println("data updated by renaming the ID");
	TR.commit();
	session.close();
	SF.close();
}
}