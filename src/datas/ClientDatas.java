package datas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import beans.Client;

public class ClientDatas {
	private static Map<String,Client> clients;
	
	private static Map<String,Client>  getClientMap(){
		if (clients == null)
			clients = new HashMap<String,Client>();
		return clients;
	}
	
	public static void addClient (Client client){
		getClientMap().put(client.getCode(), client);
	}
	
	public static void getClient(String code){
		getClientMap().get(code);
	}
	
	public static List<Client> getAllClients(){
		List<Client> clis = new ArrayList<Client>();
		Iterator<Entry<String, Client>> cliIterator = getClientMap().entrySet().iterator();
		while(cliIterator.hasNext() ){
			clis.add((Client)cliIterator.next());
		}
		return clis;
	}
	
	public static int count(){
		return getClientMap().size();
	}
	
	

}
