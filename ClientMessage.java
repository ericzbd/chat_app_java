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
import java.rmi.registry.*;

public class ClientMessage{
            //Properties
            private String s;
            private Message ml;
            
            //Constructors
            public ClientMessage(){
                         try{
                                      Registry reg;
                                      reg=LocateRegistry.getRegistry( "localhost");
                                      
                                      ml=(Message)reg.lookup("XYZ");
                                      s=ml.getMessage();
                                      System . out . println ( s ) ;
                         }
                         catch(Exception e){
                                       System . out . println (e) ;
                         }
              }
              
              //Behaviors
              public static void main(String[] args){
                          ClientMessage cm;
                          cm=new ClientMessage();
              }
              
}//end class
