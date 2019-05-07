package es.vass.practica;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;

import javax.media.*;
import javax.swing.JPanel;

public class Reproductor extends JPanel
{

public Reproductor(URL mediaURL) 
{

	setLayout(new BorderLayout());
	
	Manager.setHint(Manager.LIGHTWEIGHT_RENDERER,true);
	
	try{
	
		Player mediaPlayer=Manager.createRealizedPlayer(mediaURL);
		
		Component video= mediaPlayer.getVisualComponent(); 
		Component controls=mediaPlayer.getControlPanelComponent();
		
		if(video!= null)
		{
			 add(video,BorderLayout.CENTER); 
		}
		
		if(controls!=null)
		{
		 add(controls,BorderLayout.SOUTH); }
		
		mediaPlayer.start();
	
		}
	catch(NoPlayerException noplayerexception)
	{
	
		System.out.println("no hay archivo"); 
	}
	
	catch(CannotRealizeException noreleace)
	{
	
		System.out.println("archivo desconocido");
	 }
	
	catch(IOException es)
	{
	
		System.out.println("Error al leer la fuente");
	}
}

public void metodoEmilioModificarJuan () {
	System.out.println("Juan ---");
}


public void metodoEmilioModificarHansel () {
	System.out.println("Hansel --- ");
}

public void metodoEmilioModificarEdgar () {
	System.out.println("Edgar ---");
}


}
