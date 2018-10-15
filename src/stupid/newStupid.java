package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class newStupid {
	
    public static void main(String[] arg) {
        int valueOfHola=hola(arg);
		System.exit(valueOfHola);
		}
		
    public static int hola(String arrayStr[]) {
        try{
			if(arrayStr.length != 2) return -1;
			
			String str_1,str_2= new String(Files.readAllBytes(Paths.get(arrayStr[1]))); 
            str_1= new String(Files.readAllBytes(Paths.get(arrayStr[0])));
            int lengthOfStr_1 = str_1.length();
			
            if(lengthOfStr_1<4)
				return-2;
			
			int count_1=0;
			float count_2=0;
			
            for(int i=0;i<lengthOfStr_1-3;i++) {
				for(int j=0;j<str_2.length()-4;j+=1) {
					int index = 0;
					
                    for(int valueOfHola=0;valueOfHola<4;valueOfHola++){
                        if(str_1.charAt(i+valueOfHola) == str_2.charAt(j+valueOfHola))
						    index ++;
                    }
					
					if (index == 4){
                        System.out.println("DEBUG:".concat(String.valueOf(i) + "," + String.valueOf(j)));
                        count_1++; count_2+=1;
					}else ++count_1;
			    }
			}
			
            System.out.println(String.valueOf(Math.round(count_2)).concat("/")
                                              + String.valueOf(count_1));
			return 1;
			} catch(IOException ex){
				System.out.println("DEBUG:Error");
				return -3;
		      }
	}
}
