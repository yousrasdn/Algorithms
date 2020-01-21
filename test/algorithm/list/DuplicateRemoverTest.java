package algorithm.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateRemoverTest {

    @Test
    void removeDuplicates() {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.add(1);
        duplicateRemover.add(2);
        duplicateRemover.add(1);
        duplicateRemover.add(3);
        duplicateRemover.add(4);
        duplicateRemover.add(3);
        duplicateRemover.add(1);

        assertEquals(7, duplicateRemover.size());

        duplicateRemover.removeDuplicates();
        assertEquals(4, duplicateRemover.size());
    }
}
