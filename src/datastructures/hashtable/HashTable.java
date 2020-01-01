package datastructures.hashtable;

public class HashTable {

    private final int HASH_ARRAY_SIZE = 10;
    private HashEntry[] data;

    private static class HashEntry {
        private String key;
        private String value;
        private HashEntry next;

        private HashEntry(final String key, final String value, final HashEntry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public HashTable() {
        this.data = new HashEntry[HASH_ARRAY_SIZE];
    }
    public void put(final String key, final String value) {
        // get the key index
        final int index = getIndexForKey(key);

        // create an new entry
        HashEntry newEntry = new HashEntry(key, value, null);

        // if the key does exist, add it
        if(data[index] == null) {
            data[index] = newEntry;
            return;
        }

        // else {the key exists}: append the new entry at the end of the entries
        HashEntry keyEntries = data[index];
        while (keyEntries.next != null) {
            keyEntries = keyEntries.next;
        }

        keyEntries.next = newEntry;
    }

    public String get(final String key) {
        final int keyIndex = getIndexForKey(key);

        HashEntry entries = data[keyIndex];

        if(entries == null) {
            return null;
        }

        while (!entries.key.equals(key) && entries.next != null) {
            entries = entries.next;
        }

        if (entries.key.equals(key)) {
            return entries.value;
        }

        return null;
    }

    private int getIndexForKey(final String key) {
        // get the hash code corresponding to the given key
        final int hashCode = key.hashCode();

        // convert the hashcode to an index
        int index = (hashCode & 0x7fffffff) % HASH_ARRAY_SIZE;

        return index;
    }
}
