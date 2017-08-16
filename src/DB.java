import java.sql.*;

public class DB {
	
	public static void DBGen(){
	String customer = "CREATE TABLE CUSTOMER" +
			"(Name	VARCHAR(15)	NOT NULL," +
			"Id	CHAR(9)	NOT NULL," +
			"Contact CHAR(11)," +
			"PRIMARY KEY(Id));";
	String orders = "CREATE TABLE ORDERS" +
			"(CusId	CHAR(9)	NOT NULL," +
			"MenId	CHAR(9)	NOT NULL," +
			"Quantity	INT	NOT NULL," +
			"ServId CHAR(9) NOT NULL," +
			"PRIMARY KEY(CusId,MenId));";
	String menu = "CREATE TABLE MENU" +
			"(MenuId	CHAR(9)	NOT NULL," +
			"Menuname	VARCHAR(15)	NOT NULL," +
			"Price	INT	NOT NULL," +
			"PRIMARY KEY(MenuId));";
	String server = "CREATE TABLE SERVER" +
			"(Name	VARCHAR(15)	NOT NULL," +
			"ServerId	CHAR(9)	NOT NULL," +
			"Contact	CHAR(11) NOT NULL," +
			"PRIMARY KEY(ServerId));";
	String workhour = "CREATE TABLE WORKHOUR" +
			"(WorkId	CHAR(9)	NOT NULL," +	
			"Hour	INT	NOT NULL," +
			"Server_Id	CHAR(9)	NOT NULL," +
			"PRIMARY KEY(WorkId));";
	
	try{
		Class.forName("com.mysql.jdbc.Driver");			
	}catch(ClassNotFoundException e){
		System.out.println("class");
	}
	Connection conn = null;
	Statement stmt = null;
	String strURL = "jdbc:mysql://localhost:3306/restaurant";
	String strID = "root";
	String strPW = "kiki134425";
	StringBuffer sb = new StringBuffer();
	
	try{
		conn = DriverManager.getConnection(strURL,strID,strPW);
		
		stmt = conn.createStatement();
		

		/*stmt.executeUpdate(customer);
		stmt.executeUpdate(menu);
		stmt.executeUpdate(server);
		stmt.executeUpdate(workhour);
		System.out.println("‰ç³ª?");
		stmt.executeUpdate(orders);
		stmt.executeUpdate("ALTER TABLE ORDERS ADD CONSTRAINT FOREIGN KEY(Cusid) REFERENCES CUSTOMER(Id)");
		stmt.executeUpdate("ALTER TABLE ORDERS ADD CONSTRAINT FOREIGN KEY(MenId) REFERENCES MENU(MenuId)");
		stmt.executeUpdate("ALTER TABLE ORDERS ADD CONSTRAINT FOREIGN KEY(ServId) REFERENCES SERVER(ServerId)");
		stmt.executeUpdate("ALTER TABLE WORKHOUR ADD CONSTRAINT FOREIGN KEY(ServerId) REFERENCES SERVER(ServerId)");*/


		
	}catch(SQLException e){
		System.out.println("SQL1");
	}
	

	try{

		stmt.executeUpdate("SET foreign_key_checks = 0");
		/*
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('James','111111111','01011111111');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Robert','111111112','01011111112');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Micheal','111111113','01011111113');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('David','111111114','01011111114');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Thomas','111111115','01011111115');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Paul','111111116','01011111116');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Daniel','111111117','01011111117');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Donald','111111118','01011111118');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Anthony','111111119','01011111119');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Jason','111111110','01011111110');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Gary','111111121','01011111121');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Larry','111111122','01011111122');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Frank','111111123','01011111123');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Scott','111111124','01011111124');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Raymond','111111125','01011111125');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Joshua','111111126','01011111126');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Jerry','111111127','01011111127');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Joseph','111111128','01011111128');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Brian','111111129','01011111129');");
		stmt.executeUpdate("INSERT INTO CUSTOMER VALUES('Kevin','111111120','01011111120');");*/
		
		
			
		/*stmt.executeUpdate("INSERT INTO MENU VALUES('111111110','Fried Chicken','10');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111111','Cheese Pizza','12');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111112','beer','3');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111113','soju','3');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111114','Poutine','5');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111115','Corn Soup','6');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111116','Kimchi','2');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111117','Pepperoni Pizza','12');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111118','Potato Pizza','11');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111119','Bulgogi','15');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111120','Dried Squid','10');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111121','Kimchi Soup','10');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111122','Cheese Ramen','9');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111123','Red bin Sharbet','7');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111124','Scrambled Egg','10');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111125','Coke','3');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111126','Sprite','3');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111127','Stir-fried Pork','15');");*/
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111128','Chicken feet','15');");
		stmt.executeUpdate("INSERT INTO MENU VALUES('111111129','fried shrimp','15');");
		
		/*
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111110','Ruben','01021111110');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111111','Milton','01021111111');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111112','Hector','01021111112');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111113','Lewis','01021111113');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111114','Dan','01021111114');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111115','Derrick','01021111115');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111116','Pedro','01021111116');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111117','Dustin','01021111117');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111118','Jorge','01021111118');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111119','Dean','01021111119');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111120','Tommy','01021111120');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111121','Bill','01021111121');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111122','Jim','01021111122');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111123','Miguel','01021111123');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111124','Clifford','01021111124');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111125','Marcus','01021111125');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111126','Leroy','01021111126');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111127','Mario','01021111127');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111128','Kyle','01021111128');");
		stmt.executeUpdate("INSERT INTO SERVER VALUES('111111129','Jeff','01021111129');");*/
		/*
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111111','111111110',2,'111111111');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111111','111111112',3,'111111111');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111111','111111114',1,'111111112');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111112','111111124',2,'111111112');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111112','111111123',4,'111111113');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111112','111111115',2,'111111113');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111113','111111118',1,'111111114');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111113','111111119',3,'111111114');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111113','111111114',2,'111111115');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111114','111111123',2,'111111115');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111114','111111122',4,'111111116');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111114','111111128',3,'111111116');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111115','111111116',2,'111111117');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111115','111111125',1,'111111117');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111115','111111111',2,'111111118');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111116','111111127',3,'111111118');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111116','111111129',2,'111111119');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111117','111111120',1,'111111120');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES('111111117','111111113',3,'111111120');");
		stmt.executeUpdate("INSERT INTO ORDERS VALUES(  '111111117','111111123',2,'111111120');");*/
				
		/*stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111110',3,'111111111');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111111',5,'111111115');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111112',8,'111111114');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111113',2,'111111116');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111114',5,'111111113');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111115',4,'111111114');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111116',7,'111111112');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111117',5,'111111115');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111118',2,'111111111');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111119',6,'111111111');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111120',1,'111111111');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111121',3,'111111113');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111122',8,'111111115');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111123',6,'111111114');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111124',5,'111111112');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111125',4,'111111116');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111126',3,'111111113');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111127',2,'111111112');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111128',6,'111111116');");
		stmt.executeUpdate("INSERT INTO WORKHOUR VALUES('111111129',4,'111111112');");*/
		
		
	}catch(SQLException e){
		System.out.println("SQL2");
	}
			}
	/*

	String str1 = "Select * from EMPLOYEE;";
	String str2 = "Select * from DEPARTMENT;";
	String str3 = "Select * from DEPT_LOCATIONS;";
	String str4 = "Select * from PROJECT;";
	String str5 = "Select * from WORKS_ON;";
	String str6 = "Select * from DEPENDENT;";
	
	String q0 = "Select Bdate,Address from EMPLOYEE where Fname='John' AND Minit='B' AND Lname='Smith';";
	String q1 = "Select Fname,Lname,Address from EMPLOYEE,DEPARTMENT where Dname='Research' AND Dnumber=Dno;";
	String q2 = "Select Pnumber,Dnum,Lname,Address,Bdate from PROJECT,DEPARTMENT,EMPLOYEE where Dnum=Dnumber AND Mgr_ssn=Ssn AND Plocation='Stafford';";
	
	try {
		ResultSet rs = null;
		rs = stmt.executeQuery(q0);
		while(rs.next()){
			sb.append(rs.getString("Bdate")).append("\t");
			sb.append(rs.getString("Address")).append("\n");
		}
		System.out.println("Query 0");
		System.out.println(sb.toString());
		
		sb = new StringBuffer();
		rs = stmt.executeQuery(q1);
		System.out.println("Query 1");
		while(rs.next()){
			System.out.printf("%-10s\t",rs.getString("Fname"));
			System.out.printf("%-10s\t",rs.getString("Lname"));
			System.out.printf("%-10s\n",rs.getString("Address"));
		}
		
		
		rs = stmt.executeQuery(q2);
		System.out.println();
		while(rs.next()){
			sb.append(rs.getString("Pnumber")).append("\t");
			sb.append(rs.getString("Dnum")).append("\t");
			sb.append(rs.getString("Lname")).append("\t");
			sb.append(rs.getString("Address")).append("\t");
			sb.append(rs.getString("Bdate")).append("\n");
		}

		System.out.println("Query 2");
		System.out.println(sb.toString());
		
		
		rs = stmt.executeQuery(str1);
		while(rs.next()){
			System.out.printf("%-10s",rs.getString("Fname"));
			System.out.printf("%-5s",rs.getString("Minit"));
			System.out.printf("%-10s",rs.getString("Lname"));
			System.out.printf("%-15s",rs.getString("Ssn"));
			System.out.printf("%-15s",rs.getString("Bdate"));
			System.out.printf("%-30s",rs.getString("Address"));
			System.out.printf("%-5s",rs.getString("Sex"));
			System.out.printf("%-10s",rs.getString("Salary"));
			System.out.printf("%-15s",rs.getString("Super_ssn"));
			System.out.printf("%-15s\n",rs.getString("Dno"));
		}
		
		rs = stmt.executeQuery(str2);
		System.out.println();
		while(rs.next()){
			sb.append(rs.getString("Dname")).append("\t");
			sb.append(rs.getString("Dnumber")).append("\t");
			sb.append(rs.getString("Mgr_ssn")).append("\t");
			sb.append(rs.getString("Mgr_start_date")).append("\n");
		}
		System.out.println(sb.toString());
		sb = new StringBuffer();
		
		rs = stmt.executeQuery(str3);
		while(rs.next()){
			sb.append(rs.getString("Dnumber")).append("\t");
			sb.append(rs.getString("Dlocation")).append("\n");
		}
		System.out.println(sb.toString());
		sb = new StringBuffer();
		
		rs = stmt.executeQuery(str4);
		while(rs.next()){
			System.out.printf("%-20s",rs.getString("Pname"));
			System.out.printf("%-5s",rs.getString("Pnumber"));
			System.out.printf("%-10s",rs.getString("Plocation"));
			System.out.printf("%-5s\n",rs.getString("Dnum"));
		}
		
		rs = stmt.executeQuery(str5);
		System.out.println();
		while(rs.next()){
			sb.append(rs.getString("Essn")).append("\t");
			sb.append(rs.getString("Pno")).append("\t");
			sb.append(rs.getString("Hours")).append("\n");
		}
		System.out.println(sb.toString());
		sb = new StringBuffer();
		
		
		rs = stmt.executeQuery(str6);
		while(rs.next()){
			System.out.printf("%-15s",rs.getString("Essn"));
			System.out.printf("%-15s",rs.getString("Dependent_name"));
			System.out.printf("%-3s",rs.getString("Sex"));
			System.out.printf("%-15s",rs.getString("Bdate"));
			System.out.printf("%-15s\n",rs.getString("Relationship"));
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
*/
}
