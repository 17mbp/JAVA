/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject0;
import java.sql.*;
/**
 *
 * @author Manue
 */
public class crud {
    public void Create(String nombre, String telefono){
        String query = "insert into Persona (nombre, telefono) values (?,?)";
        try{
            Connection con = dbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1,nombre);
            ps.setString(2,telefono);
            ps.executeUpdate();
            System.out.println("Registro guardado");
            ps.close();
            con.close();
        }catch(Exception ex){
            System.out.println("error en create " + nombre + telefono );
        }
    }
    
    public void Read(){
        String query = "select * from Persona";
        try{
            Connection con = dbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                System.out.println("ID: " + id + " NAME: " + nombre + " CELULAR: " + telefono);
            }
        }catch(Exception ex){
            System.out.println("FALLOS AL LEER");
        }
    }
    
    public void Update(int id, String nombre, String telefono){
        String query ="Update Persona set nombre=?, telefono=? where id=?";
        try{
            Connection con = dbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ps.setString(2, nombre);
            ps.setString(3, telefono);
            ps.executeUpdate();
            System.out.println("Dato cambiado con éxito");
        }catch(Exception ex){
            System.out.println("FALLOS AL actualizar");
        }
    }
    
    public void Delete(int id){
        String query = "delete from Persona where id=?";
        try{
            Connection con = dbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Dato eliminado");
        }catch(Exception ex){
            System.out.println("FALLO AL eliminaR");
        }
    }
}
