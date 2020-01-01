package datastructures.hashtable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashTableTest {

    private HashTable hashTable;

    @BeforeEach
    void SetUp() {
        hashTable = new HashTable();
    }

    @Test
    void putAndGet() {
        hashTable.put("Test Aee", "123-7412");
        hashTable.put("Best Bee", "123-9523");
        hashTable.put("Store Dee", "123-4236");
        hashTable.put("Thanks Eee", "514-1579");
        hashTable.put("Boil Fee", "438-3548");

        assertEquals("123-7412", hashTable.get("Test Aee"));
        assertEquals("123-9523", hashTable.get("Best Bee"));
        assertEquals("123-4236", hashTable.get("Store Dee"));
        assertEquals("514-1579", hashTable.get("Thanks Eee"));
        assertEquals("438-3548", hashTable.get("Boil Fee"));
        assertEquals(null, hashTable.get("Key Not Found"));

        hashTable.toString();
    }
}
