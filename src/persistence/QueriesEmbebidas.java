package persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class QueriesEmbebidas {
	// 4 consultas empleados de Nueva york
		public static int consultaNumDeporte() {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Deporte").addEntity(Deporte.class);
			// se extrae el valor en una lista
			List<Deporte> result = query.list();
			// cerrar sesión
			sesion.close();
			return result.size();
		}
		
		public static List<Deporte> consultaDeporteAlumnos(String dni) {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Deporte where cod_deporte in (select DEPORTEV1_COD_DEPORTE from Matriculados where ALUMNOV1_DNI='"+dni+"')").addEntity(Deporte.class);
			// se extrae el valor en una lista
			List<Deporte> result = query.list();
			// cerrar sesión
			sesion.close();
			return result;
		}
		
		public static int consultaNumDPolideportivos() {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Polideportivo").addEntity(Polideportivo.class);
			// se extrae el valor en una lista
			List<Polideportivo> result = query.list();
			// cerrar sesión
			sesion.close();
			return result.size();
		}
		
		public static void listadoAlumnos() {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Alumno").addEntity(Alumno.class);
			// se extrae el valor en una lista
			List<Alumno> result =query.list();
			for(Alumno a:result) {
				System.out.println("Alumno "+a.getNombreAlumno());
			}
			// System.out.println("Nombre: "+result.getNombreAlumno());
			// cerrar sesión
			sesion.close();
			
		}
                
                public static List<Monitor> listadoMonitores() {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Monitor").addEntity(Monitor.class);
			// se extrae el valor en una lista
			List<Monitor> result =query.list();
			// cerrar sesión
			sesion.close();
			return result;
		}
                
                 public static List<Deporte> listadoDeportes() {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Deporte").addEntity(Deporte.class);
			// se extrae el valor en una lista
			List<Deporte> result =query.list();
			// System.out.println("Nombre: "+result.getNombreAlumno());
			// cerrar sesión
			sesion.close();
			return result;
		}
		
		// 5 consulta empleado cuyo código se muestre por teclado
		public static Alumno consultaAlumno(String dni) {
			// se inicia la sesión
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			// se abre la sesión
			Session session=sesion.openSession();
			// se genera la query
			Query query = session.createSQLQuery("select * from Alumno where DNI='"+dni+"'").addEntity(Alumno.class);
			// se extrae el valor en una lista
			Alumno alumno = (Alumno) query.uniqueResult();
			// cerrar sesión
			sesion.close();
			return alumno;
		}

		public static boolean insertarNuevoAlumno(Alumno alumno) {
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
                        
			Date fec=alumno.getFechaNacimiento();
                        int dia=fec.getDate();
                        int mes=fec.getMonth();
                        int anio=fec.getYear();
                        String fech=dia+"/"+mes+"/"+anio;
                        
			Query query = session.createSQLQuery("insert into Alumno "
					+ "values('"+alumno.getDni()+"','"+alumno.getNombreAlumno()
					+"', '"+alumno.getApellidosAlumno()+"','"+fech+"')");
			System.out.println("Query vale: "+query);
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
                
                public static boolean insertarNuevoAlumnoYDeporte(Alumno alumno, int deporte) {
                    insertarNuevoAlumno(alumno);
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
                        
			Date fec=new Date();
                        int dia=fec.getDate();
                        int mes=fec.getMonth()+1;
                        int anio=fec.getYear();
                        String fech=dia+"/"+mes+"/"+anio;
                        
			Query query = session.createSQLQuery("insert into Matriculados "
					+ "values('"+alumno.getDni()+"',"+deporte+",'"+fech+"')");
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
                
                public static boolean insertarNuevoDeporteAAlumno(Alumno alumno, int deporte) {
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
                        
			Date fec=new Date();
                        int dia=fec.getDate();
                        int mes=fec.getMonth()+1;
                        int anio=fec.getYear();
                        String fech=dia+"/"+mes+"/"+anio;
                        
			Query query = session.createSQLQuery("insert into Matriculados "
					+ "values('"+alumno.getDni()+"',"+deporte+",'"+fech+"')");
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
		
		public static boolean insertarNuevoMonitor(Monitor monitor) {
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
			Query query = session.createSQLQuery("insert into Monitor "
					+ "values('"+monitor.getDniMonitor()+"', '"+monitor.getNombreMonitor()
					+"', '"+monitor.getApellidosMonitor()+"')");
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
		
		public static boolean insertarNuevoDeporte(Deporte deporte) {
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
			Query query = session.createSQLQuery("insert into Deporte (cod_deporte,"
					+ " DESCRIPCION_DEPORTE, precio_deporte, POLIDEPORTIVOV1_COD_POLIDEPORTIVO,"
					+ " MONITORV1_DNI_MONITOR) "
					+ "values("+(consultaNumDeporte()+1)+", '"
                                        +deporte.getDescripcionDeporte()+"',"
					+deporte.getPrecioDeporte()+","
					+deporte.getPolideportivo().getCodPolideportivo()+",'11111111E')");
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
		
		public static boolean eliminarDeporteAlumno(String dniAlumno, int codDep) {
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
			Query query = session.createSQLQuery("delete from Matriculados where ALUMNOV1_DNI='"
					+dniAlumno+"' and DEPORTEV1_COD_DEPORTE="+codDep );
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
		
		public static boolean eliminarAlumno(String dniAlumno) {
			boolean bol=false;
			SessionFactory sesion=SessionFactoryUtil.getSessionFactory();
			Session session=sesion.openSession();
			Query query = session.createSQLQuery("delete from Alumno where dni='"
					+dniAlumno+"'");
			Transaction tx=session.beginTransaction();
			int i=query.executeUpdate();
			if(i>0) {
				bol=true;
			}
			// guardar cambios
			tx.commit();
			// cerrar se
			session.close();
			return bol;
		}
	
}
