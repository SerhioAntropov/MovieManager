import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void ShouldFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] actual = manager.findAll();
        String[] expected = {"First", "Second", "Third"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastByLimit() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");
        manager.add("f11");
        manager.add("f12");

        String[] actual = manager.findLast();
        String[] expected = {
                "f12",
                "f11",
                "f10",
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");

        String[] actual = manager.findLast();
        String[] expected = {
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",
                "f2",
                "f1",
        };

        assertArrayEquals(expected, actual);
    }


}
