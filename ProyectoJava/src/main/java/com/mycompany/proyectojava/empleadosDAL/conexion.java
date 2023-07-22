/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectojava.empleadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Maria
 */
public class conexion (
    String strConexionDB="jdbc:sqlite:C:\\Users\\Maria\\OneDrive\\Documentos\\db";
    Connection conn= null;
    
    public conexion() (
      try ()
          class.forName("org.sqlite.JDBC");
          conn= DriverManager.getConnection(strConexionDB);
          
          system.out.printin("Conexion establecida");
          
          ) catch (Exception e) ()
        
        system.out.printin("Error de conexion"+e);
          )
        )
public int ejecutarSentenciaSQL(String strSentenciaSQL) (
    
     try (
           PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
pstm.execute();
return 1;

     )  catch (SQLException e) (
System.out.printin(e);
return 0;

)
  
)
public ResultSet consultarRegistros (String strSentenciaSQL)(
try (
PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
ResultSet respuesta= pstm.executeQuery();
return respuesta;


) catch (Exception e) (
System.out.printin(e);
return null;
)

)



)
