import java.util.*;

public class BufferManager  extends BufferExt{

	public Map<Integer,String> bucket = new LinkedHashMap<Integer,String>();
	public ArrayList<int> ref = new ArrayList<int>();

	
	String ss;

	public BufferManager(){}

	void Inserir(String s){
		this.ss = s;
		String cs = null;

		String sk = Integer.toBynary(ss);

		String ler = null;
		try{
			FileReader fr = new FileReader("index.txt");
			BufferedReader br = new BufferedReader(fr);
			for (int i=0;i < k; i++){
				ler = br.readLine();
				//String decTobin = Integer.toBinaryString(i);
				this.bucket.put(i,ler);
				//System.out.println("binario e Dado:" + decTobin +" " + bCache.get(i)); 
				
				
			}
			

		}catch(IOException e){
			System.err.printf("Erro ao abrir arquivo %s.\n",e.getMessage());
		}
		for (j=0;j < bucket.length();j++) {
			if (bucket.get(j).equals("--2")) {
				cs = sk.substrig(sk.length()-2);
				if (bucket.get(j+1).equals(cs)) {

					
				}

		}
		
			
		}

		

		



	}

}