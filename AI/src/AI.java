import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;

public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas
{

	/*
	����������
	�﷨���������� �������ƣ���ʶ����;
	*/
	Image img,img1,currentImg;
	public MainCanvas(){
		try
		{
			/*
			��������ֵ
			�﷨����������=value;
			*/
			img=Image.createImage("/sayo10.png");
			img1=Image.createImage("/sayo12.png");
			currentImg=img;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void paint(Graphics g){
		g.setColor(0,0,0);
		g.fillRect(0,0,getWidth(),getHeight());
		g.drawImage(currentImg,120,100,0);//120��X���ꡢ100��Y����
	}
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);
		/*
		action��ֵ��UP��DOWN��LEFT��RIGHT
		*/
		if(action==LEFT){
			/*
			ʵ��ת�����
			*/
			/*
			���������¸�ֵ����
			*/
			currentImg=img1;
			System.out.println("����ת");
			repaint();
		}
	}
}