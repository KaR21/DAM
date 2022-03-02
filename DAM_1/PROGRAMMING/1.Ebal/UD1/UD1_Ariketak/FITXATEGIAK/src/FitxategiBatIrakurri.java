/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
import java.io.FileReader;
import java.io.BufferedReader;

public class FitxategiBatIrakurri {
    public static void main(String[] args){
        String name;
        try{
            FileReader ireki = new FileReader("hitzak.txt");
            BufferedReader info=new BufferedReader(ireki);
            while((name=info.readLine())!=null)
            {
                System.out.println(name);
            }
        }
        catch(Exception e)
        {
            System.out.println("Irakurtzean errorea");
        }
    }
}
