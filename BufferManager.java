import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferManager  extends BufferExt{

	public Map<Integer,String> bucket = new LinkedHashMap<Integer,String>();
	//public ArrayList<int> ref = new ArrayList<int>();
	String ss = null;

	public BufferManager(){}

	void Inserir(String s){
		this.ss = s;
		String cs = null;
		String verifyProf  = null;

		String sk = Integer.toBinaryString(ss);

		String ler = null;
		try{
			FileReader fr = new FileReader("index.txt");
			BufferedReader br = new BufferedReader(fr);
			for (int i=0;i < sk.length(); i++){
				ler = br.readLine();
				//String decTobin = Integer.toBinaryString(i);
				this.bucket.put(i,ler);
				//System.out.println("binario e Dado:" + decTobin +" " + bCache.get(i)); 
			}
			
			verifyProf = bucket.get(0);
		}catch(IOException e){
			System.err.printf("Erro ao abrir arquivo %s.\n",e.getMessage());
		}
			
		for (int j=0;j < bucket.size();j++) {
			if (bucket.get(j).equals(verifyProf)) {
				cs = sk.substring(sk.length()-2);
				if (bucket.get(j+1).equals(cs)) {

					
				}

		}
		
			
		}


	}

}