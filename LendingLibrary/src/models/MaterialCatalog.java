package models;

import java.util.Iterator;
import java.util.TreeMap;

public class MaterialCatalog {
	private TreeMap<String, Material> materialMap;
	
	public MaterialCatalog() {
		materialMap = new TreeMap<String, Material>();
	}
	
	public void addMaterial(Material newMaterial) {
		materialMap.put(newMaterial.getID(), newMaterial);
	}
	
	public TreeMap<String, Material> getMap(){
		return materialMap;
	}
	
	public Material findMaterial(String title) throws MaterialNotFoundException{
		Iterator<Material> findMaterial = materialMap.values().iterator();
		while(findMaterial.hasNext()) {
			if(findMaterial.next().getTitle().equalsIgnoreCase(title)) {
				return findMaterial.next();
			}
		}
		throw new MaterialNotFoundException();
	}
	
}
