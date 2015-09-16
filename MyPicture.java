//import java.util.Random;
import java.util.*;

/**
 * 
 * @author:  David Gillogly 
 * @version 1.0  
 */
public class MyPicture
{
    //add your fields here and REMOVE THIS COMMENT
    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture(int scale)
    {
        Canvas canvas = Canvas.getCanvas();         
        int windowWidth = canvas.getWidth();// the width of the canvas window
        int windowHeight = canvas.getHeight();// the height of the canvas window
        
        // 
        char[] hello; 
        hello = new char[26];
        hello = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        ArrayList sky = new ArrayList();
        
        for (int char3 = 0; char3 <= 2; char3++) {
            for (int char2 = 0; char2 <= 25; char2++) {
                for (int char1 = 0; char1 <= 25; char1++) {
                    sky.add("" + hello[char1] + hello[char2] + hello[char3]);
                }
            }
        }
        
        //System.out.println(sky);
        
        
        
        for (int i = 0; i < sky.size(); i+=1) {
            Circle sky[i] = new Circle();
        } 
        
        //Circle grass = new Circle();
        //grass.makeVisible();
         
        /*
        for (int i = 0; i < 200; i+=10) {
            grass.moveHorizontal(i);
            //Random.nextInt(15)
            grass.changeSize(scale);
            grass.makeVisible();
        } */
        
        
    }
}
