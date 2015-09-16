/*******************************************************************************************************************************
* Class: CIST 2372 Java II
* Semester: Fall 2014
* Instructor: Ron Enz
* Description: Lab 12
* Due: 11/19/2014
* @author Eric Horne
* @version 1.0
*
* By turning in this code, I Pledge:
* 1. That I have completed the programming assignment independently.
* 2. I have not copied the code from a student or any source.
* 3. I have not given my code to any student.
********************************************************************************************************************************
*/

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class ServerMessage extends UnicastRemoteObject implements Message{
            //Properties
            String mes="Go Falcons";
            private Registry reg;
            
            //Constructors
            public ServerMessage()throws RemoteException{
                         try{
                                        reg=LocateRegistry.getRegistry();
                                        reg.rebind ( "XYZ" , this );
                                        System.out.println( "Server Ready to send messages");
                         }
                         catch (Exception e){
                                         System.out.println(e);
                         }
             }
                         
             //Behaviors
             public String getMessage()throws RemoteException{
                          return mes;
             }
             
             public static void main(String[] args)throws RemoteException{
                         ServerMessage sm1=new ServerMessage();
             }
             
}//End class