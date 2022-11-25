package collectionFramework;

import java.util.HashSet;
import java.util.Set;

class Player implements Comparable<Player>{
	private int id;
	private String isim;
	
	public Player(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	}

	@Override
	public String toString() {
		
		return "|||| ID: " + id + " İsim :" + isim + " |||| ";
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}

	@Override
	public int compareTo(Player player) {
		
		if ( this.id < player.id )
		{
			return -1;
		}
		else if( this.id > player.id )
		{
			return 1;
		}
		else
			return 0;
	}

}

public class HashCodeveEquals {

	public static void main(String[] args) {
		
		Set<Player> hashSet = new HashSet<Player>();

		Player player1 = new Player(1, "Furkan");
		Player player2 = new Player(2, "Mehmet");
		Player player3 = new Player(3, "Rümeysa");
		Player player4 = new Player(1, "Furkan");
		
		hashSet.add(player1);
		hashSet.add(player2);
		hashSet.add(player3);
		hashSet.add(player4);
		
		for ( Player p : hashSet )
		{
			System.out.println(p);
		}
		
	}

}
