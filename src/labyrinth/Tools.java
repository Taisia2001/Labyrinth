/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

import java.util.HashMap;


/**
 *
 * @author User
 */
public class Tools {
    int coins;
    int level=1;
    String playerRout="/icons/woman.png";
    boolean onTime;
    Labyrinth main;
    boolean help1;
    boolean darkness;
    boolean help2=true;
    HashMap<String,Integer> players; 
    String player="player";
   
    public Tools(Labyrinth l) {
        players=new HashMap<>();
        main=l;
    }
    public void setPlayer(String s){
        
      if(players.containsKey(s)){
               coins=players.get(s);
               player=s;
                main.jLabel3.setText("COINS: "+coins);
               return;
           }
       
       players.put(s, 0);
       player=s;
       coins=0;
        main.jLabel3.setText("COINS: "+coins);
    }
    public void setCoins(int c){
        players.put(player, c);
        main.jLabel3.setText("COINS: "+c);
    }
    public void addWinner(){
          String time = main.g.timeLab.getText().substring(13);
        switch(level){
            case 1:{
             
                break;}
            case 2:{
                
                break;}
            default:{
           //  main.r.hardTable.add(player,time);
                     }}
    }
    
    
    
}
