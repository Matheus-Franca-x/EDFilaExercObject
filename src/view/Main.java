package view;

import controllerFila.FilaInt;
import controllerFila.FilaObject;
import controllerFila.FilaString;

public class Main {

	public static void main(String[] args) 
	{
		
		FilaObject p = new FilaObject();
		
//		FilaInt i = new FilaInt();
		
//		FilaString s = new FilaString();
		
		p.insert(1);
		
//		i.insert(1);
		
//		s.insert("a");
		
		System.out.println(p.size());
//		System.out.println(i.size());
//		System.out.println(s.size());
		
	}

}
