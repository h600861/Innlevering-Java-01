package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 
{

	public static void main(String[] args)
	{
	
		String talltxt = showInputDialog("gi opp et tall");
		int n = Integer.parseInt(talltxt);
		int t=1;
	
		if (n>=0) 
		{
			for (int i = 1; i<=n; i++) 
			{
				
				t = t*i; 
			
				
			}
			showMessageDialog(null,t);
		}
	
		
		else 
		{
			showMessageDialog(null,"trenger et godkjent tall");
		}
			
		
	}

}

