/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttv;
import java.util.ArrayList;
import smarttv.Informacion;
import smarttv.SmartTv;
/**
 *
 * @author ibiet
 */
public class TVmain {
    public static void main(String[] args) {
        ArrayList<SmartTv> Television = new ArrayList<>();
        Television.add(new SmartTv("Samsung", "UN50AU7000FXZX", 102938, 50, new Informacion("México",70, 1, 14, 2023)));
        Television.add(new SmartTv("Sansui", "SMX32T1HN", 304981, 32, new Informacion("China",46, 2, 12, 2019)));
        Television.add(new SmartTv("JVC", "SI55UR", 809312, 55, new Informacion("México",80, 1, 15, 2022)));
    
    System.out.println(Television);
    }
    
}
