package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class O1 
{

	public static void main(String[] args)
	{
		String bruttolonntxt = showInputDialog("bruttolønn");
		
		double bruttolonn = Double.parseDouble(bruttolonntxt);
		double prosent = 0;

		if (bruttolonn>164000 && bruttolonn<230950) 
		{
			prosent=0.93;
			showMessageDialog(null, "Prosent " + prosent + " " + "Bruttoinntekt " + bruttolonn*prosent);
		} 
		
		else if (bruttolonn>230951 && bruttolonn<580650) 
		{
			prosent=2.41;
			showMessageDialog(null, "Prosent " + prosent + " " + "Bruttoinntekt " + bruttolonn*prosent);
		} 
		else if (bruttolonn>580651 && bruttolonn<934050) 
		{
			prosent=11.52;
			showMessageDialog(null, "Prosent " + prosent + " " + "Bruttoinntekt " + bruttolonn*prosent);
		} 
		else if (bruttolonn>934052) 
		{
			prosent=14.52;
			showMessageDialog(null, "Prosent " + prosent + " " + "Bruttoinntekt " + bruttolonn*prosent);
		} 
		else 
		{
			showMessageDialog (null, "prosent=0");
		} 
		
	}

}
