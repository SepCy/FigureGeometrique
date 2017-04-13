/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuregeometrique;



public class FigureGeometrique {
    
    
    
    public class Carre{
       
    public  double longueur;
    private  double largeur;   
        
        
        
        
        public Carre(double Long, double larg){
        
        this.longueur = Long;
        this.largeur = larg;
        
        
    }
        
        
        public double Surface(double Long, double larg){
            return(Long*larg);
            
            
            
        }        
    
    public double getLongueur(){
        
        return longueur ;
    }
    
    }

    
    public static void main(String[] args) {
     
    Implementation im = new Implementation();
    im.method();
        
        
    Segment sg = new Segment(4);
    sg.getClass();   
    
        
        
        
        
        
    }
    
}
