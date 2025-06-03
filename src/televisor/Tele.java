
package televisor;

public class Tele {
    
    private int iCanal;
    private int iColor;
    private int iVolumen;
    
    public Tele(){
        iColor = 7;
    }
    
    public void subirCanal(){
        iCanal++;
        if(iCanal == 11){
            this.iCanal = 0;
        }
    }
    public void bajarCanal(){
        iCanal-=1;
        if(iCanal == -1){
            this.iCanal =10;
        }
    }
    public void subirColor(){
        iColor+=1;
        if(iColor == 8){
            iColor = 7;
        }
    }
    public void bajarColor(){
        iColor-=1;
        if(iColor == 0){
            iColor = 1;
        }
    }
    public void subirVolumen(){
        iVolumen+=1;
        if(iVolumen == 16){
            iVolumen = 15;
        }
    }
    public void bajarVolumen(){
        iVolumen-=1;
        if(iVolumen == -1){
            iVolumen=0;
        }
    }
    public void getCanal(){
        System.out.println("Canal: "+iCanal);
    }
    public void getColor(){
        System.out.println("Color: "+iColor);
    }
    public void getVolumen(){
        System.out.println("Volumen: "+iVolumen);
    }
}
