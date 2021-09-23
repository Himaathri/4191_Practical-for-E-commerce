 package lk.ac.vau.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import lk.ac.vau.Model.PrimaryId;

public class Repo<K,V extends PrimaryId<K>>{
	//Store values in generic map
	Map<K, V> map=new HashMap<K, V>();
	//Get all values
	public Collection<V> getAll(){
		return map.values();
	}
	//Get one value
	public V get(K id) {
		return map.get(id);
	}
	//add one value
	public void add(V ele)
	{
		 map.put(ele.getId(), ele);
	}
	//update
	//put can be used for adding nd update.if else is not there it will add or update
	public void update(K id,V ele)
	{
		 map.put(id, ele);
	}
	//delete

	public void delete(K id)
	{
		 map.remove(id);
	}
	
}
