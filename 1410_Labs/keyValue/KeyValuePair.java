package keyValue;

public class KeyValuePair<K extends Comparable<K>, V> implements Comparable<KeyValuePair<K, V>> {

	private K key;
	private V value;
	


	/**
	 * @param key
	 * @param value
	 */
	public KeyValuePair(K key, V value) {
		
	this.key = key;
	this.value = value;
	
	}



	/**
	 * @return the key
	 */
	public K getKey() {
		
		return key;
		
	}



	/**
	 * @return the value
	 */
	public V getValue() {
		
		return value;
		
	}


	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		KeyValuePair other = (KeyValuePair) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
		
	}

	@Override
	public String toString() {
		
		return "(" + key + ", " + value + ")";
		
	}



	@Override
	public int compareTo(KeyValuePair<K, V> o) {
		
		
		return this.key.compareTo(o.key);
		
	}
	
}
