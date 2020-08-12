package util.mapper;

import useful.mapper.Mapper;
import useful.mapper.MappingOption;
import useful.mapper.MappingRange;


/// TODO: 8/12/20 Good tests 
class MapperTest {

    @org.junit.jupiter.api.Test
    void map() {
        Mapper mapper = new Mapper(
                new MappingRange(0,10),
                new MappingRange(0, 100)
        );

        System.out.println(mapper.map(4));
    }

    @org.junit.jupiter.api.Test
    void mapAndRound() {
    }

    @org.junit.jupiter.api.Test
    void testMap() {
    }

    @org.junit.jupiter.api.Test
    void testMapAndRound() {
    }

    @org.junit.jupiter.api.Test
    void getMapFromStart() {
    }

    @org.junit.jupiter.api.Test
    void getMapFromEnd() {
    }

    @org.junit.jupiter.api.Test
    void getMapToStart() {
    }

    @org.junit.jupiter.api.Test
    void getMapToEnd() {
    }
}