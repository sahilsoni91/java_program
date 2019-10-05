import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
/*
* Applet can either run by browser or appletviewer application.
* Define <applet> tag within comments as given below to speed up the testing.
*/
//<APPLET Code="Seventeen.class" Width="100" Height="100">
//</APPLET>
class Seventeen extends Applet
{
	Label l1,l2,l3,l4,l5;   
	public void init() 
	{
		super.init();	//init method is called first.
				// It is used to initialize variables and called only once.
		l1=new Label("INSIDE init()");
		add(l1);
	}
	public void start() 
	{
		super.start();	//start method is the second method to be called. start method is
				//called every time the applet has been stopped.
		l2=new Label("INSIDE Start()");
		add(l2);
	}
	public void stop() 
	{
		super.stop();	//stop method is called when the the user navigates away from
				// html page containing the applet.
		l3=new Label("INSIDE stop()");
		add(l3);
	}
	public void paint(Graphics g) 
	{
		super.paint(g);	//paint method is called every time applet has to redraw its output.
		l4=new Label("INSIDE paint()");
		add(l4);
	}
	public void destroy()
	{
		super.destroy();	//destroy method is called when browser completely removes
				//the applet from memeory. It should free any resources initialized
				//during the init method.
	}
}