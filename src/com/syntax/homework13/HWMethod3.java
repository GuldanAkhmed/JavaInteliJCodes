package com.syntax.homework13;

public class HWMethod3 {
	void wave(String country) {
        String language;
        switch(country) {
        case"USA":
            language="Hi";
            break;
        case"Mexico":
            language="Hola";
            break;
        case"Turkey":
            language="Merhaba";
            break;
            default:
                language="unknown";
        }
        System.out.println(language);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HWMethod3 input=new HWMethod3();
	        input.wave("Turkey");
	    }
	}


