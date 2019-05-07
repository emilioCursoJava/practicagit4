package es.vass.practica;


import java.net.MalformedURLException;

import java.net.URL;

import javax.swing.JFileChooser;

import javax.swing.JFrame;

public class Mediatest {

public static void main (String[] args) {

JFileChooser filechoser=new JFileChooser();

int resul=filechoser.showOpenDialog(null);

if(resul == JFileChooser.APPROVE_OPTION){

URL mediaURL=null;

try{
 mediaURL=filechoser.getSelectedFile().toURL();

} catch(MalformedURLException malforme){

System.err.println("Error no hay url");

}

if(mediaURL != null){

JFrame mediaTest=new JFrame("Media");

mediaTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Reproductor repo=new Reproductor(mediaURL);

mediaTest.add(repo);

mediaTest.setSize(300,300);

mediaTest.setVisible(true); }

}

}

public void metodoEmilioModificarIvan () {
	System.out.println("Ivan --- OK");
}


public void metodoEmilioModificarJose () {
	System.out.println("Jose ---");
}

public void metodoEmilioModificarDavid () {
	System.out.println("David ---");
}

}
