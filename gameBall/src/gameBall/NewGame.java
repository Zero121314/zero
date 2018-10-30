package gameBall;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.Annotation;
import java.util.Scanner;

import javax.imageio.ImageIO;

import pkg2dgamesframework.AFrameOnImage;
import pkg2dgamesframework.Animation;
import pkg2dgamesframework.GameScreen;

public class NewGame extends GameScreen{
	 public NewGame() {
		super(500,300);
		
		BeginGame();
	}
	 public static void main(String[] args) {
		new NewGame();
	}
	@Override
	public void GAME_UPDATE(long deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GAME_PAINT(Graphics2D g2) {
		//C:\Users\asus\Desktop\Assets\bird_sprite.png
		try {
			BufferedImage image = ImageIO.read(new File("C:\\Users\\asus\\Desktop\\xxx.png"));
			g2.drawImage(image, 0, 0, 180, 60, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void KEY_ACTION(KeyEvent e, int Event) {
		// TODO Auto-generated method stub
		
	}
	
	
}
