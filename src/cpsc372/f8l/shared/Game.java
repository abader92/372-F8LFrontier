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
	
	Game (String name, int starDate) {
		this.name = name;
		this.starDate = starDate;
		empires = new ArrayList<Empire>();
		weaponTypes = new ArrayList<Weapon>();
		shipTypes = new ArrayList<ShipType>();
		bases = new ArrayList<Base>();
		ships = new ArrayList<Ship>();
		players = new ArrayList<Player>();
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
