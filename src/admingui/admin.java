package admingui;

import electricbills.*;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger; 


public class admin extends staff{
    
public admin(){} 
public admin (long mc,long nowCode,String email,String first,String last,long pass,String complain,double bill,String region,long kilowatt,float tax,String gs){
            super(mc,nowCode,email,first,last,pass,complain,bill,region,kilowatt,tax,gs);}
public boolean searchcoustomer(){
    try {
        con=connection.getconnection();
        String coustomer="select * from information where metercode=?";
        pst =con.prepareStatement(coustomer);
        pst.setLong(1, mc);
        r =pst.executeQuery();
        while(r.next()){
            mc=r.getLong("metercode");
            nowCode=r.getInt("nowcode");
            email=r.getString("email");
            first=r.getString("firstname");
            last=r.getString("lastname");
            pass=r.getLong("pass");
            bill=r.getInt("bill");
            region=r.getString("region");
            kilowatt=r.getInt("kilowatt");
            tax=r.getFloat("taxs");
            apno=r.getInt("apartmentno");
            streetno=r.getInt("streetno");
            streetname=r.getString("streetname");
            floorno=r.getInt("floorno");
            id=r.getLong("id");
            complain=r.getString("complain");
            return true;}
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
  return false;  
  }  
  
  public boolean searchoperator(){
    try {
        con=connection.getconnection();
        String coustomer="select * from operator where id=?";
        pst =con.prepareStatement(coustomer);
        pst.setLong(1,id);
        r =pst.executeQuery();
        while(r.next()){
        id=r.getLong("id");
        region=r.getString("region");
        first=r.getString("username");
        pass=r.getLong("pass");
        return true;}
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    }
  
public boolean searchadmin(){
    try{
        con=connection.getconnection();
        String admin="select * from admin where id=?";
        pst=con.prepareStatement(admin);
        pst.setLong(1,id);
        r=pst.executeQuery();
        while(r.next()){
          id=r.getLong("id");
          first=r.getString("username");
          pass=r.getLong("pass");
        return true;}          
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);}
    return false;
}
public boolean updatecoustomer(long mc1){
    try {
        con=connection.getconnection();
        String coustomer="update information set metercode=?,firstname=?,lastname=?,email=?,pass=?,nowcode=?,id=?,region=?,bill=?,kilowatt=?,taxs=?,apartmentno=?,floorno=?,streetname=?,streetno=?,complain=? where metercode=?";
        pst=con.prepareStatement(coustomer);
        pst.setLong(1,mc);
        pst.setString(2,first);
        pst.setString(3,last);
        pst.setString(4,email);
        pst.setLong(5,pass);
        pst.setLong(6,nowCode);
        pst.setLong(7,id);
        pst.setString(8,region);
        pst.setDouble(9,bill);
        pst.setLong(10,kilowatt);
        pst.setFloat(11,tax);
        pst.setInt(12,apno);
        pst.setInt(13,floorno);
        pst.setString(14,streetname);
        pst.setInt(15,streetno);
        pst.setString(16,complain);
        pst.setLong(17,mc1);
        pst.executeUpdate();
        pst.close();
        con.close();
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;}

    public boolean updateoperator(long id1){
    try {
        con = connection.getconnection();
        String o="update operator set username=?,region=?,id=?,pass=? where id=?";
        pst = con.prepareStatement(o);
        pst.setString(1,first);
        pst.setString(2,region);
        pst.setLong(3,id);
        pst.setLong(4,pass);
        pst.setLong(5,id1);
        pst.executeUpdate();
        pst.close();
        con.close();
        return true;
    } catch (SQLException Ex) {}
       
     return false;
    }   
        
    public boolean updateadmin(long id1){
    try {
        con = connection.getconnection();
        String admin="update admin set username=?,id=?,pass=? where id=?";
        pst = con.prepareStatement(admin);
        pst.setString(1,first);
        pst.setLong(2,id);
        pst.setLong(3,pass);
        pst.setLong(4,id1);
        pst.executeUpdate();
        pst.close();
        con.close();
        return true;
    } catch (SQLException Ex) {}
       
     return false;
    }
     public int checkDelete(String code)
    { 
        int Count = 0;
        try{
            con = connection.getconnection();
            String sql = "delete from Information where metercode=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,code);
            Count = pst.executeUpdate();      
            }
         catch (SQLException  Ex){}
        finally{
           try {
               pst.close();
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    return Count;
    }
    
    
    public int checkDeleteOpreator(String Id)
    {
       
        int Count = 0;
        try{
             con = connection.getconnection();
            String sql = "delete from opreato where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,Id);
            Count = pst.executeUpdate();      
            }
         catch (SQLException  Ex){}
        finally{
           try {
               pst.close();
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    return Count;
    }
    public String generalTotal(){
        String total;
    try {
        con = connection.getconnection();
        //Statement st=con.createStatement();
        String sql="Select SUM(bill) AS sum from information"; 
        pst=con.prepareStatement(sql);
        //String sql="select sum(bill) from information"; 
        r=pst.executeQuery();
        if(r.next()){
            double x=r.getDouble("sum");
            total=x+"  Pounds";
           return total;}
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
    public String dateTotal(String date){
    try {
        String dTotal;
        con = connection.getconnection();
        //Statement st=con.createStatement();
        String sql="select SUM(bill)  AS sum from information where pdate='"+date+"'"; 
        pst=con.prepareStatement(sql);
        r=pst.executeQuery();
        if(r.next()){
            //dTotal=r.getString("sum(bill
            double x=r.getDouble("sum");
            dTotal=x+"  Pounds";
           return dTotal;
        }
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
    }
    public String regionTotal(String region){
      try {
        String rTotal,s1;int y=0;
          s1 = "";
        con = connection.getconnection();
        Statement st=con.createStatement();
        String sql1="select region from information";
        ResultSet rs = st.executeQuery(sql1);
        while(rs.next()){
            s1=rs.getString("region");
            if(s1.compareTo(region)==0)
                y++;
        }
        if(y>0) {
            String sql="select SUM(bill) AS sum from information where region='"+region+"'";
            pst=con.prepareStatement(sql);
            r=pst.executeQuery();
            if(r.next()){
                //rTotal=r.getString("sum(bill)");
                double x=r.getDouble("sum");
                rTotal=x+"  Pounds";
                return rTotal;
            } } 
        else
        {return null;}
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;  
    }
@Override
    public boolean login(String userName, String Pass){
    try {
        con = connection.getconnection();
        Statement st=con.createStatement();
        String sql="select username ,pass from admin";
        r=st.executeQuery(sql);
        while(r.next()){
            String x=r.getString("username");
            String y=r.getString("pass");
            if (x.compareTo(userName)==0&&y.compareTo(Pass)==0) {
                return true;
            }
        }
        return false;
    } catch (SQLException ex) {
        Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    }
}
//        String frommail = "engimoh2001@gmail.com";
//        String tomail= common.getemail();
//        String pass="srrythnkyu";
//        String Subject = "Electric bill company";
//        String Emailbody = "you didn't pay your bill since 3 months";
//  public  int email() throws SQLException, MessagingException, MessagingException{
//     String email=common.getemail();
//     String information="select pdate,email from information";
//            Connection con = connection.getconnection();
//            Statement s =con.createStatement();
//            ResultSet r=s.executeQuery(information);
//            while(r.next()){
//                String email1=r.getString("email");
//                int c=email.compareTo(email1);
//                if(c==0){ 
//                    java.sql.Date pd =r.getDate("pdate");
//                    LocalDate j= LocalDate.now();
//                    LocalDate b=pd.toLocalDate();
//                    Period o=Period.between(b,j);
//                    int u=o.getMonths();
//                    if(u>=3){
//                         System.out.println("\n 1st ===> setup Mail Server Properties..");
//       Properties p= new Properties();
//       p.setProperty("mail.stmp.host", "smtp.gmail.com");
//       p.setProperty("mail.stmp.port", "25");
//       p.setProperty("mail.stmp.auth", "true");
//       p.setProperty("mailstmp.socketFactory.port", "25");
//       p.setProperty("mail.stmp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//       System.out.println("  l");
//        Session s1 =Session.getInstance(p, new javax.mail.Authenticator(){
//            protected PasswordAuthentication getPasswordAuthentication(){
//                return new PasswordAuthentication(frommail,pass);}});
//        System.out.println("     p");
//        try{
//       Message m=new MimeMessage(s1);
//       System.out.println("      kk");
//       m.setFrom(new InternetAddress(frommail));
//       m.setRecipient(Message.RecipientType.TO,new InternetAddress(tomail));
//       m.setSubject("lppp");
//       m.setText("pppppp");
//       System.out.println(" hiii");
//       Transport.send(m);
//       System.out.println("     pppppp");
//       return 1;}
//       catch (MessagingException e){
//           e.printStackTrace();
//       }}}}
//       
//       
//       
////                         mailServerProperties = System.getProperties();
////        mailServerProperties.put("mail.smtp.port", "587");  // ( smtp = simple mail transfer protocol)
////        mailServerProperties.put("mail.smtp.auth", "true");
////        mailServerProperties.put("mail.smtp.starttls.enable", "true"); // Transport Layer Security (TLS)
////
////        System.out.println("Mail Server Properties have been setup successfully..");
////
////        // Step2
////        System.out.println("\n\n 2nd ===> get Mail Session..");
////
////        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
////
////        generateMailMessage = new MimeMessage(getMailSession);
////        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ToEmail));
////        if (!CcEmail.equals("")) {
////            generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(CcEmail));
////        }
////        generateMailMessage.setSubject(Subject);
////        String emailBody = Emailbody + "<br><br> Regards, <br>Eng. Tamer AbdElaziz";
////        generateMailMessage.setContent(emailBody, "text/html");
////
////        System.out.println("Mail Session has been created successfully..");
////
////        // Step3
////        System.out.println("\n\n 3rd ===> Get Session and Send mail");
////        Transport transport = getMailSession.getTransport("smtp");
////         System.out.println(" o");
////        // Enter your correct gmail UserID and Password
////        // if you have 2FA enabled then provide App Specific Password
////        transport.connect("smtp.gmail.com", "engimoh2001@gmail.com", "srrythnkyu");
////        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
////        transport.close();
////        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
//    return 0;  
//                    }}
 
//     String email=common.getemail();
//     String information="select pdate,email from information";
//            Connection con = connection.getconnection();
//            Statement s =con.createStatement();
//            ResultSet r=s.executeQuery(information);
//            while(r.next()){
//                String email1=r.getString("email");
//                int c=email.compareTo(email1);
//                if(c==0){ 
//                    java.sql.Date pd =r.getDate("pdate");
//                    LocalDate j= LocalDate.now();
//                    LocalDate b=pd.toLocalDate();
//                    Period o=Period.between(b,j);
//                    int u=o.getMonths();
//                    if(u>=3){
//                         System.out.println("\n 1st ===> setup Mail Server Properties..");
//        final String username = "engimoh2001@gmail.com";
//        final String password = "srrythnkyu";
// 
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class",
//                "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
// 
//        Session session = Session.getDefaultInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username,password);
//                    }
//                });
// 
//        try {
// 
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("engimoh2001@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("esramoh2003xxx@gmail.com"));
//            message.setSubject("Test JCG Example");
//            message.setText("Hi," +
//                    "This is a Test mail for JCG Example!");
// 
//            Transport.send(message);
// 
//            System.out.println("Mail sent succesfully!");
//         return 1;
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }}}}
//    return 0;}
//}
/*public int update(long id){
       try {
           String information="upadate firstname=?,lastname=?,region=?,streetno=?,email=?,bill=?,nowcode=?,kilowatt=?,metercode=?,streetname=?,floorno=?,apartmentno=?,pass=?,complain=?,pdate=? from information where id=?";
           Connection con = connection.getconnection();
           PreparedStatement p=con.prepareStatement(information);
           p.setString(1,c.getfrist());
           p.setString(2, c.getlast());
           p.setString(3, c.getregion());
           p.setInt(4, c.getstreetno());
           p.executeUpdate();
           return 1;
                 } catch (SQLException ex) {
           Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
       }
       return 0;
}*/

//// email ID of Recipient. 
//	String recipient = "engimoh2001@gmail.com"; 
//
//	// email ID of Sender. 
//	String sender = email; 
//
//	// using host as localhost 
//	String host = "127.0.0.1"; 
//
//	// Getting system properties 
//	Properties properties = System.getProperties(); 
//
//	// Setting up mail server 
//	properties.setProperty("mail.smtp.host", host); 
//
//	// creating session object to get properties 
//	Session session = Session.getDefaultInstance(properties); 
//
//	try
//	{ 
//		// MimeMessage object. 
//		MimeMessage message = new MimeMessage(session); 
//
//		// Set From Field: adding senders email to from field. 
//		message.setFrom(new InternetAddress(sender)); 
//
//		// Set To Field: adding recipient's email to from field. 
//		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 
//
//		// Set Subject: subject of the email 
//		message.setSubject("This is Suject"); 
//
//		// set body of the email. 
//		message.setContent("<h1>You didn't pay the bill for 3 months</h1>","text/html"); 
//
//		// Send email. 
//		Transport.send(message); 
//		System.out.println("Mail successfully sent"); 
//	} 
//	catch (MessagingException mex) 
//	{ 
//	} 
//}          return 1;
//                }
//                 else
//                       return 0;}
//        } catch (SQLException ex) {
//            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//return 0;}     

