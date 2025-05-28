package duovader;

import java.awt.image.BufferedImage;

/**
 *
 *Spaceship class extends Item class
 */
public class Spaceship extends Item {
     private int bulletCount;
    private int lastShotTime;
    private int cooldown;
    private int score;
    private int life;
    private BufferedImage skin;
    
    public Spaceship(){
        x = 0;
        y = 0;
        isActive = tru;
        lastShotTime = 0;
        cooldown = 15;
        skin = null;
        
    }
    
    public Spaceship(int startX, int startY, BufferedImage skin){
        this();
        x = startX;
        y = startY;
        this.skin = skin;
        
    }
    
    public void moveLeft(){
        if(x>= leftmost position){
            x-= 5;
        }
        if(x>=rightmost position){
        x+=0;
    }
    }
    
    public void moveRight(){
          if(x>= rightmost position){
            x+=0;
        }
        if(x>=leftmost position){
        x+=5;
    }
    }
    
    public Bullet releaseBullet(currentTime){
        Bullet b = null;
        if(bulletCount >0 && (currentTime - lastShotTime)>= cooldown){
            b = new Bullet(x-10,y);
            bulletCount -= 1;
            lastShotTime = currentTime;
                 
        }
        return b;
     
    }
    
    public void addScore(){
        score += 100;
        bulletCount += 1;
    }
    
    public void hitByAlien(){
        life -= 1;
    }
    
    public boolean isAlive(){
        if(life <= 0){
            return false;
        }else{
            return true;
        }
    }
    
    public int getScore(){
        return score;
    }
    
    public int getBulletCount(){
        return bulletCount;
    }
    
    public int getLife(){
        return life;
    }
    
    public boolean equals(Spaceship s){
        if(x == s.x && y == s.y && bulletCount == s.bulletCount
                && score == s.score&& life = s.life){
            return true;
        }else{
            return false;
        }
       
    }
    
    public Spaceship clone(){
        Spaceship s = new Spaceship(x,y,skin);
        return s;
    }
    
    public void setSkin(BufferedImage skin){
        this.skin = skin;
    }
}
