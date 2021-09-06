package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class O2 
{

	public static void main(String[] args)
	{
		
		
		
		for (double i = 1; i <= 10; i++) 
		{
			
			String poengsumtxt = showInputDialog("poengsum");
		
		double poengsum = Double.parseDouble(poengsumtxt);
		

			if(poengsum>=0 && poengsum<100)
			{
		
			if (poengsum>0 && poengsum<39) 
			{
			
				System.out.println("karakter F"+ " " + "Poengsummen din er" + " "+ poengsum);
			} 	
		
			else if (poengsum>40 && poengsum<49) 
			{
			
				System.out.println("karakter E"+ " " + "Poengsummen din er" + " "+ poengsum);
			} 
			else if (poengsum>50 && poengsum<59) 
			{
			
				System.out.println("karakter D"+ " " + "Poengsummen din er" + " "+ poengsum);
			} 
			else if (poengsum>60 && poengsum<79) 
			{
			
				System.out.println("karakter C"+ " " + "Poengsummen din er" + " "+ poengsum);
			} 
			else if (poengsum>80 && poengsum<89) 
			{
			
				System.out.println("karakter B" + " " + "Poengsummen din er" + " "+ poengsum);
			}
			else if (poengsum>90 && poengsum<100) 
			{
			
				System.out.println("karakter A" + " " + "Poengsummen din er" + " "+ poengsum);	
			}
			}
			else {
				showMessageDialog(null, "ikke gyldig poengsum, prøv på nytt");
				i--;
			}
		}
	}
}