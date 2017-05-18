import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LerDoArq{
	public Map<Integer,String> bCache = new LinkedHashMap<Integer,String>();
	int global = 2;
	//int s = ~ 1;
	//int d = s << 3;
	//String decTobin;

	public LerDoArq(){}

	public void addToBuffer(int k){
		String ler = null;
		try{
			FileReader fr = new FileReader("rico2290.txt");
			BufferedReader br = new BufferedReader(fr);
			for (int i=0;i < k; i++){
				ler = br.readLine();
				String decTobin = Integer.toBinaryString(i);
				
				//System.out.println(Integer.toBinaryString(d & 0xFF));
				//decTobin.substring(,2);
				this.bCache.put(i,ler);
				System.out.println("binario e Dado:" + decTobin +" " + bCache.get(i)); 
				
				
			}
			//global++;

		}catch(IOException e){
			System.err.printf("Erro ao abrir arquivo %s.\n",e.getMessage());
		}
	}
}