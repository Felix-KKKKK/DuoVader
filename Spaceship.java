package duovader;

import java.awt.image.BufferedImage;

/**
 *
 *Spaceship class extends Item class
 */

public class Spaceship extends Item {
    //private attributes
     private int bulletCount;
    private int lastShotTime;
    private int cooldown;
    private int score;
    private int life;
    private BufferedImage skin;
    
    
    /**
     * primary Constructor
     */
    public Spaceship(){
        x = 0; 
        y = 0;
        isActive = tru;
        lastShotTime = 0;
        cooldown = 15;
        skin = null;
        
    }
    
    /**
     * secondary constructor
     * @param startX
     * @param startY
     * @param skin 
     */
    public Spaceship(int startX, int startY, BufferedImage skin){
        this(); //chain
        x = startX;
        y = startY;
        this.skin = skin;
        
    }
    
    /**
     * move left movement method
     */
    public void moveLeft(){
        if(x>= leftmost position){
            x-= 5;
        }
        if(x>=rightmost position){
        x+=0;
    }
    }
    
    /**
     * move right movement method
     */
    public void moveRight(){
          if(x>= rightmost position){
            x+=0;
        }
        if(x>=leftmost position){
        x+=5;
    }
    }
    
    /**
     * releasebullet method
     */
    public Bullet releaseBullet(currentTime){
        Bullet b = null;
        if(bulletCount >0 && (currentTime - lastShotTime)>= cooldown){
            b = new Bullet(x-10,y);
            bulletCount -= 1;
            lastShotTime = currentTime;
                 
        }
        return b;
     
    }
    
    /**
     * add score method
     */
    public void addScore(){
        score += 100; // adds 100 points
        bulletCount += 1; //one bullet recovered
    }
    
    /**
     * when hit by alien
     */
    public void hitByAlien(){
        if(isAlive){
        life -= 1; //minus a life
        }
       
    }
    
    /**
     * isAlive method
     * @return 
     */
    public boolean isAlive(){
        if(life <= 0){ //if no life left
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * get score method
     * @return 
     */
    public int getScore(){
        return score;
    }
    
    /**
     * get bullet count method
     * @return 
     */
    public int getBulletCount(){
        return bulletCount;
    }
    
    /**
     * get life method
     * @return 
     */
    public int getLife(){
        return life;
    }
    
    /**
     * equals method
     * @param s
     * @return 
     */
    public boolean equals(Spaceship s){
        if(x == s.x && y == s.y && bulletCount == s.bulletCount
                && score == s.score&& life = s.life){
            return true;
        }else{
            return false;
        }
       
    }
    
    /**
     * clone method
     * @return 
     */
    public Spaceship clone(){
        Spaceship s = new Spaceship(x,y,skin);
        return s;
    }
    
    /**
     * set skin method
     * @param skin 
     */
    public void setSkin(BufferedImage skin){
        this.skin = skin;
    }
}
