package unit_Converter;

public class Length implements Converter {
	public void km_to_m(int km){
	  int metre=km*1000;
	  System.out.println(km+" kilometre"+"="+metre+" metre");
	}

	public void m_to_km(int m) {
		float kilometre=m/1000f;
		System.out.println(m+" metre"+"="+kilometre+" kilometre");
		
	}


	public void km_to_cm(int km) {
		int cm=km*100000;
		System.out.println(km+" kilometre"+"="+cm+" centimetre");
		
	}
	public void cm_to_km(int cm) {
		float km=cm/100000f;
		System.out.println(cm+" centimetre"+"="+km+" kilometre");
		
	}

	public void m_to_cm(int m) {
		int cm=m*1000;
		System.out.println(m+" metre"+"="+cm+" centimetre");
		
	}
	public void cm_to_m(int cm) {
		float m=cm/1000f;
		System.out.println(cm+" centimetre"+"="+m+" metre");
		
	}
}
