package cpsc372.f8l.shared;

import java.util.ArrayList;

public class Game {
	ArrayList<Empire> empires;
	ArrayList<Weapon> weaponTypes;
	ArrayList<ShipType> shipTypes;
	ArrayList<Base> bases;
	ArrayList<Ship> ships;
	ArrayList<Player> players;
	
	int starDate;
	String name;
	
	public Game (String name, int starDate) {
		this.name = name;
		this.starDate = starDate;
		empires = new ArrayList<Empire>();
		weaponTypes = new ArrayList<Weapon>();
		shipTypes = new ArrayList<ShipType>();
		bases = new ArrayList<Base>();
		ships = new ArrayList<Ship>();
		players = new ArrayList<Player>();
	}
	
	public Ship[] getShipsByEmpire(Empire e) {
		ArrayList<Ship> sbe = new ArrayList<Ship>();
		for (Ship s: ships) {
			if(s.getType().getEmpire().getId().equals(e.getId())) {
				sbe.add(s);
			}
		}
		return (Ship[]) sbe.toArray();
	}

	
	public Empire findEmpire(String id){
		for (Empire e: empires)
			if(e.getId().equals(id))
				return e;
		return null;
	}
	
	public ShipType findShipType(String id){
		for (ShipType st: shipTypes)
			if(st.getId().equals(id))
				return st;
		return null;
	}
	
	public Weapon findWeaponType(String id){
		for (Weapon w: weaponTypes)
			if(w.getId().equals(id))
				return w;
		return null;
	}
	
	public Ship findShip(int id){
		for (Ship s: ships)
			if(s.getId() == id)
				return s;
		return null;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public int getStarDate() {
		return starDate;
	}
	

	public ArrayList<Empire> getEmpires() {
		return empires;
	}


	public ArrayList<Weapon> getWeaponTypes() {
		return weaponTypes;
	}


	public ArrayList<ShipType> getShipTypes() {
		return shipTypes;
	}


	public ArrayList<Base> getBases() {
		return bases;
	}


	public ArrayList<Ship> getShips() {
		return ships;
	}


	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	
}
