/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksikondisi;

/**
 *
 * @author Alhuzwiri
 */

public class Seleksikondisi {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    String paras ="Cantik";
    String Pintar ="Cerdas" ;
    char kategori='A';
    String out;
    int umur=26;
        if(umur<=23){
            
               kategori='A';
        
        }
        else if(umur>=23){
            kategori='B';
        }
        else{
            kategori='C';
        }
        
        if(kategori=='A'&& paras=="Cantik" && Pintar=="Cerdas"){
               out="Pasti Mau"; 
        }
        else if((Pintar=="Enggak" || (paras=="Cantik" && kategori=='A' ))){
                out="Ok lah";
        }
        
        else if( (paras=="Cantik" && kategori=='B')||Pintar=="Enggak"){
               out="Saya pikir dulu";
        }
        else {
                out="No way";
        
        }
       
        System.out.println(" "+out);    
    
    }
    
    
}
